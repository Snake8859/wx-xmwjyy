package com.xmwjyy.wxx.service.impl;

import java.util.Date;
import java.util.List;

import org.joda.time.ReadWritableDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.xmwjyy.wxx.common.utils.UuidUtil;
import com.xmwjyy.wxx.common.utils.WxResult;
import com.xmwjyy.wxx.mapper.TbTechnicalCaseMapper;
import com.xmwjyy.wxx.mapper.TbUserAuthenticationMapper;
import com.xmwjyy.wxx.mapper.TbUserMapper;
import com.xmwjyy.wxx.pojo.CustomNumber;
import com.xmwjyy.wxx.pojo.CustomResult;
import com.xmwjyy.wxx.pojo.TbTechnicalCase;
import com.xmwjyy.wxx.pojo.TbTechnicalCaseExample;
import com.xmwjyy.wxx.pojo.TbUser;
import com.xmwjyy.wxx.pojo.TbUserAuthentication;
import com.xmwjyy.wxx.pojo.TbUserAuthenticationExample;
import com.xmwjyy.wxx.service.PageService;
/**
 * 页面服务实现类
 * @author Administrator
 *
 */
@Service
public class PageServiceImpl implements PageService {

	@Autowired
	private TbUserMapper tbUserMapper;
	
	@Autowired
	private TbTechnicalCaseMapper tbTechnicalCaseMapper;
	
	@Autowired
	private TbUserAuthenticationMapper tbUserAuthenticationMapper;
	
	//默认昵称前缀
	@Value("${DEFAULT_NICKNAME}")
	private String DEFAULT_NICKNAME;
	
	//默认图片
	@Value("${DEFAULT_PICTURE}")
	private String DEFAULT_PICTURE;
	
	
	@Override
	public WxResult login(CustomResult customResult) {
		// 获取openid
		String openid = customResult.getOpenid();
		if(openid==null||openid.equals("")){
			return WxResult.build(404, "登录失败");
		}
		//根据openid查询是否已有该用户
		TbUser tbUser = tbUserMapper.selectByPrimaryKey(openid);
		if(tbUser!=null){
			//系统中已有该用户
			return WxResult.build(200, "已登录",customResult);
		}
		//若系统中未有该用户
		tbUser = new TbUser();
		//补全部分信息
		tbUser.setOpenid(openid);
		tbUser.setNickname(DEFAULT_NICKNAME+"_"+UuidUtil.get8UUID());
		tbUser.setUserpic(DEFAULT_PICTURE);
		tbUser.setIsadministrator("1");
		tbUser.setCreatetime(new Date());
		tbUser.setUpdatetime(new Date());
		try {
			int i = tbUserMapper.insert(tbUser);
			//测试事务
			//int j = 1/0;
			if(i>0){
				return WxResult.build(200, "初始化登录成功",customResult);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return WxResult.build(404, "登录失败");
			// TODO: handle exception
		}
		return WxResult.build(404, "登录失败");
	}


	@Override
	public WxResult initCase(String tcid) {
		//判断tcid是否为空或空串
		if(tcid.equals("")||tcid==null){
			return WxResult.build(404, "初始化失败 - tcid为空");
		}
		//根据tcid查询相应的案例
		TbTechnicalCaseExample example = new TbTechnicalCaseExample();
		Integer tcid_int = Integer.parseInt(tcid);
		example.createCriteria().andTcidEqualTo(tcid_int);
		List<TbTechnicalCase> list = tbTechnicalCaseMapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			//查询到结果
			return WxResult.build(200, "初始化成功",list);
		}
		return WxResult.build(404, "初始化失败 - 未查询到数据");
	}


	@Override
	public WxResult queryUserInfo(String openid) {
		//判断openid是否为空
		if(openid==null||openid.equals("")){
			return WxResult.build(404, "查询用户信息失败 -- openid为空");
		}
		TbUser tbUser = tbUserMapper.selectByPrimaryKey(openid);
		if(tbUser==null){
			return WxResult.build(404, "查询用户信息失败 -- 用户不存在");
		}
		return WxResult.build(200, "查询成功", tbUser);
	}


