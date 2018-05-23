package com.spring.bank.springbank;

import com.spring.bank.springbank.Bank;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bank.springbank.Address;
import com.spring.bank.springbank.Customer;
import com.spring.bank.springbank.Contact;
import com.spring.bank.springbank.SavingAccount;


public class Test {
	
	public static void main( String[] args ) {
	ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Bank bank =(Bank)context.getBean("bank");
//	CheckingAccount checkingaccount=(CheckingAccount)context.getBean("checkingaccount");
	Customer customer =(Customer)context.getBean("customer");
	SavingAccount savingaccount=(SavingAccount)context.getBean("savingaccount");
	System.out.println(customer.toString());
	
	int menu;
	System.out.println(" 1. Print balance");
	System.out.println(" 2. Deposit");
	System.out.println(" 3. Withdraw");
	System.out.println("");
	boolean quit = false;

	do {
	System.out.print("Please enter your choice: ");
	Scanner sc=new Scanner(System.in);
	menu = sc.nextInt();
	
	switch(menu)
	{
	case 1:
	float balance =savingaccount.getBalance();
	System.out.println(" yr balance is " + balance);
	break;
	case 2:
    int money;
	System.out.println("enter amount");
	Scanner cs=new Scanner(System.in);
	money=cs.nextInt();
	savingaccount.Deposit(money);
	break;
	case 3:
    int cash;
    System.out.println("enter amount to withdraw");
    Scanner cs1=new Scanner(System.in);
    cash=cs1.nextInt();
	savingaccount.Withdraw(cash);
	break;
	case 4:
	quit = true;
	break;
	}
	}
	while(!quit);
	}
	
}
