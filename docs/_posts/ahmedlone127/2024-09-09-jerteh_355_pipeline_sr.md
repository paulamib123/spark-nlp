---
layout: model
title: Serbian jerteh_355_pipeline pipeline RoBertaEmbeddings from jerteh
author: John Snow Labs
name: jerteh_355_pipeline
date: 2024-09-09
tags: [sr, open_source, pipeline, onnx]
task: Embeddings
language: sr
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained RoBertaEmbeddings, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`jerteh_355_pipeline` is a Serbian model originally trained by jerteh.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/jerteh_355_pipeline_sr_5.5.0_3.0_1725910826242.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/jerteh_355_pipeline_sr_5.5.0_3.0_1725910826242.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("jerteh_355_pipeline", lang = "sr")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("jerteh_355_pipeline", lang = "sr")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|jerteh_355_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|sr|
|Size:|1.3 GB|

## References

https://huggingface.co/jerteh/Jerteh-355

## Included Models

- DocumentAssembler
- TokenizerModel
- RoBertaEmbeddings