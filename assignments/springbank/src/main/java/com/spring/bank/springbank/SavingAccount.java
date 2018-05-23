package com.spring.bank.springbank;

import java.util.List;

public class SavingAccount {
	private float balance;
	private int accountNumber;
	private List<Statement> statementList;
	
	
	public SavingAccount(float balance, int accountNumber, List<Statement> statementList) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.statementList = statementList;
	}
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}
	public SavingAccount(final float balance) {
		super();
		this.balance = balance;
	}
	public SavingAccount(final float balance, final int accountNumber) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	List<Statement> getStatementList() {
		return statementList;
	}

	
	public void setStatementList(List<Statement> statementList) {
		this.statementList = statementList;
	}

	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public float getBalance() {
		return balance;
	}

	public void setBalance(final float balance) {
		this.balance = balance;
	}
	
	 
	
	
	
	
	//public List<SavingAccount> addAccount(SavingAccount account) {
		// TODO Auto-generated method stub
		//return null;
	//}
	//public SavingAccount deposit(float amount, Customer cust) {
		// TODO Auto-generated method stub
	//	return null;
	//}
//	public SavingAccount withdraw(float amount, Customer cust) {
	//	// TODO Auto-generated method stub
	//	return null;
//	}
	
	//public void deleteAccount(Customer cust, Integer custId) {
		// TODO Auto-generated method stub
		
//	}
	
	//public List<Statement> addStatement(Statement statement) {
		// TODO Auto-generated method stub
		//return null;
	//}
	
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

	

	
	@Override
	public String toString() {
		return "SavingAccount [balance=" + balance + ", accountNumber=" + accountNumber + "]";
	}
}
