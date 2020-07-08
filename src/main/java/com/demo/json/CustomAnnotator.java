package com.demo.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JFieldVar;
import org.jsonschema2pojo.AbstractAnnotator;
import lombok.Builder;

public class CustomAnnotator extends AbstractAnnotator {
    @Override
    public void propertyField(JFieldVar field, JDefinedClass jDefinedClass, String propertyName, JsonNode propertyNode) {
        super.propertyField(field, jDefinedClass, propertyName, propertyNode);

        // Note: does not have to be the propertyName, could be the field or propertyNode that is verified.
        if (propertyName.equals("Person")) {
            jDefinedClass.annotate(Builder.class);
        }
    }
}
