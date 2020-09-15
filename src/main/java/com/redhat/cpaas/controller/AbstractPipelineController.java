package com.redhat.cpaas.controller;

import com.redhat.cpaas.model.pipeline.Pipeline;
import com.redhat.cpaas.model.pipeline.PipelineRun;
import com.redhat.cpaas.model.pipeline.PipelineStage;
import com.redhat.cpaas.model.pipeline.PipelineStageRun;
import com.redhat.cpaas.model.pipeline.impl.PipelineRunImpl;

public abstract class AbstractPipelineController implements PipelineController {
    private final EventController eventController = new EventControllerImpl();

    @Override
    public PipelineRun runPipeline(final Pipeline pipeline) {
        PipelineRun pipelineRun = new PipelineRunImpl(pipeline);

        // non-blocking call
        this.reallyRunPipeline(pipelineRun);

        return pipelineRun;
    }

    public void reallyRunPipeline(PipelineRun pipelineRun) {
        eventController.sendEvent("START pipeline");

        // TODO: How to get info about stage status from TKN?
        // Run all stages
        pipelineRun.getPipeline().getStages().forEach(stage -> {
            this.runStage(stage, pipelineRun);
        });

        eventController.sendEvent("STOP pipeline");
    }

    @Override
    public PipelineStageRun runStage(final PipelineStage stage, final PipelineRun pipelineRun) {
        eventController.sendEvent("START stage");
        PipelineStageRun stageRun = stage.run(pipelineRun);
        eventController.sendEvent("STOP stage");

        return stageRun;
    }

}
