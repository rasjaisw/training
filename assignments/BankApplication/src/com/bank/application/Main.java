package com.bank.application;

public class Main extends Bank {

	
	public static void main(String args[])
	{
		
		System.out.println("Welcome To" + name);

		Customer cust1=new Customer("rashmi","jaiswal","Indore", 70948934, "rashmijaiswal0721@gmail.com");
		Account Arr[] = new SavingsAccount[100];
		Arr[0] = new SavingsAccount(1000,cust1);


		((SavingsAccount) Arr[0]).Disp();
		((SavingsAccount) Arr[0]).Deposit(7000);
		((SavingsAccount) Arr[0]).Disp();
		((SavingsAccount) Arr[0]).Withdraw(1000);
		((SavingsAccount) Arr[0]).Disp();

		
		
		
	}
}
