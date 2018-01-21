package com.rg.Domain;

public class PriceRecord {
    private Integer pid;

    private String aid;

    private String atype;

    private String spec;

    private String abrand;

    private Double bprice;

    private Double lprice;

    private Double mcount;

    private String time;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid == null ? null : aid.trim();
    }

    public String getAtype() {
        return atype;
    }

    public void setAtype(String atype) {
        this.atype = atype == null ? null : atype.trim();
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    public String getAbrand() {
        return abrand;
    }

    public void setAbrand(String abrand) {
        this.abrand = abrand == null ? null : abrand.trim();
    }

    public Double getBprice() {
        return bprice;
    }

    public void setBprice(Double bprice) {
        this.bprice = bprice;
    }

    public Double getLprice() {
        return lprice;
    }

    public void setLprice(Double lprice) {
        this.lprice = lprice;
    }

    public Double getMcount() {
        return mcount;
    }

    public void setMcount(Double mcount) {
        this.mcount = mcount;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }
}