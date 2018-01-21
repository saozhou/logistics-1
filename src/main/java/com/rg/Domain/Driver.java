package com.rg.Domain;

public class Driver {
    private String id;

    private String drname;

    private String age;

    private String dryear;

    private String drstate;

    private String etime;

    private String tnumber;

    private String status;

    private String company;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDrname() {
        return drname;
    }

    public void setDrname(String drname) {
        this.drname = drname == null ? null : drname.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getDryear() {
        return dryear;
    }

    public void setDryear(String dryear) {
        this.dryear = dryear == null ? null : dryear.trim();
    }

    public String getDrstate() {
        return drstate;
    }

    public void setDrstate(String drstate) {
        this.drstate = drstate == null ? null : drstate.trim();
    }

    public String getEtime() {
        return etime;
    }

    public void setEtime(String etime) {
        this.etime = etime == null ? null : etime.trim();
    }

    public String getTnumber() {
        return tnumber;
    }

    public void setTnumber(String tnumber) {
        this.tnumber = tnumber == null ? null : tnumber.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }
}