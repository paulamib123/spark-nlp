---
layout: model
title: English finetune_whisper_tiny_malay_singlish_pipeline pipeline WhisperForCTC from mesolitica
author: John Snow Labs
name: finetune_whisper_tiny_malay_singlish_pipeline
date: 2024-09-24
tags: [en, open_source, pipeline, onnx]
task: Automatic Speech Recognition
language: en
edition: Spark NLP 5.5.0
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained WhisperForCTC, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`finetune_whisper_tiny_malay_singlish_pipeline` is a English model originally trained by mesolitica.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/finetune_whisper_tiny_malay_singlish_pipeline_en_5.5.0_3.0_1727144232676.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/finetune_whisper_tiny_malay_singlish_pipeline_en_5.5.0_3.0_1727144232676.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("finetune_whisper_tiny_malay_singlish_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("finetune_whisper_tiny_malay_singlish_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|finetune_whisper_tiny_malay_singlish_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|378.7 MB|

## References

https://huggingface.co/mesolitica/finetune-whisper-tiny-ms-singlish

## Included Models

- AudioAssembler
- WhisperForCTC