package com.rg.Domain;

public class Profit {
    private Integer id;

    private String scode;

    private Double yamount;

    private Double mamount;

    private String year;

    private String month;

    private String time;

    private String company;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        this.scode = scode == null ? null : scode.trim();
    }

    public Double getYamount() {
        return yamount;
    }

    public void setYamount(Double yamount) {
        this.yamount = yamount;
    }

    public Double getMamount() {
        return mamount;
    }

    public void setMamount(Double mamount) {
        this.mamount = mamount;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }
}