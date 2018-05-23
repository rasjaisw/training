package com.spring.bank.springbank;

public class Bank {
	private String name;
	private Customer customer;

	
	public Bank() {
	
	}

	public Bank(final String name) {
		super();
		this.name = name;
	}

	
	public Bank(String name, Customer customer) {
		super();
		this.name = name;
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", customer=" + customer + "]";
	}

	
	
	public void setName(String name) {
		this.name = name;
	}

	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public String getName() {
		return name;
	}

	
}
