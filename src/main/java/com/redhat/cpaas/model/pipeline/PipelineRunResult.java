package com.redhat.cpaas.model.pipeline;

import java.util.List;

public interface PipelineRunResult {
    public List<PipelineStageResult> getStageResults();
}
