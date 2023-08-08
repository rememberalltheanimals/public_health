package com.example.public_health.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String health(){
        return "There are several ways to run the public health care system such as South Korea, Japan, Taiwan, United Kingdom, France and Canada.";
    }
}
