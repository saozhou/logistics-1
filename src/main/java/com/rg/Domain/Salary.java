package com.rg.Domain;

public class Salary {
    private Integer id;

    private String eid;

    private String ename;

    private String year;

    private String month;

    private Double esalary;

    private Double asalary;

    private Double msalary;

    private String company;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid == null ? null : eid.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public Double getEsalary() {
        return esalary;
    }

    public void setEsalary(Double esalary) {
        this.esalary = esalary;
    }

    public Double getAsalary() {
        return asalary;
    }

    public void setAsalary(Double asalary) {
        this.asalary = asalary;
    }

    public Double getMsalary() {
        return msalary;
    }

    public void setMsalary(Double msalary) {
        this.msalary = msalary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }
}