package com.xmwjyy.wxx.controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import com.xmwjyy.wxx.common.utils.UuidUtil;
import com.xmwjyy.wxx.common.utils.WxResult;

/**
 * 公共功能管理Controller
 * 
 * @author Snake8859
 *
 */
@Controller
public class CommonController {

	@Value("${HHTP_PIRCTURE}")
	private String HHTP_PIRCTURE;
	
	@Value("${REALPATH}")
	private String REALPATH;
	
	
	/**
	 * 图片上传
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/common/uploadPic")
	@ResponseBody
	public WxResult uploadPic(HttpServletRequest request, HttpServletResponse response) {
		// 图片上传
		MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;
		MultipartFile multipartFile = req.getFile("casepic");

		// 获得原始图片名称
		String originalFilename = multipartFile.getOriginalFilename();
		// 获得后缀名
		String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
		// uuid生成图片新的名称
		String picName = UuidUtil.get32UUID() + suffix;
		//保存路径 windows
        //String realPath = "E:/WeChat笔记/校外小程序项目/images";
        //保存路径 liunx
        try {
			multipartFile.transferTo(new File(REALPATH,picName));
			return WxResult.build(200, "图片保存成功",HHTP_PIRCTURE+picName);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
			return WxResult.build(404, "图片保存失败");
		}
	}

}
