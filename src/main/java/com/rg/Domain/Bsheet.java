package com.rg.Domain;

public class Bsheet {
    private Integer id;

    private String fcode;

    private String type;

    private Double cbalance;

    private Double ybalance;

    private String expect;

    private String year;

    private String company;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFcode() {
        return fcode;
    }

    public void setFcode(String fcode) {
        this.fcode = fcode == null ? null : fcode.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Double getCbalance() {
        return cbalance;
    }

    public void setCbalance(Double cbalance) {
        this.cbalance = cbalance;
    }

    public Double getYbalance() {
        return ybalance;
    }

    public void setYbalance(Double ybalance) {
        this.ybalance = ybalance;
    }

    public String getExpect() {
        return expect;
    }

    public void setExpect(String expect) {
        this.expect = expect == null ? null : expect.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }
}