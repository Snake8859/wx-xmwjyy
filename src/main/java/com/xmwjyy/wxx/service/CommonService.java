package com.xmwjyy.wxx.service;

import com.xmwjyy.wxx.common.utils.WxResult;

/**
 * 公共服务接口
 * @author Snake8859
 *
 */
public interface CommonService {

	/**
	 * 根据鉴定id查询  鉴定项or审核项
	 * @param uaid
	 * @return
	 */
	public WxResult queryAuthOrAuditItem(String uaid);
	
	
}
