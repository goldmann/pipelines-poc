package com.redhat.cpaas.model.pipeline;

public interface PipelineRun {

    public Pipeline getPipeline();

    public PipelineRunResult getResult();

    public RunStatus getStatus();
}
