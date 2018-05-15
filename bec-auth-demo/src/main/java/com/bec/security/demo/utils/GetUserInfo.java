package com.bec.security.demo.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bec.security.core.utils.SecurityUtils;
import com.bec.security.demo.model.AuthUser;
import com.bec.security.demo.service.AuthUserService;

@Component
public class GetUserInfo {
	@Autowired
	private AuthUserService userService;
	
	public  AuthUser getInfo() {
		String userName = SecurityUtils.getCurrentUserUsername();//获取用户名
		AuthUser user = userService.selectAuthUserByUserName(userName); //获取用户信息的方法
		return user;
	}
}
