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
    @GetMapping(value = "/message1", produces = "application/json")
    public String getMessage(){
        return "Test message 45";

    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/message2", produces = "application/json")
    public String getMessage2(){
        return "Test message 11";
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/message3", produces = "application/json")
    public String getMessage3() {
        return "Test message 456789";
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/message4", produces = "application/json")
    public String getMessage4() {
        return "Test message 456789";
    }

}
