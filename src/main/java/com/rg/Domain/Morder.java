package com.rg.Domain;

public class Morder {
    private String cnumber;

    private String cname;

    private String caddress;

    private String tnumber;

    private String spec;

    private String gbrand;

    private String packing;

    private String stype;

    private Double sprice;

    private Double qgoods;

    private Double roprice;

    private Double rnumber;

    private String etime;

    private String isover;

    private String unit;

    private Double rate;

    private String company;

    private String isapprove;

    public String getCnumber() {
        return cnumber;
    }

    public void setCnumber(String cnumber) {
        this.cnumber = cnumber == null ? null : cnumber.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress == null ? null : caddress.trim();
    }

    public String getTnumber() {
        return tnumber;
    }

    public void setTnumber(String tnumber) {
        this.tnumber = tnumber == null ? null : tnumber.trim();
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    public String getGbrand() {
        return gbrand;
    }

    public void setGbrand(String gbrand) {
        this.gbrand = gbrand == null ? null : gbrand.trim();
    }

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing == null ? null : packing.trim();
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype == null ? null : stype.trim();
    }

    public Double getSprice() {
        return sprice;
    }

    public void setSprice(Double sprice) {
        this.sprice = sprice;
    }

    public Double getQgoods() {
        return qgoods;
    }

    public void setQgoods(Double qgoods) {
        this.qgoods = qgoods;
    }

    public Double getRoprice() {
        return roprice;
    }

    public void setRoprice(Double roprice) {
        this.roprice = roprice;
    }

    public Double getRnumber() {
        return rnumber;
    }

    public void setRnumber(Double rnumber) {
        this.rnumber = rnumber;
    }

    public String getEtime() {
        return etime;
    }

    public void setEtime(String etime) {
        this.etime = etime == null ? null : etime.trim();
    }

    public String getIsover() {
        return isover;
    }

    public void setIsover(String isover) {
        this.isover = isover == null ? null : isover.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
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