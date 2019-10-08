package com.xmwjyy.wxx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.sun.tools.classfile.Annotation.element_value;
import com.xmwjyy.wxx.common.utils.UuidUtil;
import com.xmwjyy.wxx.common.utils.WxResult;
import com.xmwjyy.wxx.mapper.CustomeMapper;
import com.xmwjyy.wxx.mapper.TbInstrumentInfoMapper;
import com.xmwjyy.wxx.mapper.TbInstrumentMapper;
import com.xmwjyy.wxx.mapper.TbInstrumentUserMapper;
import com.xmwjyy.wxx.pojo.CustomInstrument;
import com.xmwjyy.wxx.pojo.TbInstrument;
import com.xmwjyy.wxx.pojo.TbInstrumentExample;
import com.xmwjyy.wxx.pojo.TbInstrumentInfo;
import com.xmwjyy.wxx.pojo.TbInstrumentInfoExample;
import com.xmwjyy.wxx.pojo.TbInstrumentUser;
import com.xmwjyy.wxx.pojo.TbInstrumentUserExample;
import com.xmwjyy.wxx.pojo.TbUser;
import com.xmwjyy.wxx.service.InstrumentService;
/**
 * 仪器服务实现类
 * @author snake8859
 *
 */
@Service
public class InstrumentServiceImpl implements InstrumentService {

	//@Autowired
	//private TbInstrumentInfoMapper_old tbInstrumentInfoMapper;
	@Autowired
	private TbInstrumentInfoMapper tbInstrumentInfoMapper;
	
	@Autowired
	private TbInstrumentMapper tbInstrumentMapper;
	
	@Autowired
	private TbInstrumentUserMapper tbInstrumentUserMapper;
	
	@Autowired
	private CustomeMapper customeMapper;
	

	private Gson gson = new Gson();

