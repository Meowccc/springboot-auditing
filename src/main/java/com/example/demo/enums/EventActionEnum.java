package com.example.demo.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author meow
 */
@Getter
@RequiredArgsConstructor
public enum EventActionEnum implements BaseEnum<String> {

    LOGIN("loginn"),
    LOGOUT("logout"),
    ;

    @JsonValue
    private final String value;
}
