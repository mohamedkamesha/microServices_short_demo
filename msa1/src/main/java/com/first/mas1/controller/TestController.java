package com.first.mas1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

@RestController
@RequestMapping("msa1")
public class TestController {

    @GetMapping("message")
    public String getMessage() {
        return "Hello from MSA 1 METHOD NAME getMessage";
    }
}
