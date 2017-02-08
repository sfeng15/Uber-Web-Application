package com.ross.spring.uber.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embeddable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@RequiredArgsConstructor
@Embeddable

public class UnitFault {
    private final String vin;
    private Long spn;
    private Long fmi;
    public UnitFault(){
        this.vin="";
    }
}
