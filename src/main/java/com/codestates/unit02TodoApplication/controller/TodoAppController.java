package com.codestates.unit02TodoApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoAppController {

    @GetMapping("/")
    public String printString() {
        return "To-do Application !";
    }
}
