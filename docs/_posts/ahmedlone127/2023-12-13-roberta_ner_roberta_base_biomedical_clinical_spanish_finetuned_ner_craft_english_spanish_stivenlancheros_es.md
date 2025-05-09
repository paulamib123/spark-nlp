---
layout: model
title: Castilian, Spanish roberta_ner_roberta_base_biomedical_clinical_spanish_finetuned_ner_craft_english_spanish_stivenlancheros RoBertaForTokenClassification from StivenLancheros
author: John Snow Labs
name: roberta_ner_roberta_base_biomedical_clinical_spanish_finetuned_ner_craft_english_spanish_stivenlancheros
date: 2023-12-13
tags: [roberta, es, open_source, token_classification, onnx]
task: Named Entity Recognition
language: es
edition: Spark NLP 5.2.1
spark_version: 3.0
supported: true
engine: onnx
annotator: RoBertaForTokenClassification
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained RoBertaForTokenClassification model, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`roberta_ner_roberta_base_biomedical_clinical_spanish_finetuned_ner_craft_english_spanish_stivenlancheros` is a Castilian, Spanish model originally trained by StivenLancheros.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/roberta_ner_roberta_base_biomedical_clinical_spanish_finetuned_ner_craft_english_spanish_stivenlancheros_es_5.2.1_3.0_1702496610999.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/roberta_ner_roberta_base_biomedical_clinical_spanish_finetuned_ner_craft_english_spanish_stivenlancheros_es_5.2.1_3.0_1702496610999.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python


documentAssembler = DocumentAssembler() \
    .setInputCol("text") \
    .setOutputCol("document")
    
tokenizer = Tokenizer() \
        .setInputCols(["document"]) \
        .setOutputCol("token")
        
    
tokenClassifier = RoBertaForTokenClassification.pretrained("roberta_ner_roberta_base_biomedical_clinical_spanish_finetuned_ner_craft_english_spanish_stivenlancheros","es") \
            .setInputCols(["document","token"]) \
            .setOutputCol("ner")

pipeline = Pipeline().setStages([documentAssembler, tokenizer, tokenClassifier])

pipelineModel = pipeline.fit(data)

pipelineDF = pipelineModel.transform(data)

```
```scala


val documentAssembler = new DocumentAssembler()
    .setInputCol("text") 
    .setOutputCol("document")

val tokenizer = Tokenizer() \
        .setInputCols(Array("document")) \
        .setOutputCol("token")

val tokenClassifier = RoBertaForTokenClassification  
    .pretrained("roberta_ner_roberta_base_biomedical_clinical_spanish_finetuned_ner_craft_english_spanish_stivenlancheros", "es")
    .setInputCols(Array("document","token")) 
    .setOutputCol("ner") 

val pipeline = new Pipeline().setStages(Array(documentAssembler, tokenizer, tokenClassifier))

val pipelineModel = pipeline.fit(data)

val pipelineDF = pipelineModel.transform(data)


```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|roberta_ner_roberta_base_biomedical_clinical_spanish_finetuned_ner_craft_english_spanish_stivenlancheros|
|Compatibility:|Spark NLP 5.2.1+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[documents, token]|
|Output Labels:|[ner]|
|Language:|es|
|Size:|447.9 MB|

## References

https://huggingface.co/StivenLancheros/Roberta-base-biomedical-clinical-es-finetuned-ner-CRAFT_en_es