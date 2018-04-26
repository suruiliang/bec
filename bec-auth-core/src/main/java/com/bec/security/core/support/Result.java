package com.bec.security.core.support;

import com.github.pagehelper.PageInfo;

import lombok.Getter;
import lombok.Setter;

/**
* @author suruiliang
* @version 创建时间：2018年4月26日 下午2:42:08
* @ClassName 类名称
* @Description 类描述
*/
@Getter
@Setter
public class Result<T> {
	private Integer code;
	private String msg;
	public void setPageInfo(PageInfo<T> pageInfo) {};
}