	@Override
	public WxResult queryUnreadCount(String openid) {
		//判断openid是否为空
		if(openid==null||openid.equals("")){
			return WxResult.build(404, "查询失败-- openid为空");
		}
		TbUserAuthenticationExample example = new TbUserAuthenticationExample();
		//设置条件
		example.createCriteria().andOpenidEqualTo(openid).andAuditstateEqualTo("1").andIsreadEqualTo("0");
		//执行查询
		int count = tbUserAuthenticationMapper.countByExample(example);
		return WxResult.build(200, "查询成功", count);
	}


	@Override
	public WxResult updateUnreadSataus(String uaid) {
		//判断uaid是否为空
		if(uaid==null||uaid.equals("")){
			return WxResult.build(404, "修改失败 -- uaid为空");
		}
		//根据条件查询阅读情况
		TbUserAuthenticationExample example = new TbUserAuthenticationExample();
		example.createCriteria().andUaidEqualTo(uaid).andAuditstateEqualTo("1").andReplystateEqualTo("1");
		List<TbUserAuthentication> list = tbUserAuthenticationMapper.selectByExample(example);
		//判断是否存在
		if(list==null||list.size()==0){
			return WxResult.build(404, "修改失败 -- 该鉴定项还未回复");
		}
		//取出鉴定项
		TbUserAuthentication tbUserAuthentication = list.get(0);
		String isread = tbUserAuthentication.getIsread();
		if(isread.equals("1")){
			return WxResult.build(200, "修改成功 -- 已阅读状态，无需修改");
		}
		tbUserAuthentication.setIsread("1");
		try {
			int i = tbUserAuthenticationMapper.updateByPrimaryKeySelective(tbUserAuthentication);
			if(i>0){
				return WxResult.build(200, "修改成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return WxResult.build(200, "修改失败 -- 数据库修改时失败");
		}
		
		return WxResult.build(200, "修改失败 -- 数据库修改时失败");
	}


	@Override
	public WxResult queryCaseCount() {
		CustomNumber customNumber  = new CustomNumber();
		//核生化培训班案例数
		TbTechnicalCaseExample example_nuclear = new TbTechnicalCaseExample();
		example_nuclear.createCriteria().andTcidEqualTo(1);
		
		
		//产品培训案例数
		TbTechnicalCaseExample example_equipment = new TbTechnicalCaseExample();
		example_equipment.createCriteria().andTcidEqualTo(2);
		
		//设备实验室案例数
		TbTechnicalCaseExample example_equipment_metering = new TbTechnicalCaseExample();
		example_equipment_metering.createCriteria().andTcidEqualTo(3);
		
		//大型活动支持案例数
		TbTechnicalCaseExample example_big_event = new TbTechnicalCaseExample();
		example_big_event.createCriteria().andTcidEqualTo(4);
		
		//查询
		try {
			int nuclear_count = tbTechnicalCaseMapper.countByExample(example_nuclear);
			customNumber.setNuclear_count(nuclear_count);
			
			int equipment_count = tbTechnicalCaseMapper.countByExample(example_equipment);
			customNumber.setEquipment_count(equipment_count);
			
			int equipment_metering_count = tbTechnicalCaseMapper.countByExample(example_equipment_metering);
			customNumber.setEquipment_metering_count(equipment_metering_count);
			
			int big_event_count = tbTechnicalCaseMapper.countByExample(example_big_event);
			customNumber.setBig_event_count(big_event_count);
		} catch (Exception e) {
			e.printStackTrace();
			return WxResult.build(404, "查询失败");
		}
		return WxResult.build(200, "查询成功", customNumber);
	}


	@Override
	public WxResult queryUnAuditNumber() {
		//查询未审核数
		TbUserAuthenticationExample example = new TbUserAuthenticationExample();
		example.createCriteria().andAuditstateEqualTo("0").andReplystateEqualTo("1");
		int unAuditCount = tbUserAuthenticationMapper.countByExample(example);
		return WxResult.build(200, "查询成功", unAuditCount);
	}
	

}
