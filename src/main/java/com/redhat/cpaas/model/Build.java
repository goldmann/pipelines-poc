package com.redhat.cpaas.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Build {
    @JsonProperty
    String name;
    @JsonProperty
    String id;

    @JsonProperty
    String type;
}
