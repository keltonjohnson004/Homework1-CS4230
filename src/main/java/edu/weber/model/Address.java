package edu.weber.model;

import java.io.Serializable;

public class Address implements Serializable {
	
	private String addressLine1;

	private String city;
	private String state;
	private String zipCode;
	private String country;
	private String addressType;
	
	public Address(String addressLine1, String city, String state, String zipCode,
			String country, String addressType) {
		super();
		this.addressLine1 = addressLine1;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
		this.addressType = addressType;
	}

	public Address() {
		this(null,null,null,null,null,null);
	}
	
	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
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
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	
	

}
