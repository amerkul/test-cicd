package com.example.cicd.controller;

import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@NoArgsConstructor
@RequestMapping("/api")
public class TestController {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/message", produces = "application/json")
    public String getMessage(){
        return "Test message 3";
    }

}
