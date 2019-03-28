package com.xmwjyy.wxx.pojo;

import java.util.Date;

public class TbAuthenticationPicture {
    private String apid;

    private String picname;

    private String uaid;

    private Date createtime;

    private Date updatetime;

    public String getApid() {
        return apid;
    }

    public void setApid(String apid) {
        this.apid = apid == null ? null : apid.trim();
    }

    public String getPicname() {
        return picname;
    }

    public void setPicname(String picname) {
        this.picname = picname == null ? null : picname.trim();
    }

    public String getUaid() {
        return uaid;
    }

    public void setUaid(String uaid) {
        this.uaid = uaid == null ? null : uaid.trim();
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