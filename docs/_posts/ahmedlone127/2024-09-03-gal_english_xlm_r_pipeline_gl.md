---
layout: model
title: Galician gal_english_xlm_r_pipeline pipeline XlmRoBertaForTokenClassification from mbruton
author: John Snow Labs
name: gal_english_xlm_r_pipeline
date: 2024-09-03
tags: [gl, open_source, pipeline, onnx]
task: Named Entity Recognition
language: gl
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained XlmRoBertaForTokenClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`gal_english_xlm_r_pipeline` is a Galician model originally trained by mbruton.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/gal_english_xlm_r_pipeline_gl_5.5.0_3.0_1725372436110.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/gal_english_xlm_r_pipeline_gl_5.5.0_3.0_1725372436110.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("gal_english_xlm_r_pipeline", lang = "gl")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("gal_english_xlm_r_pipeline", lang = "gl")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|gal_english_xlm_r_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|gl|
|Size:|869.9 MB|

## References

https://huggingface.co/mbruton/gal_en_XLM-R

## Included Models

- DocumentAssembler
- TokenizerModel
- XlmRoBertaForTokenClassification