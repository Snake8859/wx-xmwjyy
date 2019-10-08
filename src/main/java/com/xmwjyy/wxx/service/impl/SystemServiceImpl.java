package com.xmwjyy.wxx.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xmwjyy.wxx.common.utils.WxResult;
import com.xmwjyy.wxx.mapper.CustomeMapper;
import com.xmwjyy.wxx.mapper.TbTechnicalCaseMapper;
import com.xmwjyy.wxx.mapper.TbUserAuthenticationMapper;
import com.xmwjyy.wxx.pojo.CustomAuthOrAuditItem;
import com.xmwjyy.wxx.pojo.TbTechnicalCase;
import com.xmwjyy.wxx.pojo.TbUserAuthentication;
import com.xmwjyy.wxx.pojo.TbUserAuthenticationExample;
import com.xmwjyy.wxx.service.SystemService;
/**
 * 系统服务实现类
 * @author Administrator
 *
 */
@Service
public class SystemServiceImpl implements SystemService {

	@Autowired
	private TbTechnicalCaseMapper tbTechnicalCaseMapper; 
	
	@Autowired
	private TbUserAuthenticationMapper tbUserAuthenticationMapper;
	
	@Autowired
	private  CustomeMapper customeMapper;
	
	@Override
	public WxResult queryAuditItem() {
		List<CustomAuthOrAuditItem> list = customeMapper.selectAuditItem();
		return WxResult.build(200, "审核项查询成功", list);
	}

	@Override
	public WxResult updateAuditState(TbUserAuthentication tbUserAuthentication) {
		// 判断鉴定项是否为空
		if(tbUserAuthentication==null){
			return WxResult.build(404, "审核失败 -- 鉴定项为空");
		}
		//修改审核状态
		tbUserAuthentication.setAuditstate("1");
		try {
			int i = tbUserAuthenticationMapper.updateByPrimaryKeySelective(tbUserAuthentication);
			if(i>0){
				return WxResult.build(200, "审核成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return WxResult.build(404, "审核失败 -- 审核修改状态失败");
		}
		return WxResult.build(404, "审核失败 -- 审核修改状态失败");
	}

	@Override
	public WxResult saveCase(TbTechnicalCase tbTechnicalCase) {
		//判断案例是否为空
		if(tbTechnicalCase==null){
			return WxResult.build(404, "保存失败 -- 案例对象为空");
		}
		//补全信息
		tbTechnicalCase.setRecommend("0");
		tbTechnicalCase.setCreatetime(new Date());
		tbTechnicalCase.setUpdatetime(new Date());
		try {
			int i = tbTechnicalCaseMapper.insert(tbTechnicalCase);
			if(i>0){
				return WxResult.build(200, "保存成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return WxResult.build(404, "保存失败 -- 插入数据时失败");
		}
		return WxResult.build(404, "保存失败 -- 插入数据时失败");
	}

	@Override
	public WxResult updateReply(String uaid, String expertreply) {
		//判断uaid是否为空
		if(uaid==null||uaid.equals("")){
			return WxResult.build(404, "修改失败 -- uaid为空");
		}
		//根据uaid查询鉴定项
		TbUserAuthentication tbUserAuthentication = 
				tbUserAuthenticationMapper.selectByPrimaryKey(uaid);
		//修改专家回复
		tbUserAuthentication.setExpertreply(expertreply);
		tbUserAuthentication.setUpdatetime(new Date());
		//更新
		try {
			int i = tbUserAuthenticationMapper.updateByPrimaryKeySelective(tbUserAuthentication);
			if(i>0){
				return WxResult.build(200, "修改成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return WxResult.build(404, "修改失败 -- 更新数据时失败");
		}
		return WxResult.build(404, "修改失败 -- 更新数据时失败");
	}

}
