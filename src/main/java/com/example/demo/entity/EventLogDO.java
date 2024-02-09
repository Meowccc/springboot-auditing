package com.example.demo.entity;

import com.example.demo.enums.EventActionEnum;
import com.example.demo.enums.ServiceCodeEnum;
import com.example.demo.repository.converter.EventActionAttrConverter;
import com.example.demo.repository.converter.ServiceCodeAttributeConverter;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * @author meow
 */
@Setter
@Getter
@Entity
@Table(name = "event_log")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class EventLogDO extends BaseLongIdDO {

    @Convert(converter = EventActionAttrConverter.class)
    private EventActionEnum event;

//    @Convert(converter = ServiceCodeAttributeConverter.class)
    private ServiceCodeEnum serviceCode;
}
