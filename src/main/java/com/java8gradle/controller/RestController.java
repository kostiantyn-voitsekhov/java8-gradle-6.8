package com.java8gradle.controller;

import com.java8gradle.service.HelloWorldService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private final HelloWorldService helloWorldService;

    public RestController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/wasd")
    public ResponseEntity<String> getSomething() {
    return helloWorldService.findHelloWorld();
    }

}
