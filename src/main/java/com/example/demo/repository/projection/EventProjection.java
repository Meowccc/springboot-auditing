package com.example.demo.repository.projection;

import com.example.demo.enums.EventActionEnum;
import com.example.demo.enums.ServiceCodeEnum;

/**
 * @author meow
 */
public interface EventProjection {

    EventActionEnum getEvent();

    ServiceCodeEnum getServiceCode();
}
