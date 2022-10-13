//package com.ink.security.service.impl;
//
//import com.ink.security.bean.LoginUser;
//import com.ink.security.service.LoginService;
//import com.ink.security.utils.RedisCache;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.stereotype.Service;
//
//import java.util.Objects;
//
//@RequiredArgsConstructor
//@Service
//public class LoginServiceImpl implements LoginService {
//    private final AuthenticationManager authenticationManager;
//    private final RedisCache redisCache;
//
//    @Override
//    public void login(String username, String password) {
//        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, password);
//        Authentication authenticate = authenticationManager.authenticate(token);
//        if (Objects.isNull(authenticate)){
//            throw new RuntimeException("password error");
//        }
//         LoginUser loginUser = (LoginUser) authenticate.getCredentials();
//
//    }
//}
