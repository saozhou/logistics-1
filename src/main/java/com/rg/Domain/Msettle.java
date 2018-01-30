package com.rg.Domain;

public class Msettle {
    private Integer id;

    private String cnumber;

    private String aonumber;

    private String vname;

    private Double spay;

    private Double rpay;

    private Double rate;

    private Double lpay;

    private String isover;

    private String company;

    private String isapprove;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnumber() {
        return cnumber;
    }

    public void setCnumber(String cnumber) {
        this.cnumber = cnumber == null ? null : cnumber.trim();
    }

    public String getAonumber() {
        return aonumber;
    }

    public void setAonumber(String aonumber) {
        this.aonumber = aonumber == null ? null : aonumber.trim();
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname == null ? null : vname.trim();
    }

    public Double getSpay() {
        return spay;
    }

    public void setSpay(Double spay) {
        this.spay = spay;
    }

    public Double getRpay() {
        return rpay;
    }

    public void setRpay(Double rpay) {
        this.rpay = rpay;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getLpay() {
        return lpay;
    }

    public void setLpay(Double lpay) {
        this.lpay = lpay;
    }

    public String getIsover() {
        return isover;
    }

    public void setIsover(String isover) {
        this.isover = isover == null ? null : isover.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getIsapprove() {
        return isapprove;
    }

    public void setIsapprove(String isapprove) {
        this.isapprove = isapprove == null ? null : isapprove.trim();
    }
}