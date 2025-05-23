---
layout: model
title: Turkish BertForTokenClassification Cased model (from busecarik)
author: John Snow Labs
name: bert_token_classifier_loodos_sunlp_ner_turkish
date: 2024-09-01
tags: [tr, open_source, bert, token_classification, ner, onnx]
task: Named Entity Recognition
language: tr
edition: Spark NLP 5.4.2
spark_version: 3.0
supported: true
engine: onnx
annotator: BertForTokenClassification
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained BertForTokenClassification model, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP. `bert-loodos-sunlp-ner-turkish` is a Turkish model originally trained by `busecarik`.

## Predicted Entities

`ORGANIZATION`, `TVSHOW`, `MONEY`, `LOCATION`, `PRODUCT`, `TIME`, `PERSON`

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/bert_token_classifier_loodos_sunlp_ner_turkish_tr_5.4.2_3.0_1725163972953.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/bert_token_classifier_loodos_sunlp_ner_turkish_tr_5.4.2_3.0_1725163972953.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

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

tokenClassifier = BertForTokenClassification.pretrained("bert_token_classifier_loodos_sunlp_ner_turkish","tr") \
    .setInputCols(["document", "token"]) \
    .setOutputCol("ner")

pipeline = Pipeline(stages=[documentAssembler, tokenizer, tokenClassifier])

data = spark.createDataFrame([["PUT YOUR STRING HERE"]]).toDF("text")

result = pipeline.fit(data).transform(data)
```
```scala
val documentAssembler = new DocumentAssembler()
    .setInputCol("text")
    .setOutputCol("document")

val tokenizer = new Tokenizer()
    .setInputCols("document")
    .setOutputCol("token")

val tokenClassifier = BertForTokenClassification.pretrained("bert_token_classifier_loodos_sunlp_ner_turkish","tr")
    .setInputCols(Array("document", "token"))
    .setOutputCol("ner")

val pipeline = new Pipeline().setStages(Array(documentAssembler, tokenizer, tokenClassifier))

val data = Seq("PUT YOUR STRING HERE").toDS.toDF("text")

val result = pipeline.fit(data).transform(data)
```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|bert_token_classifier_loodos_sunlp_ner_turkish|
|Compatibility:|Spark NLP 5.4.2+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[document, token]|
|Output Labels:|[ner]|
|Language:|tr|
|Size:|412.4 MB|

## References

References

- https://huggingface.co/busecarik/bert-loodos-sunlp-ner-turkish
- https://github.com/SU-NLP/SUNLP-Twitter-NER-Dataset
- http://www.lrec-conf.org/proceedings/lrec2022/pdf/2022.lrec-1.484.pdf