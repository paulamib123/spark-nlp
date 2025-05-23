---
layout: model
title: Multilingual custommodel_multilingual_sentiment_analysis_pipeline pipeline DistilBertForSequenceClassification from MonkeyDLLLLLLuffy
author: John Snow Labs
name: custommodel_multilingual_sentiment_analysis_pipeline
date: 2025-03-30
tags: [xx, open_source, pipeline, onnx]
task: Text Classification
language: xx
edition: Spark NLP 5.5.1
spark_version: 3.0
supported: true
annotator: PipelineModel
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained DistilBertForSequenceClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`custommodel_multilingual_sentiment_analysis_pipeline` is a Multilingual model originally trained by MonkeyDLLLLLLuffy.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/custommodel_multilingual_sentiment_analysis_pipeline_xx_5.5.1_3.0_1743378078366.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/custommodel_multilingual_sentiment_analysis_pipeline_xx_5.5.1_3.0_1743378078366.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("custommodel_multilingual_sentiment_analysis_pipeline", lang = "xx")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("custommodel_multilingual_sentiment_analysis_pipeline", lang = "xx")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|custommodel_multilingual_sentiment_analysis_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|xx|
|Size:|507.6 MB|

## References

https://huggingface.co/MonkeyDLLLLLLuffy/CustomModel-multilingual-sentiment-analysis

## Included Models

- DocumentAssembler
- TokenizerModel
- DistilBertForSequenceClassification