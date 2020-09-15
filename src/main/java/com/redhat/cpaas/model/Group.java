package com.redhat.cpaas.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    String id;
    String name;
    protected List<Component> components;

    

    public List<Build> getBuilds() {
        final List<Build> builds = new ArrayList<>();

        components.stream().forEach(component -> builds.addAll(component.getBuilds()));

        return builds;
    }
}
