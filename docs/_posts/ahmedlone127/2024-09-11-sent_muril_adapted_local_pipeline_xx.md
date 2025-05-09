---
layout: model
title: Multilingual sent_muril_adapted_local_pipeline pipeline BertSentenceEmbeddings from monsoon-nlp
author: John Snow Labs
name: sent_muril_adapted_local_pipeline
date: 2024-09-11
tags: [xx, open_source, pipeline, onnx]
task: Embeddings
language: xx
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained BertSentenceEmbeddings, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`sent_muril_adapted_local_pipeline` is a Multilingual model originally trained by monsoon-nlp.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/sent_muril_adapted_local_pipeline_xx_5.5.0_3.0_1726080380075.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/sent_muril_adapted_local_pipeline_xx_5.5.0_3.0_1726080380075.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("sent_muril_adapted_local_pipeline", lang = "xx")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("sent_muril_adapted_local_pipeline", lang = "xx")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|sent_muril_adapted_local_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|xx|
|Size:|886.4 MB|

## References

https://huggingface.co/monsoon-nlp/muril-adapted-local

## Included Models

- DocumentAssembler
- TokenizerModel
- SentenceDetectorDLModel
- BertSentenceEmbeddings