package com.rg.Domain;

public class Sroom {
    private String wnumber;

    private String wplace;

    private String ename;

    private String tnumber;

    private String waddress;

    public String getWnumber() {
        return wnumber;
    }

    public void setWnumber(String wnumber) {
        this.wnumber = wnumber == null ? null : wnumber.trim();
    }

    public String getWplace() {
        return wplace;
    }

    public void setWplace(String wplace) {
        this.wplace = wplace == null ? null : wplace.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getTnumber() {
        return tnumber;
    }

    public void setTnumber(String tnumber) {
        this.tnumber = tnumber == null ? null : tnumber.trim();
    }

    public String getWaddress() {
        return waddress;
    }

    public void setWaddress(String waddress) {
        this.waddress = waddress == null ? null : waddress.trim();
    }
}