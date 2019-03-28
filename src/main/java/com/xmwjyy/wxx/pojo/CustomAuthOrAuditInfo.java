package com.xmwjyy.wxx.pojo;

import java.util.List;

public class CustomAuthOrAuditInfo {

	private String uaid;
	
	private Integer taid;
	
	private String taname;
	
	private String content;
	
	private String expertreply;
	
	private String auditstate;
	
	private String createtime;
	
	private String updatetime;
	
	private List<TbAuthenticationPicture> picList;

	public String getUaid() {
		return uaid;
	}

	public void setUaid(String uaid) {
		this.uaid = uaid;
	}

	public Integer getTaid() {
		return taid;
	}

	public void setTaid(Integer taid) {
		this.taid = taid;
	}

	public String getTaname() {
		return taname;
	}

	public void setTaname(String taname) {
		this.taname = taname;
	}
	
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getExpertreply() {
		return expertreply;
	}

	public void setExpertreply(String expertreply) {
		this.expertreply = expertreply;
	}

	public String getAuditstate() {
		return auditstate;
	}

	public void setAuditstate(String auditstate) {
		this.auditstate = auditstate;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public List<TbAuthenticationPicture> getPicList() {
		return picList;
	}

	public void setPicList(List<TbAuthenticationPicture> picList) {
		this.picList = picList;
	}

	public String getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}
	
	
	
	
}
