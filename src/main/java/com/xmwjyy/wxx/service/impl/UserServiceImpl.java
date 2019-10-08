package com.xmwjyy.wxx.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.xmwjyy.wxx.common.utils.UuidUtil;
import com.xmwjyy.wxx.common.utils.WxResult;
import com.xmwjyy.wxx.mapper.CustomeMapper;
import com.xmwjyy.wxx.mapper.TbAuthenticationPictureMapper;
import com.xmwjyy.wxx.mapper.TbTechnicalClassificationMapper;
import com.xmwjyy.wxx.mapper.TbUserAuthenticationMapper;
import com.xmwjyy.wxx.mapper.TbUserCollectionMapper;
import com.xmwjyy.wxx.mapper.TbUserMapper;
import com.xmwjyy.wxx.pojo.CustomAuthOrAuditItem;
import com.xmwjyy.wxx.pojo.TbAuthenticationPicture;
import com.xmwjyy.wxx.pojo.TbTechnicalClassification;
import com.xmwjyy.wxx.pojo.TbUser;
import com.xmwjyy.wxx.pojo.TbUserAuthentication;
import com.xmwjyy.wxx.pojo.TbUserCollection;
import com.xmwjyy.wxx.pojo.TbUserCollectionExample;
import com.xmwjyy.wxx.service.UserService;
/**
 * 用户服务实现类
 * @author Snake8859
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private TbUserMapper tbUserMapper;
	
	@Autowired
	private TbUserCollectionMapper tbUserCollectionMapper;
	
	@Autowired
	private TbTechnicalClassificationMapper technicalClassificationMapper;
	
	@Autowired
	private TbUserAuthenticationMapper tbUserAuthenticationMapper;
	
	@Autowired
	private TbAuthenticationPictureMapper tbAuthenticationPictureMapper;
	
	@Autowired
	private CustomeMapper customeMapper;
	
	@Override
	public WxResult updateUserInfo(TbUser tbUser){
		//老用户信息
		TbUser oldUser = tbUserMapper.selectByPrimaryKey(tbUser.getOpenid());
		if(oldUser==null){
			return WxResult.build(404, "用户不存在");
		}
		boolean flag = false;
		//作新老用户信息比较
		if(!oldUser.getNickname().equals(tbUser.getNickname())){
			flag = true;
		}
		if(!oldUser.getUserpic().equals(tbUser.getUserpic())){
			flag = true;
		}
		
		if(flag){
			//根据openid更新用户信息
			try {
				tbUser.setUpdatetime(new Date());
				int i = tbUserMapper.updateByPrimaryKeySelective(tbUser);
				if(i>0){
					return WxResult.build(200, "更新成功");
				}
			} catch (Exception e) {
				e.printStackTrace();
				return WxResult.build(404, "更新失败");
			}
			return WxResult.build(404, "更新失败");
		}else{
			return WxResult.build(200, "用户信息未改变");
		}
	}
	
	@Override
	public WxResult saveCollection(String tcid, String openid) {
		if(tcid.equals("")||tcid==null){
			return WxResult.build(404, "收藏失败 -- tcid为空");
		}
		if(openid.equals("")||openid==null){
			return WxResult.build(404, "收藏失败 -- openid为空");
		}
		//创建用户收藏对象
		TbUserCollection tbUserCollection = new TbUserCollection();
		//设置ucid
		tbUserCollection.setUcid(UuidUtil.get32UUID());
		//设置openid
		tbUserCollection.setOpenid(openid);
		//设置tcid
		Integer tcid_int = Integer.parseInt(tcid); 
		tbUserCollection.setTcid(tcid_int);
		//设置创建时间和修改时间
		tbUserCollection.setCreatetime(new Date());
		tbUserCollection.setUpdatetime(new Date());
		try {
			int i = tbUserCollectionMapper.insertSelective(tbUserCollection);
			if(i>0){
				return WxResult.build(200, "收藏成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return WxResult.build(404, "收藏失败 -- 插入数据过程失败");
		}
		return WxResult.build(404, "收藏失败 -- 插入数据过程失败");
	}

	@Override
	public WxResult queryCollection(String openid) {
		if(openid==null||openid.equals("")){
			return WxResult.build(404, "查询收藏失败 -- openid为空");
		}
		//根据openid从用户收藏表中，查询该用户收藏的技术服务
		TbUserCollectionExample example = new TbUserCollectionExample();
		example.createCriteria().andOpenidEqualTo(openid);
		List<TbUserCollection> list = tbUserCollectionMapper.selectByExample(example);
		if(list==null||list.size()==0){
			//用户未收藏任何内容
			return WxResult.build(200, "用户未收藏任何内容");
		}
		List<TbTechnicalClassification> list1 = new ArrayList<>();
		for (TbUserCollection tbUserCollection : list) {
			Integer tcid = tbUserCollection.getTcid();
			//根据tcid查询技术服务分类
			TbTechnicalClassification tbTechnicalClassification = technicalClassificationMapper.selectByPrimaryKey(tcid);
			list1.add(tbTechnicalClassification);
		}
		return WxResult.build(200, "查询收藏成功",list1);
	}

	@Override
	public WxResult saveAuthItem(TbUserAuthentication tbUserAuthentication) {
		//判断鉴定是否为空
		if(tbUserAuthentication==null){
			return WxResult.build(404, "鉴定项保存失败 -- 鉴定项为空");
		}
		//补全其他信息
		tbUserAuthentication.setUaid(UuidUtil.get32UUID());
		tbUserAuthentication.setReplystate("0");
		tbUserAuthentication.setAuditstate("0");
		tbUserAuthentication.setIsread("0");
		tbUserAuthentication.setCreatetime(new Date());
		tbUserAuthentication.setUpdatetime(new Date());
		try {
			int i = tbUserAuthenticationMapper.insert(tbUserAuthentication);
			if(i>0){
				return WxResult.build(200, "鉴定项保存成功",tbUserAuthentication.getUaid());
			}
		} catch (Exception e) {
			e.printStackTrace();
			return WxResult.build(404, "鉴定项保存失败 -- 鉴定项插入数据时失败");
		}
		return WxResult.build(404, "鉴定项保存失败 -- 鉴定项插入数据时失败");
	}
	

	@Override
	public WxResult saveAuthPic(String uaid, String picUrlList) {
		//判断picUrlList是否为空
		if(picUrlList==null||picUrlList.equals("")){
			return WxResult.build(404, "鉴定项图片插入失败 -- 图片为空");
		}
		String[] urlList = picUrlList.split(",");
		for (String url : urlList) {
			TbAuthenticationPicture tbAuthenticationPicture = new TbAuthenticationPicture();
			tbAuthenticationPicture.setApid(UuidUtil.get32UUID());
			tbAuthenticationPicture.setPicname(url);
			tbAuthenticationPicture.setUaid(uaid);
			tbAuthenticationPicture.setCreatetime(new Date());
			tbAuthenticationPicture.setUpdatetime(new Date());
			try {
				 tbAuthenticationPictureMapper.insert(tbAuthenticationPicture);
			} catch (Exception e) {
				e.printStackTrace();
				return WxResult.build(404, "鉴定项图片:"+url+" -- 保存失败");
			}
		}
		return WxResult.build(200, "鉴定项基本内容和图片保存成功");
	}

	@Override
	public WxResult queryAuthItem(String openid) {
		//判断openid是否为空
		if(openid==null||openid.equals("")){
			return WxResult.build(404, "鉴定项查询失败 -- openid为空");
		}
		//查询用户的鉴定项
		List<CustomAuthOrAuditItem> list = customeMapper.selectAuthItem(openid);
		if(list==null||list.size()==0){
			return WxResult.build(200, "用户暂时没有任何鉴定项");
		}
		return WxResult.build(200, "鉴定项查询成功", list);
	}

	

}
