package com.example.demo.repository.converter;

import com.example.demo.enums.EventActionEnum;
import jakarta.persistence.Converter;

/**
 * @author meow
 */
@Converter(autoApply = true)
public class EventActionAttrConverter extends GenericAttributeConverter<EventActionEnum, String> {

    public EventActionAttrConverter() {
        super(EventActionEnum.class);
    }
}
