package com.ross.spring.uber.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embeddable;


@JsonInclude(JsonInclude.Include.NON_NULL)

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Embeddable

public class UnitInfo {
    private final String unitVin;
    private String engineMake;
    private String customerName;
    private String unitNumber;

    public UnitInfo(){
        this.unitVin="";
    }
}
