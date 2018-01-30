package com.rg.Domain;

public class Fsettle {
    private Integer id;

    private String bnumber;

    private String dnumber;

    private String tman;

    private Double spay;

    private Double rpay;

    private Double doprice;

    private Double uoprice;

    private String icod;

    private String company;

    private String isapprove;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBnumber() {
        return bnumber;
    }

    public void setBnumber(String bnumber) {
        this.bnumber = bnumber == null ? null : bnumber.trim();
    }

    public String getDnumber() {
        return dnumber;
    }

    public void setDnumber(String dnumber) {
        this.dnumber = dnumber == null ? null : dnumber.trim();
    }

    public String getTman() {
        return tman;
    }

    public void setTman(String tman) {
        this.tman = tman == null ? null : tman.trim();
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

    public Double getDoprice() {
        return doprice;
    }

    public void setDoprice(Double doprice) {
        this.doprice = doprice;
    }

    public Double getUoprice() {
        return uoprice;
    }

    public void setUoprice(Double uoprice) {
        this.uoprice = uoprice;
    }

    public String getIcod() {
        return icod;
    }

    public void setIcod(String icod) {
        this.icod = icod == null ? null : icod.trim();
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