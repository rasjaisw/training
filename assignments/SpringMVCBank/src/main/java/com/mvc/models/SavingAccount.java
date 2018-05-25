package com.mvc.models;

public class SavingAccount {
	double balance;
	int accountNumber;
	Customer customer;
	Statement statement;
	final double interestRate = 0.07;
	static int id = 0;
	 public SavingAccount(double balance,  Customer customer,Statement statement) {
		    super();
		    this.balance = balance;
		    this.customer = customer;
		    this.statement=statement;
		  }
		  
	  public SavingAccount(double balance, Customer customer) {
		    super();
		    this.balance = balance;
		    this.accountNumber = ++id;
		    this.customer = customer;
		  }
		  

		  public SavingAccount(double balance, int accountNumber) {

		    this.balance = balance;
		    this.accountNumber = accountNumber;

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

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

		public Statement getStatement() {
			return statement;
		}

		public void setStatement(Statement statement) {
			this.statement = statement;
		}

		public double getInterestRate() {
			return interestRate;
		}
}
