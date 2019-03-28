package com.xmwjyy.wxx.pojo;

import java.util.Date;

public class TbTypeAuthentication {
    private Integer taid;

    private String taname;

    private Date createtime;

    private Date updatetime;

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
        this.taname = taname == null ? null : taname.trim();
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