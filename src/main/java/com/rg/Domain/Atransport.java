package com.rg.Domain;

public class Atransport {
    private String aonumber;

    private String cnumber;

    private String bnumber;

    private String company;

    public String getAonumber() {
        return aonumber;
    }

    public void setAonumber(String aonumber) {
        this.aonumber = aonumber == null ? null : aonumber.trim();
    }

    public String getCnumber() {
        return cnumber;
    }

    public void setCnumber(String cnumber) {
        this.cnumber = cnumber == null ? null : cnumber.trim();
    }

    public String getBnumber() {
        return bnumber;
    }

    public void setBnumber(String bnumber) {
        this.bnumber = bnumber == null ? null : bnumber.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }
}