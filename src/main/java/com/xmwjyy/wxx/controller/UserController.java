package com.xmwjyy.wxx.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
/**
 * 用户管理Controller
 * @author Snake8859
 *
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xmwjyy.wxx.common.utils.WxResult;
import com.xmwjyy.wxx.pojo.TbAuthenticationPicture;
import com.xmwjyy.wxx.pojo.TbUser;
import com.xmwjyy.wxx.pojo.TbUserAuthentication;
import com.xmwjyy.wxx.service.CommonService;
import com.xmwjyy.wxx.service.UserService;
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private CommonService commonService;
	
	/**
	 * 更新用户信息
	 * @param tbUser
	 * @return
	 */
	@RequestMapping(value="/user/updateUserInfo",method=RequestMethod.POST)
	@ResponseBody
	public WxResult updateUserInfo(TbUser tbUser){
		WxResult wxResult = userService.updateUserInfo(tbUser);
		return wxResult;
	}
	
	/**
	 * 用户点击收藏
	 * @param tcid
	 * @param openid
	 * @return
	 */
	@RequestMapping(value="/user/addCollection")
	@ResponseBody
	public WxResult addCollection(String tcid,String openid){
		WxResult wxResult = userService.saveCollection(tcid, openid);
		return wxResult;
	}
	
	/**
	 * 用户查询我的收藏
	 * @param openid
	 * @return
	 */
	@RequestMapping(value="/user/getCollection")
	@ResponseBody
	public WxResult getCollection(String openid){
		WxResult wxResult = userService.queryCollection(openid);
		return wxResult;
	}
	
	/**
	 * 用户远程鉴定内容保存
	 * @param tbUserAuthentication
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/user/saveAuthItem",method=RequestMethod.POST)
	@ResponseBody
	public WxResult saveAuthItem(TbUserAuthentication tbUserAuthentication,HttpServletRequest request){
		//获得鉴定内容图片的地址列表
		String picUrlList = request.getParameter("picUrl");
		WxResult wxResult = userService.saveAuthItem(tbUserAuthentication);
		if(wxResult.getStatus()==200){
			//若远程鉴定基本内容保存成功
			WxResult wxResult1 = userService.saveAuthPic(wxResult.getData().toString(), picUrlList);
			return wxResult1;
		}
		//远程鉴定基本内容保存失败
		return wxResult;
	}
	
	/**
	 * 用户远程鉴定内容图片保存
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/user/saveAuthPic")
	@ResponseBody
	public WxResult saveAuthPic(String uaid,String picUrlList){
		return null;
	}
	
	
	/**
	 * 用户查询远程鉴定结果 -- 初始化远程鉴定项结果基本内容
	 * @param openid
	 * @return
	 */
	@RequestMapping(value="/user/getAuthItem")
	@ResponseBody
	public WxResult getAuthItem(String openid){
		WxResult wxResult = userService.queryAuthItem(openid);
		return wxResult;
	}
	
	
	/**
	 * 用户查询远程鉴定结果 -- 查看远程鉴定项结果详细内容
	 * @param uaid
	 * @return
	 */
	@RequestMapping(value="/user/getAuthItemInfo")
	@ResponseBody
	public WxResult getAuthItemInfo(String uaid){
		WxResult wxResult = commonService.queryAuthOrAuditItem(uaid);
		return wxResult;
	}
}
