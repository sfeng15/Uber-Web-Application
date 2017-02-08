package com.ross.spring.uber;

import com.ross.spring.uber.domain.UnitInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FleetLocationServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(FleetLocationServiceApplication.class);
        UnitInfo unitInfo=new UnitInfo("unitVin");
    }
}
