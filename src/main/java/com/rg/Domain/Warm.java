package com.rg.Domain;

public class Warm {
    private Integer id;

    private String warm;

    private Double hprice;

    private String mtype;

    private String thtype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWarm() {
        return warm;
    }

    public void setWarm(String warm) {
        this.warm = warm == null ? null : warm.trim();
    }

    public Double getHprice() {
        return hprice;
    }

    public void setHprice(Double hprice) {
        this.hprice = hprice;
    }

    public String getMtype() {
        return mtype;
    }

    public void setMtype(String mtype) {
        this.mtype = mtype == null ? null : mtype.trim();
    }

    public String getThtype() {
        return thtype;
    }

    public void setThtype(String thtype) {
        this.thtype = thtype == null ? null : thtype.trim();
    }
}