package com.spring.bank.springbank;

public class Address {
	private String street;
	private String houseNumber;
	private String zipCode;
	private String city;

	
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String houseNumber, String zipCode, String city) {
		super();
		this.street = street;
		this.houseNumber = houseNumber;
		this.zipCode = zipCode;
		this.city = city;
	}
	

	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getHouseNumber() {
		return houseNumber;
	}
	

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}
	

	public String getCity() {
		return city;
	}
	
}
