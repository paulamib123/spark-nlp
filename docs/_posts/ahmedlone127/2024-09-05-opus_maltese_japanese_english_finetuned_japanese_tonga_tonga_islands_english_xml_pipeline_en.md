---
layout: model
title: English opus_maltese_japanese_english_finetuned_japanese_tonga_tonga_islands_english_xml_pipeline pipeline MarianTransformer from Edomonndo
author: John Snow Labs
name: opus_maltese_japanese_english_finetuned_japanese_tonga_tonga_islands_english_xml_pipeline
date: 2024-09-05
tags: [en, open_source, pipeline, onnx]
task: Translation
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

Pretrained MarianTransformer, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`opus_maltese_japanese_english_finetuned_japanese_tonga_tonga_islands_english_xml_pipeline` is a English model originally trained by Edomonndo.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/opus_maltese_japanese_english_finetuned_japanese_tonga_tonga_islands_english_xml_pipeline_en_5.5.0_3.0_1725545645686.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/opus_maltese_japanese_english_finetuned_japanese_tonga_tonga_islands_english_xml_pipeline_en_5.5.0_3.0_1725545645686.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("opus_maltese_japanese_english_finetuned_japanese_tonga_tonga_islands_english_xml_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("opus_maltese_japanese_english_finetuned_japanese_tonga_tonga_islands_english_xml_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|opus_maltese_japanese_english_finetuned_japanese_tonga_tonga_islands_english_xml_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|515.3 MB|

## References

https://huggingface.co/Edomonndo/opus-mt-ja-en-finetuned-ja-to-en_xml

## Included Models

- DocumentAssembler
- SentenceDetectorDLModel
- MarianTransformer