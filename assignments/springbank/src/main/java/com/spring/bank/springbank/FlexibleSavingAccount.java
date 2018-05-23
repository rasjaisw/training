package com.spring.bank.springbank;

public class FlexibleSavingAccount {
	private float balance;
	private float interestRate;
	private long period;
	
	
    public FlexibleSavingAccount() {
		
	}
	
	public float getBalance() {
		return balance;
	}
	
	public void setBalance(final float balance) {
		this.balance = balance;
	}
	
	public float getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(final float interestRate) {
		this.interestRate = interestRate;
	}
	
	public long getPeriod() {
		return period;
	}
	
	
	public void setPeriod(final long period) {
		this.period = period;
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
	     System.out.println("Salary After adding interest rate is :" + balance);

	}

	
}
