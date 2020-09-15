package com.redhat.cpaas.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ProductBuild {
    String id;
    Product product;
    List<GroupBuild> groupBuilds;
    Set<Label> labels;
    BuildQuality quality = BuildQuality.BUILT;

    public List<ComponentBuild> getComponentBuilds() {
        final List<ComponentBuild> componentBuilds = new ArrayList<>();

        groupBuilds.stream().forEach(groupBuild -> {
            componentBuilds.addAll(groupBuild.componentBuilds);
        });

        return componentBuilds;
    }
}
