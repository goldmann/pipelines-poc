package com.redhat.cpaas.model.pipeline;

import java.util.List;

public interface Pipeline {
    public List<PipelineStage> getStages();
    public PipelineStatus getStatus();
}
