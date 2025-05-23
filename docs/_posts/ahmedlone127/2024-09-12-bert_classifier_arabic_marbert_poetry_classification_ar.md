---
layout: model
title: Arabic BertForSequenceClassification Cased model (from Ammar-alhaj-ali)
author: John Snow Labs
name: bert_classifier_arabic_marbert_poetry_classification
date: 2024-09-12
tags: [ar, open_source, bert, sequence_classification, classification, onnx]
task: Text Classification
language: ar
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
engine: onnx
annotator: BertForSequenceClassification
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained BertForSequenceClassification model, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP. `arabic-MARBERT-poetry-classification` is a Arabic model originally trained by `Ammar-alhaj-ali`.

## Predicted Entities

`المنسرح`, `السلسلة`, `المضارع`, `موشح`, `البسيط`, `السريع`, `الرمل`, `المجتث`, `المتدارك`, `الطويل`, `المتقارب`, `الخفيف`, `عامي`, `المواليا`, `الهزج`, `الكامل`, `الوافر`, `شعر التفعيلة`, `شعر حر`, `المقتضب`, `الدوبيت`, `المديد`, `الرجز`

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/bert_classifier_arabic_marbert_poetry_classification_ar_5.5.0_3.0_1726123171704.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/bert_classifier_arabic_marbert_poetry_classification_ar_5.5.0_3.0_1726123171704.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python
documentAssembler = DocumentAssembler() \
    .setInputCol("text") \
    .setOutputCol("document")

tokenizer = Tokenizer() \
    .setInputCols("document") \
    .setOutputCol("token")

seq_classifier = BertForSequenceClassification.pretrained("bert_classifier_arabic_marbert_poetry_classification","ar") \
    .setInputCols(["document", "token"]) \
    .setOutputCol("class")

pipeline = Pipeline(stages=[documentAssembler, tokenizer, seq_classifier])

data = spark.createDataFrame([["PUT YOUR STRING HERE"]]).toDF("text")

result = pipeline.fit(data).transform(data)
```
```scala
val documentAssembler = new DocumentAssembler()
      .setInputCols(Array("text"))
      .setOutputCols(Array("document"))

val tokenizer = new Tokenizer()
    .setInputCols("document")
    .setOutputCol("token")

val seq_classifier = BertForSequenceClassification.pretrained("bert_classifier_arabic_marbert_poetry_classification","ar")
    .setInputCols(Array("document", "token"))
    .setOutputCol("class")

val pipeline = new Pipeline().setStages(Array(documentAssembler, tokenizer, seq_classifier))

val data = Seq("PUT YOUR STRING HERE").toDS.toDF("text")

val result = pipeline.fit(data).transform(data)
```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|bert_classifier_arabic_marbert_poetry_classification|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[document, token]|
|Output Labels:|[class]|
|Language:|ar|
|Size:|610.9 MB|

## References

References

- https://huggingface.co/Ammar-alhaj-ali/arabic-MARBERT-poetry-classification
- https://hci-lab.github.io/ArabicPoetry-1-Private/