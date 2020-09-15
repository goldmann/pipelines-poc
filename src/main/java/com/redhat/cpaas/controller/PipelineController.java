package com.redhat.cpaas.controller;

import com.redhat.cpaas.model.pipeline.Pipeline;
import com.redhat.cpaas.model.pipeline.PipelineRun;
import com.redhat.cpaas.model.pipeline.PipelineStage;
import com.redhat.cpaas.model.pipeline.PipelineStageRun;

public interface PipelineController {

    public PipelineRun runPipeline(Pipeline pipeline);

    public PipelineStageRun runStage(PipelineStage stage, PipelineRun pipelineRun);
}
