package com.rg.Domain;

public class Sales {
    private Integer id;

    private String eid;

    private String ename;

    private Double schedule;

    private Double finish;

    private String month;

    private String year;

    private Double dis;

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

    public Double getSchedule() {
        return schedule;
    }

    public void setSchedule(Double schedule) {
        this.schedule = schedule;
    }

    public Double getFinish() {
        return finish;
    }

    public void setFinish(Double finish) {
        this.finish = finish;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public Double getDis() {
        return dis;
    }

    public void setDis(Double dis) {
        this.dis = dis;
    }
}