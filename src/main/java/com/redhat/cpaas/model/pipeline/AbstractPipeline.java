package com.redhat.cpaas.model.pipeline;

public abstract class AbstractPipeline implements Pipeline {
    protected PipelineStatus status;

    @Override
    public PipelineStatus getStatus() {
        return status;
    }
}
