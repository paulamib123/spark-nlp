---
layout: model
title: English tinyroberta_squad2_finetuned_squad_pipeline pipeline RoBertaForQuestionAnswering from JohnDoe70
author: John Snow Labs
name: tinyroberta_squad2_finetuned_squad_pipeline
date: 2024-09-01
tags: [en, open_source, pipeline, onnx]
task: Question Answering
language: en
edition: Spark NLP 5.4.2
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained RoBertaForQuestionAnswering, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`tinyroberta_squad2_finetuned_squad_pipeline` is a English model originally trained by JohnDoe70.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/tinyroberta_squad2_finetuned_squad_pipeline_en_5.4.2_3.0_1725206416462.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/tinyroberta_squad2_finetuned_squad_pipeline_en_5.4.2_3.0_1725206416462.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("tinyroberta_squad2_finetuned_squad_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("tinyroberta_squad2_finetuned_squad_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|tinyroberta_squad2_finetuned_squad_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.4.2+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|306.9 MB|

## References

https://huggingface.co/JohnDoe70/tinyroberta-squad2-finetuned-squad

## Included Models

- MultiDocumentAssembler
- RoBertaForQuestionAnswering