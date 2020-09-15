package com.redhat.cpaas.model;

import java.util.ArrayList;
import java.util.List;

public class Product {
    String name;
    String id;
    List<Group> groups;

    public List<Component> getComponents() {
        final List<Component> components = new ArrayList<>();

        groups.stream().forEach(group -> components.addAll(group.components));

        return components;
    }

    public List<Build> getBuilds() {
        final List<Build> builds = new ArrayList<>();

        groups.stream().forEach(group -> builds.addAll(group.getBuilds()));

        return builds;
    }
}
