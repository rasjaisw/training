package com.bank.application;

import java.util.logging.Logger;

public class CurrentAccount extends Account {
	Customer customer;
	double interestRate = 0.08;
	final Logger LOGGER = Logger.getLogger(CurrentAccount.class.getName());

	public CurrentAccount(double balance, Customer customer) {
		super(balance, customer);
		this.customer = customer;
		
	}

	
	public double Deposit(int amount) {
		return balance = balance + amount;
	}

	
	public void Withdraw(int amount) {

		if (amount < 0) {

		}
		balance = balance - amount;

	}

	public void addInterest() {

		balance = interestRate * balance + balance;
		LOGGER.info("Salary After adding interest rate is :" + balance);

	}
}
