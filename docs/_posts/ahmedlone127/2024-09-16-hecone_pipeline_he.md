---
layout: model
title: Hebrew hecone_pipeline pipeline RoBertaForTokenClassification from HeTree
author: John Snow Labs
name: hecone_pipeline
date: 2024-09-16
tags: [he, open_source, pipeline, onnx]
task: Named Entity Recognition
language: he
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained RoBertaForTokenClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`hecone_pipeline` is a Hebrew model originally trained by HeTree.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/hecone_pipeline_he_5.5.0_3.0_1726452841616.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/hecone_pipeline_he_5.5.0_3.0_1726452841616.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("hecone_pipeline", lang = "he")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("hecone_pipeline", lang = "he")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|hecone_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|he|
|Size:|466.0 MB|

## References

https://huggingface.co/HeTree/HeConE

## Included Models

- DocumentAssembler
- TokenizerModel
- RoBertaForTokenClassification