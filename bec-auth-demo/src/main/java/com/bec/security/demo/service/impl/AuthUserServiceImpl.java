package com.bec.security.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bec.security.demo.mapper.AuthUserMapper;
import com.bec.security.demo.model.AuthUser;
import com.bec.security.demo.service.AuthUserService;

@Service(value = "authUserService")
public class AuthUserServiceImpl implements AuthUserService {

	@Autowired
    private AuthUserMapper authUserMapper;

	@Override
	public List<AuthUser> selectAuthUser(AuthUser authUser) {
		return authUserMapper.selectAuthUser(authUser);
	}

	@Override
	public AuthUser selectAuthUserByUserName(String userName) {
		return authUserMapper.selectAuthUserByUsername(userName);
	}

    

}
