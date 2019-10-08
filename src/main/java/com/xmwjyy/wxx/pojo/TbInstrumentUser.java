package com.xmwjyy.wxx.pojo;

public class TbInstrumentUser {
    private String iuid;

    private String sncode;

    private String openid;

    public String getIuid() {
        return iuid;
    }

    public void setIuid(String iuid) {
        this.iuid = iuid == null ? null : iuid.trim();
    }

    public String getSncode() {
        return sncode;
    }

    public void setSncode(String sncode) {
        this.sncode = sncode == null ? null : sncode.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }
}