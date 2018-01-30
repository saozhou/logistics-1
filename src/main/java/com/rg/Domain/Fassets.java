package com.rg.Domain;

public class Fassets {
    private String fcode;

    private String fname;

    private Double price;

    private String type;

    private String model;

    private String unit;

    private String cway;

    private String creater;

    private String cplace;

    private String offer;

    private String rday;

    private String uday;

    private String ustatus;

    private String campany;
    
    private String iseffective;

    public String getFcode() {
        return fcode;
    }

    public void setFcode(String fcode) {
        this.fcode = fcode == null ? null : fcode.trim();
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getCway() {
        return cway;
    }

    public void setCway(String cway) {
        this.cway = cway == null ? null : cway.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public String getCplace() {
        return cplace;
    }

    public void setCplace(String cplace) {
        this.cplace = cplace == null ? null : cplace.trim();
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer == null ? null : offer.trim();
    }

    public String getRday() {
        return rday;
    }

    public void setRday(String rday) {
        this.rday = rday == null ? null : rday.trim();
    }

    public String getUday() {
        return uday;
    }

    public void setUday(String uday) {
        this.uday = uday == null ? null : uday.trim();
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus == null ? null : ustatus.trim();
    }

    public String getCampany() {
        return campany;
    }

    public void setCampany(String campany) {
        this.campany = campany == null ? null : campany.trim();
    }

	public String getIseffective() {
		return iseffective;
	}

	public void setIseffective(String iseffective) {
		this.iseffective = iseffective;
	}
}