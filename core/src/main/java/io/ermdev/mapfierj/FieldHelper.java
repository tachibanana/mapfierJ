package io.ermdev.mapfierj;

import java.lang.reflect.Field;

public class FieldHelper {

    public static String fieldName(Field field) {
        if(field == null) return "";
        FieldName fieldName = field.getAnnotation(FieldName.class);
        if(fieldName == null)
            return field.getName();
        else
            return fieldName.value();
    }
}
