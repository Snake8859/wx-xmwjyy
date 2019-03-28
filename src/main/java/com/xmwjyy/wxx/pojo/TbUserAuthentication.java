package com.xmwjyy.wxx.pojo;

import java.util.Date;

public class TbUserAuthentication {
    private String uaid;

    private Integer taid;

    private String content;

    private String expertreply;

    private String replystate;

    private String auditstate;

    private String isread;

    private String openid;

    private String address;

    private Double latitude;

    private Double longitude;

    private Date createtime;

    private Date updatetime;

    public String getUaid() {
        return uaid;
    }

    public void setUaid(String uaid) {
        this.uaid = uaid == null ? null : uaid.trim();
    }

    public Integer getTaid() {
        return taid;
    }

    public void setTaid(Integer taid) {
        this.taid = taid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getExpertreply() {
        return expertreply;
    }

    public void setExpertreply(String expertreply) {
        this.expertreply = expertreply == null ? null : expertreply.trim();
    }

    public String getReplystate() {
        return replystate;
    }

    public void setReplystate(String replystate) {
        this.replystate = replystate == null ? null : replystate.trim();
    }

    public String getAuditstate() {
        return auditstate;
    }

    public void setAuditstate(String auditstate) {
        this.auditstate = auditstate == null ? null : auditstate.trim();
    }

    public String getIsread() {
        return isread;
    }

    public void setIsread(String isread) {
        this.isread = isread == null ? null : isread.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}