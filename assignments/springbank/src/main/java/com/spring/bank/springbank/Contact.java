package com.spring.bank.springbank;

public class Contact {
	private long mobile;
	private long phone;
	private String email;
	private Address address;
	
	
	/*public Contact(long mobile, long phone, String email, Address address) {
		super();
		this.mobile = mobile;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}
*/	
	public long getMobile() {
		return mobile;
	}
	
	public void setMobile(final long mobile) {
		this.mobile = mobile;
	}
	
	public long getPhone() {
		return phone;
	}
	
	public void setPhone(final long phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(final String email) {
		this.email = email;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(final Address address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Contact [mobile=" + mobile + ", phone=" + phone + ", email=" + email + ", address=" + address + "]";
	}
	}
