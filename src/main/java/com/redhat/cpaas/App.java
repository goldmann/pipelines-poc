package com.redhat.cpaas;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.redhat.cpaas.model.Build;
import com.redhat.cpaas.model.Component;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Build build = new Build();
        Component component = new Component();
        component.getBuilds().add(build);

        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.KEBAB_CASE);
        String out = null;
        try {
            out = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(component);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        
        System.out.println(out);
    }
}
