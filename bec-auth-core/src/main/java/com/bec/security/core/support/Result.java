package com.bec.security.core.support;

import java.util.List;

import com.github.pagehelper.PageInfo;

import lombok.Data;

/**
 * @author suruiliang
 * @version 创建时间：2018年4月11日 下午5:10:10
 * @ClassName 类名称
 * @Description 类描述
 */
@Data
public class Result<T> {
	private Integer code;
	private String msg;
	private List<T> list;
	private T obj;
	private Integer pageNum;
	private Integer pageSize;
	private Integer size;
	private Long total;
	private Integer pages;
	private Integer prePage;
	private Integer nextPage;
	private Boolean isFirstPage;
	private Boolean isLastPage;
	private Boolean hasPreviousPage;
	private Boolean hasNextPage;
	public void setPageInfo(PageInfo<T> pageInfo) {
		if (pageInfo!=null) {
			this.pageNum=pageInfo.getPageNum();
			this.pageSize=pageInfo.getPageSize();
			this.size=pageInfo.getSize();
			this.total=pageInfo.getTotal();
			this.pages=pageInfo.getPages();
			this.prePage=pageInfo.getPrePage();
			this.nextPage=pageInfo.getNextPage();
			this.isFirstPage=pageInfo.isIsFirstPage();
			this.isLastPage=pageInfo.isIsLastPage();
			this.hasPreviousPage=pageInfo.isHasPreviousPage();
			this.hasNextPage=pageInfo.isHasNextPage();
		}
	}
}
