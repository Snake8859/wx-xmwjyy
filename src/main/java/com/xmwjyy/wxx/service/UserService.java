package com.xmwjyy.wxx.service;

import com.xmwjyy.wxx.common.utils.WxResult;
import com.xmwjyy.wxx.pojo.TbUser;
import com.xmwjyy.wxx.pojo.TbUserAuthentication;

/**
 * 用户服务接口
 * @author Snake8859
 *
 */
public interface UserService {
	
	
	/**
	 * 用户授权，更新用户信息
	 * @param openid
	 * @return
	 */
	public WxResult updateUserInfo(TbUser tbUser);
	
	/**
	 * 保存用户收藏
	 * @param tcid
	 * @param openid
	 * @return
	 */
	public WxResult saveCollection(String tcid,String openid);
	
	/**
	 * 根据用户openid查询用户收藏
	 * @param openid
	 * @return
	 */
	public WxResult queryCollection(String openid);
	
	/**
	 * 保存用户远程鉴定内容
	 * @param tbUserAuthentication
	 * @return
	 */
	public WxResult saveAuthItem(TbUserAuthentication tbUserAuthentication);
	
	
	/**
	 * 保存用户远程鉴定内容图片
	 * @param uaid
	 * @param picUrlList
	 * @return
	 */
	public WxResult saveAuthPic(String uaid,String picUrlList);
	
	/**
	 * 根据用户openid查询用户远程鉴定结果基本信息
	 * @param openid
	 * @return
	 */
	public WxResult queryAuthItem(String openid);
	
	//提取到公共服务接口里
	/**
	 * 根据鉴定项id查询用户远程鉴定结果详细内容
	 * @param uaid
	 * @return
	 */
	//public WxResult queryAuthItemInfo(String uaid);
}
