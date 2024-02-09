package com.example.demo.repository.converter;

import com.example.demo.enums.ServiceCodeEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

/**
 * @author meow
 */
@Converter(autoApply = true)
public class ServiceCodeAttributeConverter implements AttributeConverter<ServiceCodeEnum, Integer> {// extends GenericAttributeConverter<ServiceCodeEnum, Integer>

//    public ServiceCodeAttributeConverter() {
//        super(ServiceCodeEnum.class);
//    }

    @Override
    public Integer convertToDatabaseColumn(ServiceCodeEnum serviceCodeEnum) {
        return serviceCodeEnum.getValue();
    }

    @Override
    public ServiceCodeEnum convertToEntityAttribute(Integer value) {
        for (ServiceCodeEnum codeEnum : ServiceCodeEnum.values()) {
            if (codeEnum.getValue().equals(value)) {
                return codeEnum;
            }
        }
        return null;
    }
}
