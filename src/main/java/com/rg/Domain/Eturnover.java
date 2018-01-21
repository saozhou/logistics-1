package com.rg.Domain;

public class Eturnover {
    private Integer id;

    private String eid;

    private String ename;

    private String unway;

    private String cday;

    private String company;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid == null ? null : eid.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getUnway() {
        return unway;
    }

    public void setUnway(String unway) {
        this.unway = unway == null ? null : unway.trim();
    }

    public String getCday() {
        return cday;
    }

    public void setCday(String cday) {
        this.cday = cday == null ? null : cday.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }
}