package com.second.msa2.controller;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ResetBean {


    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
