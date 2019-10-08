package com.xmwjyy.wxx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xmwjyy.wxx.common.utils.WxResult;
import com.xmwjyy.wxx.pojo.TbTechnicalCase;
import com.xmwjyy.wxx.pojo.TbUserAuthentication;
import com.xmwjyy.wxx.service.CommonService;
import com.xmwjyy.wxx.service.SystemService;

/**
 * 系统管理Controller
 * @author Snake8859
 *
 */
@Controller
public class SystemController {

	@Autowired
	private SystemService systemService;
	
	@Autowired
	private CommonService commonService;
	
	/**
	 * 管理员鉴定审核 -- 初始化远程鉴定审核项数据
	 * @return
	 */
	@RequestMapping(value="/system/getAuditItem")
	@ResponseBody
	public WxResult getAuditItem(){
		WxResult wxResult = systemService.queryAuditItem();
		return wxResult;
	}
	
	
	
	/**
	 * 管理员鉴定审核 -- 查看远程鉴定审核项详细内容
	 * @param uaid
	 * @return
	 */
	@RequestMapping(value="/system/getAuditItemInfo")
	@ResponseBody
	public WxResult getAuditItemInfo(String uaid){
		WxResult wxResult = commonService.queryAuthOrAuditItem(uaid);
		return wxResult;
	}
	
	
	/**
	 * 管理员审核通过
	 * @param tbUserAuthentication
	 * @return
	 */
	@RequestMapping(value="/system/passAudit",method= RequestMethod.POST)
	@ResponseBody
	public WxResult passAudit(TbUserAuthentication tbUserAuthentication){
		WxResult wxResult = systemService.updateAuditState(tbUserAuthentication);
		return wxResult;
	}
	
	/**
	 * 管理员修改回复
	 * @param uaid
	 * @param expertreply
	 * @return
	 */
	@RequestMapping(value="/system/changeReply",method= RequestMethod.POST)
	@ResponseBody
	public WxResult changeReply(String uaid,String expertreply){
		WxResult wxResult = systemService.updateReply(uaid,expertreply);
		return wxResult;
	}
	
	/**
	 * 管理员案例上传 -- 案例信息保存
	 * @param tbTechnicalCase
	 * @return
	 */
	@RequestMapping(value="/system/saveCase",method= RequestMethod.POST)
	@ResponseBody
	public WxResult saveCase(TbTechnicalCase tbTechnicalCase){
		WxResult wxResult = systemService.saveCase(tbTechnicalCase);
		return wxResult;
	}
	
	
}
