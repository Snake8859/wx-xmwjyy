package com.xmwjyy.wxx.pojo;

import java.util.Date;

public class TbTechnicalClassification {
    private Integer tcid;

    private String tcname;

    private String tcintroduction;

    private String tcpic;

    private Date createtime;

    private Date updatetime;

    public Integer getTcid() {
        return tcid;
    }

    public void setTcid(Integer tcid) {
        this.tcid = tcid;
    }

    public String getTcname() {
        return tcname;
    }

    public void setTcname(String tcname) {
        this.tcname = tcname == null ? null : tcname.trim();
    }

    public String getTcintroduction() {
        return tcintroduction;
    }

    public void setTcintroduction(String tcintroduction) {
        this.tcintroduction = tcintroduction == null ? null : tcintroduction.trim();
    }

    public String getTcpic() {
        return tcpic;
    }

    public void setTcpic(String tcpic) {
        this.tcpic = tcpic == null ? null : tcpic.trim();
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