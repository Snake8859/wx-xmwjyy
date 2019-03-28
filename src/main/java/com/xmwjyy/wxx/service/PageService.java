package com.xmwjyy.wxx.service;

import com.xmwjyy.wxx.common.utils.WxResult;
import com.xmwjyy.wxx.pojo.CustomResult;
import com.xmwjyy.wxx.pojo.TbUser;

/**
 * 页面服务接口
 * @author Snake8859
 *
 */
public interface PageService {

	/**
	 * 系统登录
	 * @param code
	 * @return
	 */
	public WxResult login(CustomResult customResult);
	
	
	
	/**
	 * 根据技术服务分类id查询技术服务案例
	 * @param tcid
	 * @return
	 */
	public WxResult initCase(String tcid);
	
	/**
	 * 根据openid查询用户信息
	 * @param openid
	 * @return
	 */
	public WxResult queryUserInfo(String openid);


	/**
	 * 根据openid查询用户未阅读数
	 * @param openid
	 * @return
	 */
	public WxResult queryUnreadCount(String openid);


	/**
	 * 根据uaid修改阅读状态
	 * @param uaid
	 * @return
	 */
	public WxResult updateUnreadSataus(String uaid);


	/**
	 * 查询案例数
	 * @return
	 */
	public WxResult queryCaseCount();


	/**
	 * 查询未审核数
	 * @return
	 */
	public WxResult queryUnAuditNumber();
	
}
