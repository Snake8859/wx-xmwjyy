package com.xmwjyy.wxx.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
/**
 * 页面初始化管理Controller
 * @author Snake8859
 *
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xmwjyy.wxx.common.utils.GetOpenIdutil;
import com.xmwjyy.wxx.common.utils.JsonUtils;
import com.xmwjyy.wxx.common.utils.WxResult;
import com.xmwjyy.wxx.pojo.CustomResult;
import com.xmwjyy.wxx.pojo.TbUser;
import com.xmwjyy.wxx.service.PageService;
@Controller
public class PageController {

	@Autowired
	private PageService pageService;
	
	@Value("${APPID}")
	private String APPID;
	
	@Value("${APPSECRET}")
	private String APPSECRET;
	
	
	/**
	 * 系统加载前 -- 初始化登录
	 * @param code
	 * @return
	 */
	@RequestMapping(value="/page/getOpenId")
	@ResponseBody
	public WxResult login(String code){
		String appid = APPID;
		String secret = APPSECRET;
		String result = GetOpenIdutil.getopenid(appid, code, secret);
		CustomResult  customResult = JsonUtils.jsonToPojo(result, CustomResult.class);
		WxResult wxResult = pageService.login(customResult);
		return wxResult;
	}
	
	
	
	
	/**
	 * 个人中心加载前 - 获取用户信息
	 * @param openid
	 * @return
	 */
	@RequestMapping(value="/page/queryUserInfo")
	@ResponseBody
	public WxResult queryUserInfo(String openid){
		WxResult wxResult = pageService.queryUserInfo(openid);
		return wxResult;
	}
	
	/**
	 * 案例页面加载前 -- 初始化案例信息
	 * @param tcid
	 * @return
	 */
	@RequestMapping(value="/page/initCase")
	@ResponseBody
	public WxResult initCase(String tcid){
		WxResult wxResult = pageService.initCase(tcid);
		return wxResult;
	}
	
	/**
	 * 个人中心加载前 -- 查询用户未阅读数
	 * @param openid
	 * @return
	 */
	@RequestMapping(value="/page/getUnreadAuthItem")
	@ResponseBody
	public WxResult queryUnreadCount(String openid){
		WxResult wxResult = pageService.queryUnreadCount(openid);
		return wxResult;
	}
	
	/**
	 * 鉴定项详情页面加载后 -- 修改用户阅读状态
	 * @param uaid
	 * @return
	 */
	@RequestMapping(value="/page/changeUnreadStatus")
	@ResponseBody
	public WxResult changeUnreadSataus(String uaid){
		WxResult wxResult = pageService.updateUnreadSataus(uaid);
		return wxResult;
	}
	
	/**
	 * 技术服务页面加载前 -- 查询已有案例数
	 * @return
	 */
	@RequestMapping(value="/page/getCaseNumber")
	@ResponseBody
	public WxResult queryCaseCount(){
		WxResult wxResult = pageService.queryCaseCount();
		return wxResult;
	}
	
	/**
	 * 管理页面加载前 -- 查询未审核数
	 * @return
	 */
	@RequestMapping(value="/page/getUnAuditNumber")
	@ResponseBody
	public WxResult queryUnAuditNumber(){
		WxResult wxResult = pageService.queryUnAuditNumber();
		return wxResult;
	}
	
}
