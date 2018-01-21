package com.rg.Domain;

public class Vmainten {
    private Integer id;

    private String vman;

    private String time;

    private String type;

    private Double acount;

    private Double number;

    private Double price;

    private String dnumber;

    private String isch;

    private String url;

    private String company;

    private String isapprove;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVman() {
        return vman;
    }

    public void setVman(String vman) {
        this.vman = vman == null ? null : vman.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Double getAcount() {
        return acount;
    }

    public void setAcount(Double acount) {
        this.acount = acount;
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDnumber() {
        return dnumber;
    }

    public void setDnumber(String dnumber) {
        this.dnumber = dnumber == null ? null : dnumber.trim();
    }

    public String getIsch() {
        return isch;
    }

    public void setIsch(String isch) {
        this.isch = isch == null ? null : isch.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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