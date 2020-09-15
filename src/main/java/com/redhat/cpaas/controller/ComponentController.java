package com.redhat.cpaas.controller;

import com.redhat.cpaas.model.BuildQuality;
import com.redhat.cpaas.model.Component;

public interface ComponentController {

    /**
     * Returns build quality for latest build of a particular component.
     * 
     * @param component
     * @return
     */
    BuildQuality getBuildQuality(Component component);

}
