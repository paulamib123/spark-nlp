---
layout: model
title: Slovenian sloberta_pipeline pipeline CamemBertEmbeddings from EMBEDDIA
author: John Snow Labs
name: sloberta_pipeline
date: 2024-09-02
tags: [sl, open_source, pipeline, onnx]
task: Embeddings
language: sl
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained CamemBertEmbeddings, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`sloberta_pipeline` is a Slovenian model originally trained by EMBEDDIA.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/sloberta_pipeline_sl_5.5.0_3.0_1725296484117.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/sloberta_pipeline_sl_5.5.0_3.0_1725296484117.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("sloberta_pipeline", lang = "sl")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("sloberta_pipeline", lang = "sl")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|sloberta_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|sl|
|Size:|263.5 MB|

## References

https://huggingface.co/EMBEDDIA/sloberta

## Included Models

- DocumentAssembler
- TokenizerModel
- CamemBertEmbeddings