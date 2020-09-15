package com.redhat.cpaas.model.pipeline;

public interface PipelineStage {
    public Pipeline getPipeline();

    public PipelineStageRun run(PipelineRun pipelineRun);

    public PipelineStageRun run(PipelineRun pipelineRun, String command);
}
