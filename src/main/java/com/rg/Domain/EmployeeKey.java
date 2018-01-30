package com.rg.Domain;

public class EmployeeKey {
    private String eid;

    private String evalid;

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid == null ? null : eid.trim();
    }

    public String getEvalid() {
        return evalid;
    }

    public void setEvalid(String evalid) {
        this.evalid = evalid == null ? null : evalid.trim();
    }
}