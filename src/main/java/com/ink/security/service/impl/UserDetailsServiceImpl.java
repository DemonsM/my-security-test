package com.ink.security.service.impl;

import com.ink.security.bean.LoginUser;
import com.ink.security.bean.SysUser;
import com.ink.security.mapper.SysUserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final SysUserMapper sysUserMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = sysUserMapper.selectByUserName(username);
        if (Objects.isNull(sysUser)) {
            throw new RuntimeException("用户名或密码错误");
        }
        return new LoginUser(sysUser);
    }
}
