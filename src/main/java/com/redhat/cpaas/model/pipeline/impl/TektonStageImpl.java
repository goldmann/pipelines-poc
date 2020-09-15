package com.redhat.cpaas.model.pipeline.impl;

import com.redhat.cpaas.model.pipeline.AbstractPipelineStage;
import com.redhat.cpaas.model.pipeline.PipelineRun;
import com.redhat.cpaas.model.pipeline.PipelineStageRun;
import com.redhat.cpaas.model.pipeline.RunStatus;

public class TektonStageImpl extends AbstractPipelineStage {

    /**
     * The container image name with tag to be used as the stage implementation.
     */
    private String containerImage = "quay.io/cpaas/executor:stable";

    /**
     * Container image command that should override the default command.
     */
    private String command;

    @Override
    public PipelineStageRun run(PipelineRun pipelineRun) {
        return this.run(pipelineRun, null);
    }

    @Override
    public PipelineStageRun run(PipelineRun pipelineRun, String command) {
        PipelineStageRun stageRun = new PipelineStageRunImpl(this);

        stageRun.setStatus(RunStatus.RUNNING);

        // This is where we will start a container and run it.
        // Variables here are mocks for a particular run

        Integer rc = 0;
        String metadata = "";

        stageRun.setStatus(RunStatus.SUCCESS);

        return stageRun;
    }

}
