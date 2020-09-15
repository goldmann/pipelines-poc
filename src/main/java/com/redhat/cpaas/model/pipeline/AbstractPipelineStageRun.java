package com.redhat.cpaas.model.pipeline;

public abstract class AbstractPipelineStageRun implements PipelineStageRun {
    protected PipelineStage stage;
    protected PipelineStageResult result;
    protected RunStatus status;

    public AbstractPipelineStageRun(PipelineStage stage) {
        this.stage = stage;
    }

    @Override
    public PipelineStageResult getResult() {
        return result;
    }

    @Override
    public PipelineStage getStage() {
        return stage;
    }

    @Override
    public RunStatus getStatus() {
        return status;
    }

    public void setStatus(RunStatus status) {
        this.status = status;
    }
}