	/**
	 * 接收仪器信息
	 */
	@Override
	public WxResult receiveInstrumentInfo(String message) {
		//json字符串转对象
		try {
			//TbInstrumentInfo_old tbInstrumentInfo = gson.fromJson(message, TbInstrumentInfo_old.class);
			TbInstrumentInfo tbInstrumentInfo = gson.fromJson(message, TbInstrumentInfo.class);
			if(tbInstrumentInfo!=null){
				tbInstrumentInfo.setIid(UuidUtil.get32UUID());
				//保存数据库
				tbInstrumentInfoMapper.insert(tbInstrumentInfo);
				return WxResult.build(200, "success:ok");			
			}else{
				return WxResult.build(501, "error:JSON error");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return WxResult.build(502, "error:DB error");
		}		
	}

	
	/**
	 * 保存仪器信息
	 */
	@Override
	public WxResult saveInstrument(TbInstrument tbInstrument) {
		if(tbInstrument==null){
			return WxResult.build(404, "仪器信息保存失败  -- 仪器信息为空");
		}
		//设置仪器id
		tbInstrument.setIid(UuidUtil.get32UUID());
		//保存至数据库
		try {
			 int i = tbInstrumentMapper.insert(tbInstrument);
			 if(i>0){
				 return WxResult.build(200, "仪器保存成功");
			 }
		} catch (Exception e) {
			e.printStackTrace();
			return WxResult.build(404, "仪器保存失败 -- 数据库插入失败");
		}
		return WxResult.build(404, "仪器保存失败 -- 数据库插入失败");
	}


	@Override
	public WxResult queryInstrumentList() {
		List<CustomInstrument> instrumentList = customeMapper.selectInstrumentList();
		if(instrumentList!=null&&instrumentList.size()>0){
			return WxResult.build(200, "仪器列表信息查询成功", instrumentList);
		}
		return WxResult.build(404, "仪器列表查询失败");
	}


	@Override
	public WxResult queryInstrumentUserList(String sncode) {
		if(sncode!=null&&!sncode.equals("")){
			List<TbUser> list = customeMapper.selectInstrumentBindUserListBySncode(sncode);
			if(list!=null&&list.size()>0){
				return WxResult.build(200, "仪器绑定用户查询成功",list);
			}
		}
		return WxResult.build(404, "仪器绑定用户查询失败");
	}


	@Override
	public WxResult deleteInstrumentUserByOpenid(String openid,String sncode) {
		if(openid!=null&&!openid.equals("")){
			try {
				TbInstrumentUserExample example = new TbInstrumentUserExample();
				example.createCriteria().andOpenidEqualTo(openid).andSncodeEqualTo(sncode);
				int i = tbInstrumentUserMapper.deleteByExample(example);
				return WxResult.build(200, "用户解绑成功");
			} catch (Exception e) {
				e.printStackTrace();
				return WxResult.build(404, "用户解绑失败");
			}
		}
		return WxResult.build(404, "用户解绑失败");
	}


	@Override
	public WxResult addInstrumentUser(TbInstrumentUser tbInstrumentUser) {
		if(tbInstrumentUser==null){
			return WxResult.build(404, "用户仪器绑定失败--信息为空");
		}
		//根据sncode查询仪器序列号是否正确
		String sncode = tbInstrumentUser.getSncode();
		TbInstrumentExample example = new TbInstrumentExample();
		example.createCriteria().andSncodeEqualTo(sncode);
		List<TbInstrument> list = tbInstrumentMapper.selectByExample(example);
		if(list!=null&&list.size()>0){//已有该仪器序列号
			//根据openid和sncode查询是否重复绑定
			String openid = tbInstrumentUser.getOpenid();
			TbInstrumentUserExample example1 = new TbInstrumentUserExample();
			example1.createCriteria().andOpenidEqualTo(openid).andSncodeEqualTo(sncode);
			List<TbInstrumentUser> list1 = tbInstrumentUserMapper.selectByExample(example1);
			if(list1!=null&&list1.size()==0){//未重复绑定
				//设置绑定id
				tbInstrumentUser.setIuid(UuidUtil.get32UUID());
				try {
					int i = tbInstrumentUserMapper.insert(tbInstrumentUser);
					return WxResult.build(200, "用户绑定仪器成功");
				} catch (Exception e) {
					e.printStackTrace();
					return WxResult.build(404, "用户仪器绑定失败--数据插入异常");
				}
			}else{
				return WxResult.build(406, "用户仪器绑定失败--用户已绑定该仪器");
			}
			
		}else{
			return WxResult.build(405, "用户仪器绑定失败--输入产品序列号错误");
		}
		
	}


	@Override
	public WxResult queryInstrumentListByOpenid(String openid) {
		if(openid!=null&&!openid.equals("")){
			//根据openid查询用户所绑定的仪器信息
			List<TbInstrument> list = customeMapper.selectInstrumentListByOpenid(openid);
			if(list!=null&&list.size()>0){
				return WxResult.build(200, "用户绑定仪器信息查询成功", list);
			}else{
				return WxResult.build(404, "");
			}
		}
		return WxResult.build(404, "用户绑定仪器信息查询失败 -- openid为空");
	}


	@Override
	public WxResult queryInstrumentResultListBySncode(String sncode) {
		if(sncode!=null&&!sncode.equals("")){
			//根据sncode查询仪器鉴定结果列表
			TbInstrumentInfoExample example = new TbInstrumentInfoExample();
			example.createCriteria().andSncodeEqualTo(sncode);
			List<TbInstrumentInfo> list = tbInstrumentInfoMapper.selectByExample(example);
			if(list!=null&&list.size()>0){
				//处理时间格式
				for (TbInstrumentInfo tbInstrumentInfo : list) {
					String sample_time = tbInstrumentInfo.getSample_time();
					String time = sample_time.substring(0, 4)+"-"+sample_time.substring(4, 6)+"-"+sample_time.subSequence(6, 8)
					+" "+sample_time.substring(8,10)+":"+sample_time.substring(10, 12)+":"+sample_time.substring(12, 14);
					tbInstrumentInfo.setSample_time(time);
				}
				return WxResult.build(200, "用户绑定仪器鉴定结果查询成功", list);
			}else{
				return WxResult.build(404, "用户绑定仪器鉴定结果查询失败 -- 暂未任何鉴定结果");
			}
		}
		return WxResult.build(404, "用户绑定仪器鉴定结果查询失败 -- sncode为空");
	}


	@Override
	public WxResult queryInstrumentResultByIid(String iid) {
		if(iid!=null&&!iid.equals("")){
			TbInstrumentInfoExample example = new TbInstrumentInfoExample();
			example.createCriteria().andIidEqualTo(iid);
			List<TbInstrumentInfo> list = tbInstrumentInfoMapper.selectByExample(example);
			if(list!=null){
				TbInstrumentInfo tbInstrumentInfo = list.get(0);
				//处理时间
				String sample_time = tbInstrumentInfo.getSample_time();
				String time = sample_time.substring(0, 4)+"-"+sample_time.substring(4, 6)+"-"+sample_time.subSequence(6, 8)
				+" "+sample_time.substring(8,10)+":"+sample_time.substring(10, 12)+":"+sample_time.substring(12, 14);
				tbInstrumentInfo.setSample_time(time);
				
				String testTime = tbInstrumentInfo.getTestTime();
				String time1 = testTime.substring(0, 4)+"-"+testTime.substring(4, 6)+"-"+testTime.subSequence(6, 8)
				+" "+testTime.substring(8,10)+":"+testTime.substring(10, 12)+":"+testTime.substring(12, 14);
				tbInstrumentInfo.setTestTime(time1);
				
				return WxResult.build(200, "仪器鉴定内容查询成功", tbInstrumentInfo);
			}else{
				return WxResult.build(404, "仪器鉴定内容查询失败 -- 未查询该记录");
			}
			
		}
		return WxResult.build(404, "仪器鉴定内容查询失败 -- iid为空");
	}


	
	
	/*@Override
	public WxResult getInstrumentInfoList() {
		//TbInstrumentInfoExample_old example = new TbInstrumentInfoExample_old();
		TbInstrumentInfoExample example = new TbInstrumentInfoExample();
		//List<TbInstrumentInfo_old> list = tbInstrumentInfoMapper.selectByExample(example);
		List<TbInstrumentInfo> list = tbInstrumentInfoMapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return WxResult.build(200, "success:查询仪器信息成功", list);
		}
		return WxResult.build(201, "fail:查询仪器信息失败");
	}*/

}
