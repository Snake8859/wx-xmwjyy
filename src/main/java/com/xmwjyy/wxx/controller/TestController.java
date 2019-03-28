package com.xmwjyy.wxx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xmwjyy.wxx.common.utils.WxResult;
import com.xmwjyy.wxx.mapper.TbTechnicalCaseMapper;
import com.xmwjyy.wxx.pojo.TbTechnicalCase;
import com.xmwjyy.wxx.pojo.TbTechnicalCaseExample;

/**
 *  测试Controller
 * @author Snake8859
 *
 */
@Controller
public class TestController {

	/**************************测试*********************************/
	@Autowired
	private TbTechnicalCaseMapper tbTechnicalCaseMapper;
	
	/**
	 * 测试根据技术分类id查询技术案例
	 * @param tcid
	 * @return
	 */
	@RequestMapping("/tcase/{tcid}")
	@ResponseBody
	public WxResult showTechnicalCase(@PathVariable Integer tcid){
		TbTechnicalCaseExample example = new TbTechnicalCaseExample();
		example.createCriteria().andTcidEqualTo(tcid);
		List<TbTechnicalCase> list = tbTechnicalCaseMapper.selectByExample(example);
		return WxResult.ok(list);
	}
	
	
	
}
