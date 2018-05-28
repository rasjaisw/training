package com.mvc.models;

public class SavingAccount {
	int accountNumber;
	double balance;
	//Customer customer;
	//Statement statement;
	double interestRate = 0.07;
	//static int id = 0;
	 
		  
	  public SavingAccount(double balance,int accountNumber) {
		    super();
		    this.balance = balance;
		    this.accountNumber = accountNumber;
		  //  this.customer = customer;
		  }
		  



		  public SavingAccount() {

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

		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}
		
		public void setInterestRate(double interestRate) {
			this.interestRate = interestRate;
		}

		public double getInterestRate() {
			return interestRate;
		}
}
