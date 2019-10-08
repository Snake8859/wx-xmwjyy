package com.xmwjyy.wxx.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.support.json.JSONUtils;
import com.google.gson.Gson;
import com.xmwjyy.wxx.common.utils.JsonUtils;
import com.xmwjyy.wxx.common.utils.UuidUtil;
import com.xmwjyy.wxx.common.utils.WxResult;
import com.xmwjyy.wxx.pojo.CustomData;
import com.xmwjyy.wxx.pojo.TbInstrument;
import com.xmwjyy.wxx.pojo.TbInstrumentUser;
import com.xmwjyy.wxx.service.InstrumentService;

/**
 * 仪器Controller
 * 
 * @author snake8859
 */
@Controller
public class InstrumentController {

	//文本数据保存路径
	@Value("${INSTRUMENT_SAVEPATH}")
	private String INSTRUMENT_SAVEPATH;
	
	
	@Autowired
	private InstrumentService instrumentService;
	
	/**
	 * 添加仪器信息
	 * @param tbInstrument
	 * @return
	 */
	@RequestMapping(value="/instrument/addInstrument",method=RequestMethod.POST)
	@ResponseBody
	public WxResult addInstrument(TbInstrument tbInstrument){
		WxResult wxResult =  instrumentService.saveInstrument(tbInstrument);
		return wxResult;
	}
	
	/**
	 * 获取仪器列表
	 * @return
	 */
	@RequestMapping(value="/instrument/getInstrumentList")
	@ResponseBody
	public WxResult getInstrumentList(){
		WxResult wxResult = instrumentService.queryInstrumentList();
		return wxResult;
	}
	
	/**
	 * 获取仪器绑定微信用户
	 * @param sncode
	 * @return
	 */
	@RequestMapping(value="/instrument/getInstrumentUserList")
	@ResponseBody
	public WxResult getInstrumentUserList(String sncode){
		WxResult wxResult = instrumentService.queryInstrumentUserList(sncode);
		return wxResult;
	}
	
	/**
	 * 根据openid解绑用户
	 * @param openid
	 * @return
	 */
	@RequestMapping(value="/instrument/unbindUser",method=RequestMethod.POST)
	@ResponseBody
	public WxResult unbindUser(String openid,String sncode){
		WxResult wxResult = instrumentService.deleteInstrumentUserByOpenid(openid,sncode);
		return wxResult;
	}
	
	/**
	 * 微信用户绑定仪器
	 * @param tbInstrumentUser
	 * @return
	 */
	@RequestMapping(value="/instrument/bindUser",method=RequestMethod.POST)
	@ResponseBody
	public WxResult bindUser(TbInstrumentUser tbInstrumentUser){
		WxResult wxResult = instrumentService.addInstrumentUser(tbInstrumentUser);
		return wxResult;
	}
	
	/**
	 * 根据openid查询用户绑定的仪器
	 * @param openid
	 * @return
	 */
	@RequestMapping(value="/instrument/getUserInstrumentList")
	@ResponseBody
	public WxResult getUserInstrumentList(String openid){
		WxResult wxResult = instrumentService.queryInstrumentListByOpenid(openid);
		return wxResult;
	}
	
	/**
	 * 根据sncode查询仪器鉴定结果列表
	 * @param sncode
	 * @return
	 */
	@RequestMapping(value="/instrument/getInstrumentResultList")
	@ResponseBody
	public WxResult getInstrumentResultList(String sncode){
		WxResult wxResult = instrumentService.queryInstrumentResultListBySncode(sncode);
		return wxResult;
	}
	
	/**
	 * 根据iid查询仪器鉴定内容
	 * @param iid
	 * @return
	 */
	@RequestMapping(value="/instrument/getInstrumentResult")
	@ResponseBody
	public WxResult getInstrumentResult(String iid){
		WxResult wxResult  = instrumentService.queryInstrumentResultByIid(iid);
		return wxResult;
	}
	
	/**
	 * 接收仪器发送的信息
	 * @param data
	 * @return
	 */
	@RequestMapping(value = "/instrument/getInstrumentInfo", method = RequestMethod.POST)
	@ResponseBody
	public WxResult getInstrumentInfo(@RequestBody CustomData data) {
		if (data != null) { //若接收数据不为空
			String message = data.getMessage();
			String key = data.getKey();

			if (!message.equals("") && !key.equals("")) {
				if (key.equals("wxwjyy_2019")) { // 确认发送时身份
					// 写入文件，测试路径
					//String windowsPath = "G:\\" + "_" + System.currentTimeMillis() + ".txt";
					// 写入文件，真实路径
					String liunxPath = INSTRUMENT_SAVEPATH+File.separator+"_"+System.currentTimeMillis()+".txt";
					File file = new File(liunxPath);
					// 创建缓冲输出流
					OutputStream out = null;
					try {
						out = new FileOutputStream(file);
						out.write(message.getBytes());
						return instrumentService.receiveInstrumentInfo(message);
					} catch (IOException e) {
						e.printStackTrace();
						return WxResult.build(500, "error:IOException");
					} finally {
						try {
							out.close();
						} catch (IOException e) {
							e.printStackTrace();
							return WxResult.build(500, "error:IOException");
						}
					}	
				}
				return WxResult.build(201, "error:key error");
			}
		}
		return WxResult.build(202, "error:data is empty");
	}
	
	//测试获取仪器列表
	/*@RequestMapping("/instrument/testInstrumentInfo")
	@ResponseBody
	public WxResult getInstrumentInfoList(){
		return instrumentService.getInstrumentInfoList();
	}*/

}
