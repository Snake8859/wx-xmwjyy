package com.xmwjyy.wxx.mapper;

import java.util.List;

import com.xmwjyy.wxx.pojo.CustomAuthOrAuditItem;
import com.xmwjyy.wxx.pojo.CustomInstrument;
import com.xmwjyy.wxx.pojo.TbInstrument;
import com.xmwjyy.wxx.pojo.TbUser;
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
	
	/**
	 * 查询仪器基本信息列表
	 * @return
	 */
	public List<CustomInstrument> selectInstrumentList();
	
	/**
	 * 查询仪器绑定用户
	 * @return
	 */
	public List<TbUser> selectInstrumentBindUserListBySncode(String sncode);
	
	/**
	 * 根据openid查询用户绑定的仪器
	 * @param openid
	 * @return
	 */
	public List<TbInstrument> selectInstrumentListByOpenid(String openid);
}
