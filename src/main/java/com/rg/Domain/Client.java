package com.rg.Domain;

/**
 * 客户实体类
 * @author Zhou
 *
 */
public class Client {
    private String id;

    private Integer category;

    private String name;

    private Double credit;

    private Double lcredit;

    private String tnumber;

    private String place;

    private String address;

    private Integer type;

    private String iseffective;

    private String company;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		   this.id = id == null ? null : id.trim();
	}

	public Integer getCategory() {
		return category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		 this.name = name == null ? null : name.trim();
	}

	public Double getCredit() {
		return credit;
	}

	public void setCredit(Double credit) {
		this.credit = credit;
	}

	public Double getLcredit() {
		return lcredit;
	}

	public void setLcredit(Double lcredit) {
		this.lcredit = lcredit;
	}

	public String getTnumber() {
		return tnumber;
	}

	public void setTnumber(String tnumber) {
		 this.tnumber = tnumber == null ? null : tnumber.trim();
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		 this.place = place == null ? null : place.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		 this.address = address == null ? null : address.trim();
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getIseffective() {
		return iseffective;
	}

	public void setIseffective(String iseffective) {
		 this.iseffective = iseffective == null ? null : iseffective.trim();
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		 this.company = company == null ? null : company.trim();
	}

   
}