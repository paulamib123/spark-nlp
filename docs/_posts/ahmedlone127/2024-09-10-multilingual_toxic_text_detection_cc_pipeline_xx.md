---
layout: model
title: Multilingual multilingual_toxic_text_detection_cc_pipeline pipeline XlmRoBertaForSequenceClassification from marianna13
author: John Snow Labs
name: multilingual_toxic_text_detection_cc_pipeline
date: 2024-09-10
tags: [xx, open_source, pipeline, onnx]
task: Text Classification
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

Pretrained XlmRoBertaForSequenceClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`multilingual_toxic_text_detection_cc_pipeline` is a Multilingual model originally trained by marianna13.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/multilingual_toxic_text_detection_cc_pipeline_xx_5.5.0_3.0_1725980928360.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/multilingual_toxic_text_detection_cc_pipeline_xx_5.5.0_3.0_1725980928360.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("multilingual_toxic_text_detection_cc_pipeline", lang = "xx")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("multilingual_toxic_text_detection_cc_pipeline", lang = "xx")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|multilingual_toxic_text_detection_cc_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|xx|
|Size:|982.7 MB|

## References

https://huggingface.co/marianna13/multilingual-toxic-text-detection-cc

## Included Models

- DocumentAssembler
- TokenizerModel
- XlmRoBertaForSequenceClassification