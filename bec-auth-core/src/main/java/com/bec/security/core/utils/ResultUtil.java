package com.bec.security.core.utils;

import java.util.List;

import com.bec.security.core.exception.EnumType;
import com.bec.security.core.support.Result;
import com.github.pagehelper.PageInfo;

/**
 * @author suruiliang
 * @version 创建时间：2018年4月16日 下午1:10:42
 * @ClassName 类名称
 * @Description 类描述
 */
public class ResultUtil {
	@SuppressWarnings("unchecked")
	public static <T> Result<T> success(T data) {
		Result<T> result=new Result<>();
		result.setCode(200);
		result.setData(data);
		if (data instanceof List<?>) {
			result.setData((T)new PageInfo<T>((List<T>)data));
		}
		result.setMsg("成功");
		return result;
	}
	public static <T> Result<T> error(Integer code,String msg) {
		Result<T> result=new Result<>();
		result.setCode(code);
		result.setMsg(msg);
		return result;
	}
	public static <T> Result<T> error(EnumType enumType) {
		Result<T> result=new Result<>();
		result.setCode(enumType.getCode());
		result.setMsg(enumType.getMsg());
		return result;
	}
}
