---
layout: model
title: Indonesian indo_gpt2_small GPT2Transformer from w11wo
author: John Snow Labs
name: indo_gpt2_small
date: 2025-02-04
tags: [id, open_source, onnx, text_generation, gpt2]
task: [Question Answering, Summarization, Translation, Text Generation]
language: id
edition: Spark NLP 5.5.1
spark_version: 3.0
supported: true
engine: onnx
annotator: GPT2Transformer
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained GPT2Transformer model, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`indo_gpt2_small` is a Indonesian model originally trained by w11wo.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/indo_gpt2_small_id_5.5.1_3.0_1738648064530.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/indo_gpt2_small_id_5.5.1_3.0_1738648064530.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python
 
documentAssembler = DocumentAssembler() \
      .setInputCol("text") \
      .setOutputCol("document")

seq2seq = GPT2Transformer.pretrained("indo_gpt2_small","id") \
      .setInputCols(["documents"]) \
      .setOutputCol("generation")       
        
pipeline = Pipeline().setStages([documentAssembler, seq2seq])
data = spark.createDataFrame([["I love spark-nlp"]]).toDF("text")
pipelineModel = pipeline.fit(data)
pipelineDF = pipelineModel.transform(data)

```
```scala

val documentAssembler = new DocumentAssembler() 
    .setInputCol("text") 
    .setOutputCol("document")
    
val seq2seq = GPT2Transformer.pretrained("indo_gpt2_small","id") 
    .setInputCols(Array("documents")) 
    .setOutputCol("generation")

val pipeline = new Pipeline().setStages(Array(documentAssembler, seq2seq))
val data = Seq("I love spark-nlp").toDF("text")
val pipelineModel = pipeline.fit(data)
val pipelineDF = pipelineModel.transform(data)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|indo_gpt2_small|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[document]|
|Output Labels:|[generation]|
|Language:|id|
|Size:|299.2 MB|

## References

https://huggingface.co/w11wo/indo-gpt2-small