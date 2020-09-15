package com.redhat.cpaas.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class ComponentBuild {
    String id;
    Date buildStart;
    Date buildFinish;
    Component component;
    List<BuildRun> buildRuns;
    Set<Label> labels;
}
