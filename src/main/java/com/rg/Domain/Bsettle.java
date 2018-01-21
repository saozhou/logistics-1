package com.rg.Domain;

public class Bsettle {
    private Integer id;

    private String bnumber;

    private String aonumber;

    private String cname;

    private Double rece;

    private Double orece;

    private Double scount;

    private String isover;

    private String company;

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

    public String getAonumber() {
        return aonumber;
    }

    public void setAonumber(String aonumber) {
        this.aonumber = aonumber == null ? null : aonumber.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public Double getRece() {
        return rece;
    }

    public void setRece(Double rece) {
        this.rece = rece;
    }

    public Double getOrece() {
        return orece;
    }

    public void setOrece(Double orece) {
        this.orece = orece;
    }

    public Double getScount() {
        return scount;
    }

    public void setScount(Double scount) {
        this.scount = scount;
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
}