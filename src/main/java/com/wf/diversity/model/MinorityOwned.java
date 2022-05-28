package com.wf.diversity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_Hackathon_Data_Minoritywomenowned")
public class MinorityOwned {

	@Id
	@Column(name = "dunsnum")
	private Long dunsNum;
	
	@Column(name = "dunsname")
	private String dunsName;

	@Column(name = "county")
	private String country;

	@Column(name = "streetaddress")
	private String streetAddress;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "zip")
	private String zip;

	@Column(name = "phone")
	private String phone;

	@Column(name = "executivecontact1")
	private String executiveContact1;

	@Column(name = "executivecontact2")
	private String executiveContact2;

	@Column(name = "iswomanowned")
	private String isWomanOwned;

	@Column(name = "minorityowneddesc")
	private String minorityOwnedDesc;

	public Long getDunsNum() {
		return dunsNum;
	}

	public void setDunsNum(Long dunsNum) {
		this.dunsNum = dunsNum;
	}

	public String getDunsName() {
		return dunsName;
	}

	public void setDunsName(String dunsName) {
		this.dunsName = dunsName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getExecutiveContact1() {
		return executiveContact1;
	}

	public void setExecutiveContact1(String executiveContact1) {
		this.executiveContact1 = executiveContact1;
	}

	public String getExecutiveContact2() {
		return executiveContact2;
	}

	public void setExecutiveContact2(String executiveContact2) {
		this.executiveContact2 = executiveContact2;
	}

	public String getIsWomanOwned() {
		return isWomanOwned;
	}

	public void setIsWomanOwned(String isWomanOwned) {
		this.isWomanOwned = isWomanOwned;
	}

	public String getMinorityOwnedDesc() {
		return minorityOwnedDesc;
	}

	public void setMinorityOwnedDesc(String minorityOwnedDesc) {
		this.minorityOwnedDesc = minorityOwnedDesc;
	}
	
	
}
