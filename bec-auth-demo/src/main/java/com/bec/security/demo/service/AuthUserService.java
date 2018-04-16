package com.bec.security.demo.service;

import java.util.List;

import com.bec.security.demo.model.AuthUser;

public interface AuthUserService {
	public List<AuthUser> selectAuthUser(AuthUser authUser);
}
