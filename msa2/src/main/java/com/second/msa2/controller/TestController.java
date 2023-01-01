package com.second.msa2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("msa2")
public class TestController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("inquireMessage")
    public String inquireMessage() {
        String message = restTemplate.getForObject("http://localhost:9090/msa1/message", String.class);
        return message + " inquire from msa2";
    }

}
