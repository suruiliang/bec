package com.bec.security.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.security.core.support.Result;
import com.bec.security.core.utils.ResultUtil;
import com.bec.security.core.utils.SecurityUtils;
import com.bec.security.demo.model.AuthUser;
import com.bec.security.demo.service.AuthUserService;
import com.github.pagehelper.PageHelper;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	private Logger logger=LoggerFactory.getLogger(getClass());
	@Autowired
	private AuthUserService authUserService;

	@GetMapping(value = "/me")
	public Result<Authentication> me(){
		Authentication authentication=SecurityUtils.getAuthentication();
		logger.info("authentication="+authentication.getPrincipal());
		return ResultUtil.successO(authentication);
	}
	@GetMapping(value = "/list")
	public Result<AuthUser> list(AuthUser authUser,Integer pageNum,Integer pageSize){
		if(pageNum!=null&&pageSize!=null) {
			PageHelper.startPage(pageNum, pageSize);
		}
		return ResultUtil.successL(authUserService.selectAuthUser(authUser));
	}
	
}
