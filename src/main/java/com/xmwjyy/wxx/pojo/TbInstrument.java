package com.xmwjyy.wxx.pojo;

public class TbInstrument {
    private String iid;

    private String iname;

    private String sncode;

    private String organization;

    public String getIid() {
        return iid;
    }

    public void setIid(String iid) {
        this.iid = iid == null ? null : iid.trim();
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname == null ? null : iname.trim();
    }

    public String getSncode() {
        return sncode;
    }

    public void setSncode(String sncode) {
        this.sncode = sncode == null ? null : sncode.trim();
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

	@Override
	public String toString() {
		return "TbInstrument [iid=" + iid + ", iname=" + iname + ", sncode=" + sncode + ", organization=" + organization
				+ "]";
	}
    
    
    
}