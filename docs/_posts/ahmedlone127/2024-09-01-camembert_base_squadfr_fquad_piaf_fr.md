---
layout: model
title: French camembert_base_squadfr_fquad_piaf CamemBertForQuestionAnswering from AgentPublic
author: John Snow Labs
name: camembert_base_squadfr_fquad_piaf
date: 2024-09-01
tags: [fr, open_source, onnx, question_answering, camembert]
task: Question Answering
language: fr
edition: Spark NLP 5.4.2
spark_version: 3.0
supported: true
engine: onnx
annotator: CamemBertForQuestionAnswering
article_header:
  type: cover
use_language_switcher: "Python-Scala-Java"
---

## Description

Pretrained CamemBertForQuestionAnswering model, adapted from Hugging Face and curated to provide scalability and production-readiness using Spark NLP.`camembert_base_squadfr_fquad_piaf` is a French model originally trained by AgentPublic.

{:.btn-box}
<button class="button button-orange" disabled>Live Demo</button>
<button class="button button-orange" disabled>Open in Colab</button>
[Download](https://s3.amazonaws.com/auxdata.johnsnowlabs.com/public/models/camembert_base_squadfr_fquad_piaf_fr_5.4.2_3.0_1725162056810.zip){:.button.button-orange.button-orange-trans.arr.button-icon}
[Copy S3 URI](s3://auxdata.johnsnowlabs.com/public/models/camembert_base_squadfr_fquad_piaf_fr_5.4.2_3.0_1725162056810.zip){:.button.button-orange.button-orange-trans.button-icon.button-copy-s3}

## How to use



<div class="tabs-box" markdown="1">
{% include programmingLanguageSelectScalaPythonNLU.html %}
```python
             
documentAssembler = MultiDocumentAssembler() \
     .setInputCol(["question", "context"]) \
     .setOutputCol(["document_question", "document_context"])
    
spanClassifier = CamemBertForQuestionAnswering.pretrained("camembert_base_squadfr_fquad_piaf","fr") \
     .setInputCols(["document_question","document_context"]) \
     .setOutputCol("answer")

pipeline = Pipeline().setStages([documentAssembler, spanClassifier])
data = spark.createDataFrame([["What framework do I use?","I use spark-nlp."]]).toDF("document_question", "document_context")
pipelineModel = pipeline.fit(data)
pipelineDF = pipelineModel.transform(data)

```
```scala

val documentAssembler = new MultiDocumentAssembler()
    .setInputCol(Array("question", "context")) 
    .setOutputCol(Array("document_question", "document_context"))
    
val spanClassifier = CamemBertForQuestionAnswering.pretrained("camembert_base_squadfr_fquad_piaf", "fr")
    .setInputCols(Array("document_question","document_context")) 
    .setOutputCol("answer") 
    
val pipeline = new Pipeline().setStages(Array(documentAssembler, spanClassifier))
val data = Seq("What framework do I use?","I use spark-nlp.").toDS.toDF("document_question", "document_context")
val pipelineModel = pipeline.fit(data)
val pipelineDF = pipelineModel.transform(data)

```
</div>

{:.model-param}
## Model Information

{:.table-model}
|---|---|
|Model Name:|camembert_base_squadfr_fquad_piaf|
|Compatibility:|Spark NLP 5.4.2+|
|License:|Open Source|
|Edition:|Official|
|Input Labels:|[document_question, document_context]|
|Output Labels:|[answer]|
|Language:|fr|
|Size:|411.3 MB|

## References

https://huggingface.co/AgentPublic/camembert-base-squadFR-fquad-piaf