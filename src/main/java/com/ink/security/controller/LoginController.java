package com.ink.security.controller;

import com.ink.security.bean.ResponseResult;
import com.ink.security.service.LoginService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@AllArgsConstructor
@RestController
public class LoginController {
    private final LoginService loginService;

    @PreAuthorize("hasAnyAuthority('admin','test1')")
    @GetMapping("/hello")
    public String test() {
        return "Hello";
    }

    @PostMapping("/login")
    public ResponseResult<?> login(String username, String password) {
        Map<String, String> loginRes = loginService.login(username, password);
        return new ResponseResult<>(200, "登录成功", loginRes);
    }

    @GetMapping("/log-out")
    public ResponseResult<?> logout() {
        Boolean logout = loginService.logout();
        return new ResponseResult<>(200, "退出登录", logout);
    }
}
