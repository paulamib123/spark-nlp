---
layout: model
title: English ner_fine_tuned_gdsc_tutoring_fariz_pipeline pipeline BertForTokenClassification from farizkuy
author: John Snow Labs
name: ner_fine_tuned_gdsc_tutoring_fariz_pipeline
date: 2025-01-25
tags: [en, open_source, pipeline, onnx]
task: Named Entity Recognition
language: en
edition: Spark NLP 5.5.1
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained BertForTokenClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`ner_fine_tuned_gdsc_tutoring_fariz_pipeline` is a English model originally trained by farizkuy.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/ner_fine_tuned_gdsc_tutoring_fariz_pipeline_en_5.5.1_3.0_1737835035024.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/ner_fine_tuned_gdsc_tutoring_fariz_pipeline_en_5.5.1_3.0_1737835035024.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("ner_fine_tuned_gdsc_tutoring_fariz_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("ner_fine_tuned_gdsc_tutoring_fariz_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|ner_fine_tuned_gdsc_tutoring_fariz_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|412.7 MB|

## References

https://huggingface.co/farizkuy/ner_fine_tuned_gdsc_tutoring_fariz

## Included Models

- DocumentAssembler
- TokenizerModel
- BertForTokenClassification