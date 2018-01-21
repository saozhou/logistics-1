package com.rg.Domain;

public class Rbids {
    private Integer rid;

    private Integer cid;

    private String cname;

    private String ctnumber;

    private Double cprice;

    private String inse;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCtnumber() {
        return ctnumber;
    }

    public void setCtnumber(String ctnumber) {
        this.ctnumber = ctnumber == null ? null : ctnumber.trim();
    }

    public Double getCprice() {
        return cprice;
    }

    public void setCprice(Double cprice) {
        this.cprice = cprice;
    }

    public String getInse() {
        return inse;
    }

    public void setInse(String inse) {
        this.inse = inse == null ? null : inse.trim();
    }
}