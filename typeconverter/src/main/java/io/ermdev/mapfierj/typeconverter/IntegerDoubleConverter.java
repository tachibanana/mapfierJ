package io.ermdev.mapfierj.typeconverter;

import io.ermdev.mapfierj.TypeConverter;
import io.ermdev.mapfierj.TypeConverterAdapter;
import io.ermdev.mapfierj.TypeException;

@TypeConverter
public class IntegerDoubleConverter extends TypeConverterAdapter<Integer, Double> {

    @Override
    public Object convert(Object o) throws TypeException {
        if(o != null) {
            if(o instanceof Integer)
                return convertTo((Integer) o);
            else if(o instanceof Double)
                return convertFrom((Double) o);
            else
                throw new TypeException("Invalid Type");
        }
        throw new TypeException("You can't convert a null object");
    }

    @Override
    public Double convertTo(Integer o) throws TypeException {
        try {
            return o.doubleValue();
        } catch (Exception e) {
            throw new TypeException("Failed to convert");
        }
    }

    @Override
    public Integer convertFrom(Double o) throws TypeException {
        try {
            return o.intValue();
        } catch (Exception e) {
            throw new TypeException("Failed to convert");
        }
    }
}
