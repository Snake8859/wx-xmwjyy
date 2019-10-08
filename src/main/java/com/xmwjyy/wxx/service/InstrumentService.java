package com.xmwjyy.wxx.service;

import com.xmwjyy.wxx.common.utils.WxResult;
import com.xmwjyy.wxx.pojo.TbInstrument;
import com.xmwjyy.wxx.pojo.TbInstrumentUser;

/**
 * 仪器服务接口
 * @author snake8859
 *
 */
public interface InstrumentService {

	/**
	 * 接收仪器发送信息
	 * @param message
	 * @return
	 */
	public WxResult receiveInstrumentInfo(String message);
	
	
	/**
	 * 获取仪器信息列表
	 * @return
	 */
	//public WxResult getInstrumentInfoList();

	/**
	 * 保存仪器
	 * @param tbInstrument
	 * @return
	 */
	public WxResult saveInstrument(TbInstrument tbInstrument);

	/**
	 * 获取仪器信息列表
	 * @return
	 */
	public WxResult queryInstrumentList();

	/**
	 * 根据sncode查询仪器所绑定的用户
	 * @param sncode
	 * @return
	 */
	public WxResult queryInstrumentUserList(String sncode);

	/**
	 * 根据openid解绑用户
	 * @param openid
	 * @param sncode 
	 * @return
	 */
	public WxResult deleteInstrumentUserByOpenid(String openid, String sncode);

	/**
	 * 用户绑定仪器
	 * @param tbInstrumentUser
	 * @return
	 */
	public WxResult addInstrumentUser(TbInstrumentUser tbInstrumentUser);

	/**
	 * 根据openid查询用户绑定的仪器
	 * @param openid
	 * @return
	 */
	public WxResult queryInstrumentListByOpenid(String openid);

	/**
	 * 根据sncode查询仪器鉴定结果列表
	 * @param sncode
	 * @return
	 */
	public WxResult queryInstrumentResultListBySncode(String sncode);

	/**
	 * 根据iid查询仪器鉴定内容
	 * @param iid
	 * @return
	 */
	public WxResult queryInstrumentResultByIid(String iid);
	
}
