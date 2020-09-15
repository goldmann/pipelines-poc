package com.redhat.cpaas.model.pipeline;

public abstract class AbstractPipelineRun implements PipelineRun {
    protected Pipeline pipeline;
    protected PipelineRunResult result;
    protected RunStatus status;

    public AbstractPipelineRun(Pipeline pipeline) {
        this.pipeline = pipeline;
    }

    @Override
    public Pipeline getPipeline() {
        return pipeline;
    }

    @Override
    public RunStatus getStatus() {
        return status;
    }

    @Override
    public PipelineRunResult getResult() {
        return result;
    }
}
