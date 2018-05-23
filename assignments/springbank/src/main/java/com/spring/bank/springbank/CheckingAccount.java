package com.spring.bank.springbank;

public class CheckingAccount {
	private float balance;
	private float interestRate;
	private long period;
	
	public CheckingAccount() {
	
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
}
