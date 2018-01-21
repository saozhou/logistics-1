package com.rg.Domain;

public class Border {
    private String bnumber;

    private String bname;

    private String baddress;

    private String spec;

    private String gbrand;

    private String packing;

    private String gtype;

    private Double gnumber;

    private Double rnumber;

    private String etime;

    private String isover;

    private String rtnumber;

    private String unit;

    private Double rprice;

    private Double price;

    private String company;

    private String isapprove;

    public String getBnumber() {
        return bnumber;
    }

    public void setBnumber(String bnumber) {
        this.bnumber = bnumber == null ? null : bnumber.trim();
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
    }

    public String getBaddress() {
        return baddress;
    }

    public void setBaddress(String baddress) {
        this.baddress = baddress == null ? null : baddress.trim();
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

    public String getGtype() {
        return gtype;
    }

    public void setGtype(String gtype) {
        this.gtype = gtype == null ? null : gtype.trim();
    }

    public Double getGnumber() {
        return gnumber;
    }

    public void setGnumber(Double gnumber) {
        this.gnumber = gnumber;
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

    public String getRtnumber() {
        return rtnumber;
    }

    public void setRtnumber(String rtnumber) {
        this.rtnumber = rtnumber == null ? null : rtnumber.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Double getRprice() {
        return rprice;
    }

    public void setRprice(Double rprice) {
        this.rprice = rprice;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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