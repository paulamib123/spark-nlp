---
layout: model
title: llama_3_2_11b_vision_instruct_int4 model
author: John Snow Labs
name: llama_3_2_11b_vision_instruct_int4
date: 2025-03-27
tags: [en, open_source, openvino]
task: Text Generation
language: en
edition: Spark NLP 5.5.1
spark_version: 3.0
supported: true
engine: openvino
annotator: MLLamaForMultimodal
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained CoHereTransformer, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`llama_3_2_11b_vision_instruct_int4` is a english model originally trained by Qwen.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/llama_3_2_11b_vision_instruct_int4_en_5.5.1_3.0_1743066797793.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/llama_3_2_11b_vision_instruct_int4_en_5.5.1_3.0_1743066797793.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python

image_assembler = ImageAssembler().setInputCol("image").setOutputCol("image_assembler")


seq2seq = MLLamaForMultimodal.pretrained("llama_3_2_11b_vision_instruct_int4","en") \
      .setInputCols(["image_assembler"]) \
      .setOutputCol("generation")

pipeline = Pipeline().setStages([image_assembler, seq2seq])


```
```scala

val image_assembler = new ImageAssembler().setInputCol("image").setOutputCol("image_assembler")

val seq2seq = MLLamaForMultimodal.pretrained("llama_3_2_11b_vision_instruct_int4","en")
    .setInputCols(Array("image_assembler"))
    .setOutputCol("embeddings")

val pipeline = new Pipeline().setStages(Array(image_assembler, seq2seq))


```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|llama_3_2_11b_vision_instruct_int4|
|Compatibility:|Spark NLP 5.5.1+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[image_assembler]|
|Output Labels:|[answer]|
|Language:|en|
|Size:|6.4 GB|