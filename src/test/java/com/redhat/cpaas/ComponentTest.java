package com.redhat.cpaas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.redhat.cpaas.model.Build;
import com.redhat.cpaas.model.Component;

import org.junit.jupiter.api.Test;

public class ComponentTest {
    @Test
    public void arraysShouldBeInitializedByDefault() {
        Component component = new Component();

        assertNotNull(component.getBuilds());
        assertNotNull(component.getDependencies());
    }

    @Test
    public void testSerializationToYaml() throws JsonProcessingException {
        Build build = new Build();
        Component component = new Component();
        component.getBuilds().add(build);

        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CAMEL_CASE);
        String out = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(component);
        assertEquals("", out);
    }

}
