---
layout: model
title: English deberta_v3_large_conll2003_breast_castellon_v1_pipeline pipeline DeBertaForTokenClassification from Yanis
author: John Snow Labs
name: deberta_v3_large_conll2003_breast_castellon_v1_pipeline
date: 2024-09-03
tags: [en, open_source, pipeline, onnx]
task: Named Entity Recognition
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

Pretrained DeBertaForTokenClassification, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`deberta_v3_large_conll2003_breast_castellon_v1_pipeline` is a English model originally trained by Yanis.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/deberta_v3_large_conll2003_breast_castellon_v1_pipeline_en_5.5.0_3.0_1725388542562.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/deberta_v3_large_conll2003_breast_castellon_v1_pipeline_en_5.5.0_3.0_1725388542562.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("deberta_v3_large_conll2003_breast_castellon_v1_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("deberta_v3_large_conll2003_breast_castellon_v1_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|deberta_v3_large_conll2003_breast_castellon_v1_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|1.5 GB|

## References

https://huggingface.co/Yanis/deberta-v3-large_conll2003_breast-castellon-v1

## Included Models

- DocumentAssembler
- TokenizerModel
- DeBertaForTokenClassification