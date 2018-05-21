package com.bank.application;


class Customer {

	private String fname = null;
	private String lname = null;
	private String address = null;
	private long number;
	private String email;

	public Customer(String fname, String lname, String address, long number, String email) {
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.number = number;
		this.email = email;
	}

	
	public String getFname() {
		return fname;
	}

	
	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}

	
	public void setLname(String lname) {
		this.lname = lname;
	}

	
	public String getAddress() {
		return address;
	}

	
	public void setAddress(String address) {
		this.address = address;
	}


	public long getNumber() {
		return number;
	}

	
	public void setNumber(long number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	
	 
	public void setEmail(String email) {
		this.email = email;
	}

}