/*
 * Copyright 2017-2025 John Snow Labs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.johnsnowlabs.reader

import com.johnsnowlabs.nlp.util.io.ResourceHelper
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions.udf

import scala.collection.mutable

class TextReader(titleLengthSize: Int = 50, storeContent: Boolean = false) extends Serializable {

  private val spark = ResourceHelper.spark
  import spark.implicits._

  /** Parses TXT files and returns a DataFrame.
    *
    * The DataFrame will contain:
    *   - "path": the file path,
    *   - "content": the raw text content,
    *   - "txt": a Seq[HTMLElement] containing the parsed elements.
    */
  def txt(filePath: String): DataFrame = {
    if (ResourceHelper.validFile(filePath)) {
      val textFilesRDD = spark.sparkContext.wholeTextFiles(filePath)
      val textDf = textFilesRDD
        .toDF("path", "content")
        .withColumn("txt", parseTxtUDF($"content"))
      if (storeContent) textDf.select("path", "txt", "content") else textDf.select("path", "txt")
    } else {
      throw new IllegalArgumentException(s"Invalid filePath: $filePath")
    }
  }

  private val parseTxtUDF = udf((text: String) => parseTxt(text))

  /** Parses the given text into a sequence of HTMLElements.
    *
    * Parsing logic:
    *   - Split the text into blocks using a delimiter of two or more consecutive newlines.
    *   - Using heuristics, consider a block a title if it is all uppercase and short.
    *   - If a block is a title candidate and the following block exists and is not a title
    *     candidate, treat the first as the Title and the second as its NarrativeText.
    *   - Otherwise, treat blocks as narrative text.
    *   - Omit any element with empty content.
    */
  private def parseTxt(text: String): Seq[HTMLElement] = {
    val blocks = text.split("\\n\\n+").map(_.trim).filter(_.nonEmpty)
    val elements = mutable.ArrayBuffer[HTMLElement]()
    var i = 0
    while (i < blocks.length) {
      val currentBlock = blocks(i)
      if (isTitleCandidate(currentBlock)) {
        elements += HTMLElement(
          "Title",
          currentBlock,
          mutable.Map("paragraph" -> (i / 2).toString))
        if (i + 1 < blocks.length && !isTitleCandidate(blocks(i + 1))) {
          val narrative = blocks(i + 1)
          if (narrative.nonEmpty) {
            elements += HTMLElement(
              "NarrativeText",
              narrative,
              mutable.Map("paragraph" -> (i / 2).toString))
          }
          i += 2
        } else {
          i += 1
        }
      } else {
        elements += HTMLElement(
          "NarrativeText",
          currentBlock,
          mutable.Map("paragraph" -> (i / 2).toString))
        i += 1
      }
    }
    elements
  }

  /** Heuristic function to determine if a given line/block is a title candidate.
    *
    * Currently, we consider a block a title candidate if:
    *   - It is non-empty.
    *   - It consists mostly of uppercase letters (ignoring non-letter characters).
    *   - It is relatively short (e.g., 50 characters or fewer).
    */
  private def isTitleCandidate(text: String): Boolean = {
    val trimmed = text.trim
    if (trimmed.isEmpty) return false
    val isAllUpper = trimmed.forall(c => !c.isLetter || c.isUpper)
    val isTitleCase = trimmed.split("\\s+").forall(word => word.headOption.exists(_.isUpper))
    val isShort = trimmed.length <= titleLengthSize
    val hasLetters = trimmed.exists(_.isLetter)
    (isAllUpper || isTitleCase) && isShort && hasLetters
  }

}
