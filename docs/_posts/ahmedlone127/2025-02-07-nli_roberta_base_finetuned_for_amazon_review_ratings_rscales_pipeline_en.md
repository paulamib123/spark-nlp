---
layout: model
title: English nli_roberta_base_finetuned_for_amazon_review_ratings_rscales_pipeline pipeline RoBertaForSequenceClassification from rscales
author: John Snow Labs
name: nli_roberta_base_finetuned_for_amazon_review_ratings_rscales_pipeline
date: 2025-02-07
tags: [en, open_source, pipeline, onnx]
task: Text Classification
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

Pretrained RoBertaForSequenceClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`nli_roberta_base_finetuned_for_amazon_review_ratings_rscales_pipeline` is a English model originally trained by rscales.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/nli_roberta_base_finetuned_for_amazon_review_ratings_rscales_pipeline_en_5.5.1_3.0_1738897149350.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/nli_roberta_base_finetuned_for_amazon_review_ratings_rscales_pipeline_en_5.5.1_3.0_1738897149350.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("nli_roberta_base_finetuned_for_amazon_review_ratings_rscales_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("nli_roberta_base_finetuned_for_amazon_review_ratings_rscales_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|nli_roberta_base_finetuned_for_amazon_review_ratings_rscales_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|466.2 MB|

## References

https://huggingface.co/rscales/nli-roberta-base-finetuned-for-amazon-review-ratings

## Included Models

- DocumentAssembler
- TokenizerModel
- RoBertaForSequenceClassification