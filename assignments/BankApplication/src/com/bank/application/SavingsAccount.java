package com.bank.application;

public class SavingsAccount extends Account{
	Customer customer;
	
	public SavingsAccount(double balance,Customer customer) {
		super(balance,customer);
		this.customer=customer;
		
	}

	public void Deposit(int amount) {
		balance = balance + amount;
	}

	public void Withdraw(int amount) {
		if (balance - amount > 0) {
			balance = balance - amount;
		} else {
			System.out.println("Not enough balance to withdraw " + amount);
		}
	}

	public void Disp() {
		System.out.println(" \n Account no:" + accountNumber + "\n Balance:" + balance+" \n Name:"+customer.getFname()+" \n Surname:"+customer.getLname());
	}
}
