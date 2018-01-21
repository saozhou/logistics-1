package com.rg.Domain;

public class Car {
    private String pnumber;

    private String cowner;

    private String tnumber;

    private String uyear;

    private Double load;

    private String etime;

    private String isfree;

    private String company;

    public String getPnumber() {
        return pnumber;
    }

    public void setPnumber(String pnumber) {
        this.pnumber = pnumber == null ? null : pnumber.trim();
    }

    public String getCowner() {
        return cowner;
    }

    public void setCowner(String cowner) {
        this.cowner = cowner == null ? null : cowner.trim();
    }

    public String getTnumber() {
        return tnumber;
    }

    public void setTnumber(String tnumber) {
        this.tnumber = tnumber == null ? null : tnumber.trim();
    }

    public String getUyear() {
        return uyear;
    }

    public void setUyear(String uyear) {
        this.uyear = uyear == null ? null : uyear.trim();
    }

    public Double getLoad() {
        return load;
    }

    public void setLoad(Double load) {
        this.load = load;
    }

    public String getEtime() {
        return etime;
    }

    public void setEtime(String etime) {
        this.etime = etime == null ? null : etime.trim();
    }

    public String getIsfree() {
        return isfree;
    }

    public void setIsfree(String isfree) {
        this.isfree = isfree == null ? null : isfree.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }
}