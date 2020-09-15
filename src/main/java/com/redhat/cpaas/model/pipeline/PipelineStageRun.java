package com.redhat.cpaas.model.pipeline;

public interface PipelineStageRun {
    public PipelineStage getStage();

    public PipelineStageResult getResult();

    public RunStatus getStatus();

    public void setStatus(RunStatus status);
}
