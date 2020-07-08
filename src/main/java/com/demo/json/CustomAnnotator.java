package com.demo.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.sun.codemodel.JDefinedClass;
import lombok.Builder;
import lombok.Data;
import org.jsonschema2pojo.AbstractAnnotator;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

public class CustomAnnotator extends AbstractAnnotator {

    @Override
    public void propertyOrder(JDefinedClass clazz, JsonNode propertiesNode) {
        super.propertyOrder(clazz, propertiesNode);
        clazz.annotate(Data.class);
        clazz.annotate(Builder.class);
        clazz.annotate(JsonAutoDetect.class);
        System.out.println("test");
    }
}
