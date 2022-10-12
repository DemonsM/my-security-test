package com.ink.security.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class LoginController {

    @GetMapping("/hello")
    public String test() {
        return "Hello";
    }
}
