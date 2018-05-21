package com.bank.application;
 abstract class Account {
	
	Customer customer;
	static int id = 0;
	double balance = 0;
     int accountNumber;
public Account()
{}
	
	public Account(double balance,Customer customer) {
		
		this.balance = balance;
		
		accountNumber = ++id;
		this.customer=customer;
	}

	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}

	
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", accountNumber=" + accountNumber + "]";
	}

}
