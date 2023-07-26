package com.soca.webapi.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PortConfig {

    @Value("${my.app.port}")
    private int appPort;


}
