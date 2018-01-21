package com.rg.Domain;

public class Bamount {
    private Integer id;

    private String ecode;

    private String ename;

    private String currency;

    private Double fjbalance;

    private Double fdbalance;

    private Double tjbalance;

    private Double ajbalance;

    private Double adbalance;

    private Double ljbalance;

    private Double ldbalance;

    private String expect;

    private String year;

    private Double tdbalance;

    private String company;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEcode() {
        return ecode;
    }

    public void setEcode(String ecode) {
        this.ecode = ecode == null ? null : ecode.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public Double getFjbalance() {
        return fjbalance;
    }

    public void setFjbalance(Double fjbalance) {
        this.fjbalance = fjbalance;
    }

    public Double getFdbalance() {
        return fdbalance;
    }

    public void setFdbalance(Double fdbalance) {
        this.fdbalance = fdbalance;
    }

    public Double getTjbalance() {
        return tjbalance;
    }

    public void setTjbalance(Double tjbalance) {
        this.tjbalance = tjbalance;
    }

    public Double getAjbalance() {
        return ajbalance;
    }

    public void setAjbalance(Double ajbalance) {
        this.ajbalance = ajbalance;
    }

    public Double getAdbalance() {
        return adbalance;
    }

    public void setAdbalance(Double adbalance) {
        this.adbalance = adbalance;
    }

    public Double getLjbalance() {
        return ljbalance;
    }

    public void setLjbalance(Double ljbalance) {
        this.ljbalance = ljbalance;
    }

    public Double getLdbalance() {
        return ldbalance;
    }

    public void setLdbalance(Double ldbalance) {
        this.ldbalance = ldbalance;
    }

    public String getExpect() {
        return expect;
    }

    public void setExpect(String expect) {
        this.expect = expect == null ? null : expect.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public Double getTdbalance() {
        return tdbalance;
    }

    public void setTdbalance(Double tdbalance) {
        this.tdbalance = tdbalance;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }
}