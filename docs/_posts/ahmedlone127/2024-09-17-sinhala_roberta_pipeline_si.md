---
layout: model
title: Sinhala, Sinhalese sinhala_roberta_pipeline pipeline RoBertaEmbeddings from flax-community
author: John Snow Labs
name: sinhala_roberta_pipeline
date: 2024-09-17
tags: [si, open_source, pipeline, onnx]
task: Embeddings
language: si
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained RoBertaEmbeddings, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`sinhala_roberta_pipeline` is a Sinhala, Sinhalese model originally trained by flax-community.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/sinhala_roberta_pipeline_si_5.5.0_3.0_1726595677609.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/sinhala_roberta_pipeline_si_5.5.0_3.0_1726595677609.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("sinhala_roberta_pipeline", lang = "si")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("sinhala_roberta_pipeline", lang = "si")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|sinhala_roberta_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|si|
|Size:|464.5 MB|

## References

https://huggingface.co/flax-community/Sinhala-roberta

## Included Models

- DocumentAssembler
- TokenizerModel
- RoBertaEmbeddings