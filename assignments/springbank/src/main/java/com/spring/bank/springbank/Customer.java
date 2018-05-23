package com.spring.bank.springbank;

import java.util.List;

public class Customer {
	private String firstName;
	private String lastName;
	private Integer customerId;
	private Contact contact;
	
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", customerId=" + customerId
				+ ", contact=" + contact + ", accountList=" + accountList + "]";
	}
	
	public Integer getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
	public List<SavingAccount> getAccountList() {
		return accountList;
	}
	
	public void setAccountList(List<SavingAccount> accountList) {
		this.accountList = accountList;
	}
	private List<SavingAccount> accountList;
	
	public String getFirstName() {
		return firstName;
	}
	
	
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}
	public Customer(final String firstName, final String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Customer(final String firstName, final String lastName, final Integer customerId, final List<SavingAccount> accountList,Contact contact) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerId = customerId;
		this.accountList = accountList;
		this.contact=contact;
	}
	
	public Contact getContact() {
		return contact;
	}
	
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}


	
}
