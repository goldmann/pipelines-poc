package com.redhat.cpaas.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.NON_PRIVATE)
public class Component implements Serializable {
    private static final long serialVersionUID = 1L;

    String id;

    String name;
 
    String type;

    List<Build> builds = new ArrayList<>();

    List<Component> dependencies = new ArrayList<>();

    public List<Build> getBuilds() {
        return builds;
    }

    public List<Component> getDependencies() {
        return dependencies;
    }
}
