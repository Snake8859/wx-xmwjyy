package com.xmwjyy.wxx.mapper;

import java.util.List;

import com.xmwjyy.wxx.pojo.CustomAuthOrAuditItem;
import com.xmwjyy.wxx.pojo.CustomAuthOrAuditInfo;

public interface CustomeMapper {

	
	/**
	 * 根据openid查询用户鉴定项基本内容
	 * @param openid
	 * @return
	 */
	public List<CustomAuthOrAuditItem> selectAuthItem(String openid);
	
	
	/**
	 * 查询审核项基本内容
	 * @return
	 */
	public List<CustomAuthOrAuditItem> selectAuditItem();

	/**
	 * 查询鉴定项或审核项完整内容
	 * @return
	 */
	public CustomAuthOrAuditInfo selectAuthOrAuditInfo(String uaid);
}
