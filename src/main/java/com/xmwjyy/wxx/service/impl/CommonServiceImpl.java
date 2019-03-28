package com.xmwjyy.wxx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xmwjyy.wxx.common.utils.WxResult;
import com.xmwjyy.wxx.mapper.CustomeMapper;
import com.xmwjyy.wxx.pojo.CustomAuthOrAuditInfo;
/**
 * 公共服务实现类
 * @author Administrator
 *
 */
@Service
public class CommonServiceImpl implements com.xmwjyy.wxx.service.CommonService {

	@Autowired
	private CustomeMapper customeMapper;
	
	@Override
	public WxResult queryAuthOrAuditItem(String uaid) {
		// 判断uaid是否为空
		if(uaid==null||uaid.equals("")){
			return WxResult.build(404, "查询失败 -- uaid为空");
		}
		CustomAuthOrAuditInfo authOrAuditInfo = customeMapper.selectAuthOrAuditInfo(uaid);
		if(authOrAuditInfo!=null){
			return WxResult.build(200, "查询成功", authOrAuditInfo);
		}
		return WxResult.build(404, "查询失败 -- 详细内容为空");
	}


}
