package com.xmwjyy.wxx.pojo;

import java.util.Date;

public class TbTechnicalCase {
    private Long caseid;

    private String casepic;

    private String casetitle;

    private String recommend;

    private Integer tcid;

    private Date createtime;

    private Date updatetime;

    public Long getCaseid() {
        return caseid;
    }

    public void setCaseid(Long caseid) {
        this.caseid = caseid;
    }

    public String getCasepic() {
        return casepic;
    }

    public void setCasepic(String casepic) {
        this.casepic = casepic == null ? null : casepic.trim();
    }

    public String getCasetitle() {
        return casetitle;
    }

    public void setCasetitle(String casetitle) {
        this.casetitle = casetitle == null ? null : casetitle.trim();
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend == null ? null : recommend.trim();
    }

    public Integer getTcid() {
        return tcid;
    }

    public void setTcid(Integer tcid) {
        this.tcid = tcid;
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