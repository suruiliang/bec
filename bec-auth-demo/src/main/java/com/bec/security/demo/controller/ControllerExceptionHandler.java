package com.bec.security.demo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bec.security.core.exception.BecException;
import com.bec.security.core.support.Result;
import com.bec.security.core.utils.ResultUtil;


@ControllerAdvice
public class ControllerExceptionHandler {

	
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Result<?> handleException(Exception ex) {
		ex.printStackTrace();
		if (ex instanceof BecException) {
			return ResultUtil.error(((BecException)ex).getCode(),ex.getMessage());
		}
		return ResultUtil.error(500,ex.getMessage());
	}
}
