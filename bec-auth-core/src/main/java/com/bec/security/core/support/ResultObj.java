package com.bec.security.core.support;

import lombok.Getter;
import lombok.Setter;

/**
 * @author suruiliang
 * @version 创建时间：2018年4月11日 下午5:10:10
 * @ClassName 类名称
 * @Description 类描述
 */
@Getter
@Setter
public class ResultObj<T> extends Result<T>{
	private T obj;
}
