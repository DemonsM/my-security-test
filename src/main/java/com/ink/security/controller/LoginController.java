package com.ink.security.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class LoginController {
    //private final LoginService loginService;

    @GetMapping("/hello")
    public String test() {
        return "Hello";
    }

    //@PostMapping("/login")
    //public String login(String username, String password) {
    //    loginService.login(username, password);
    //    return "success";
    //}
}
