package com.xmwjyy.wxx.service;

import com.xmwjyy.wxx.common.utils.WxResult;
import com.xmwjyy.wxx.pojo.TbTechnicalCase;
import com.xmwjyy.wxx.pojo.TbUserAuthentication;

/**
 * 系统服务接口
 * @author Sanke8859
 *
 */
public interface SystemService {

	/**
	 * 查询远程鉴定审核项基本信息
	 * @return
	 */
	public WxResult queryAuditItem();
	
	//提取到公共服务接口里
	/**
	 * 根据鉴定项id查询鉴定内容
	 * @param uaid
	 * @return
	 */
	//public WxResult queryAuditItemInfo(String uaid);
	
	/**
	 * 修改审核状态
	 * @param tbUserAuthentication
	 * @return
	 */
	public WxResult updateAuditState(TbUserAuthentication tbUserAuthentication);
	
	
	/**
	 * 保存案例信息
	 * @param tbTechnicalCase
	 * @return
	 */
	public WxResult saveCase(TbTechnicalCase tbTechnicalCase);

	/**
	 * 修改专家回复
	 * @param uaid
	 * @param expertreply
	 * @return
	 */
	public WxResult updateReply(String uaid, String expertreply);
}
