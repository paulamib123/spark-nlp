---
layout: model
title: English finetuned_sentence_itr0_2e_05_webdiscourse_01_03_2022_13_17_55 DistilBertForSequenceClassification from ali2066
author: John Snow Labs
name: finetuned_sentence_itr0_2e_05_webdiscourse_01_03_2022_13_17_55
date: 2023-12-19
tags: [bert, en, open_source, sequence_classification, onnx]
task: Text Classification
language: en
edition: Spark NLP 5.2.1
spark_version: 3.0
supported: true
engine: onnx
annotator: DistilBertForSequenceClassification
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained DistilBertForSequenceClassification model, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`finetuned_sentence_itr0_2e_05_webdiscourse_01_03_2022_13_17_55` is a English model originally trained by ali2066.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/finetuned_sentence_itr0_2e_05_webdiscourse_01_03_2022_13_17_55_en_5.2.1_3.0_1702976448412.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/finetuned_sentence_itr0_2e_05_webdiscourse_01_03_2022_13_17_55_en_5.2.1_3.0_1702976448412.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

document_assembler = DocumentAssembler()\
    .setInputCol("text")\
    .setOutputCol("document")

tokenizer = Tokenizer()\
    .setInputCols("document")\
    .setOutputCol("token")  
    
sequenceClassifier = DistilBertForSequenceClassification.pretrained("finetuned_sentence_itr0_2e_05_webdiscourse_01_03_2022_13_17_55","en")\
            .setInputCols(["document","token"])\
            .setOutputCol("class")

pipeline = Pipeline().setStages([document_assembler, tokenizer, sequenceClassifier])

data = spark.createDataFrame([["PUT YOUR STRING HERE"]]).toDF("text")

result = pipeline.fit(data).transform(data)

```
```scala

val document_assembler = new DocumentAssembler()
    .setInputCol("text")
    .setOutputCol("document")

val tokenizer = new Tokenizer()
    .setInputCols("document") 
    .setOutputCol("token")  
    
val sequenceClassifier = DistilBertForSequenceClassification.pretrained("finetuned_sentence_itr0_2e_05_webdiscourse_01_03_2022_13_17_55","en")
            .setInputCols(Array("document","token"))
            .setOutputCol("class")

val pipeline = new Pipeline().setStages(Array(documentAssembler, tokenizer, sequenceClassifier))

val data = Seq("PUT YOUR STRING HERE").toDS.toDF("text")

val result = pipeline.fit(data).transform(data)


```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|finetuned_sentence_itr0_2e_05_webdiscourse_01_03_2022_13_17_55|
|Compatibility:|Spark NLP 5.2.1+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[documents, token]|
|Output Labels:|[class]|
|Language:|en|
|Size:|249.4 MB|

## References

https://huggingface.co/ali2066/finetuned_sentence_itr0_2e-05_webDiscourse_01_03_2022-13_17_55