package com.redhat.cpaas.model.pipeline;

public abstract class AbstractPipelineStage implements PipelineStage {
    protected Pipeline pipeline;

    @Override
    public Pipeline getPipeline() {
        return pipeline;
    }
}
