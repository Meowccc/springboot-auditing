package com.example.demo.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author meow
 */
@Getter
@RequiredArgsConstructor
public enum ServiceCodeEnum implements BaseEnum<Integer> {

    V1(11),
    V2(22),
    ;

    @JsonValue
    private final Integer value;
}
