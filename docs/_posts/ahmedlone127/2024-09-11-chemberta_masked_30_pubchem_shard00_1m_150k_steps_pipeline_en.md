---
layout: model
title: English chemberta_masked_30_pubchem_shard00_1m_150k_steps_pipeline pipeline RoBertaEmbeddings from seyonec
author: John Snow Labs
name: chemberta_masked_30_pubchem_shard00_1m_150k_steps_pipeline
date: 2024-09-11
tags: [en, open_source, pipeline, onnx]
task: Embeddings
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

Pretrained RoBertaEmbeddings, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`chemberta_masked_30_pubchem_shard00_1m_150k_steps_pipeline` is a English model originally trained by seyonec.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/chemberta_masked_30_pubchem_shard00_1m_150k_steps_pipeline_en_5.5.0_3.0_1726031693842.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/chemberta_masked_30_pubchem_shard00_1m_150k_steps_pipeline_en_5.5.0_3.0_1726031693842.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

pipeline = PretrainedPipeline("chemberta_masked_30_pubchem_shard00_1m_150k_steps_pipeline", lang = "en")
annotations =  pipeline.transform(df)   

```
```scala

val pipeline = new PretrainedPipeline("chemberta_masked_30_pubchem_shard00_1m_150k_steps_pipeline", lang = "en")
val annotations = pipeline.transform(df)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|chemberta_masked_30_pubchem_shard00_1m_150k_steps_pipeline|
|Type:|pipeline|
|Compatibility:|Spark NLP 5.5.0+|
|License:|Open Source|
|Edition:|Official|
|Language:|en|
|Size:|310.2 MB|

## References

https://huggingface.co/seyonec/ChemBERTa_masked_30_PubChem_shard00_1M_150k_steps

## Included Models

- DocumentAssembler
- TokenizerModel
- RoBertaEmbeddings