package com.rg.Domain;

public class FileRecord {
    private Integer id;

    private String uday;

    private String ftype;

    private String fname;

    private String furl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUday() {
        return uday;
    }

    public void setUday(String uday) {
        this.uday = uday == null ? null : uday.trim();
    }

    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype == null ? null : ftype.trim();
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public String getFurl() {
        return furl;
    }

    public void setFurl(String furl) {
        this.furl = furl == null ? null : furl.trim();
    }
}