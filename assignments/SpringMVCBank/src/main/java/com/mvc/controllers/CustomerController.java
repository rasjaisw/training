package com.mvc.controllers;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.mvc.daos.CustomerDaoImp;
import com.mvc.daos.SavingAccountDaoImpl;
import com.mvc.models.Customer;
import com.mvc.models.SavingAccount;

import services.CustomerService;
import services.SavingAccountService;



public class CustomerController {

	public static void main(String[] args) throws SQLException
	{
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("springconfiguration.xml");
		    
		  //  CustomerDaoImp custDao = (CustomerDaoImp) context.getBean("custdao");
		   Customer customer = (Customer) context.getBean("cust");
		   CustomerService custService=(CustomerService) context.getBean("custService");
		    
		    SavingAccount account=(SavingAccount) context.getBean("account");
		    SavingAccountService accountService=(SavingAccountService) context.getBean("savingAccountService");

		   // SavingAccountDaoImpl accountDao = (SavingAccountDaoImpl) context.getBean("accountdao");
		  
			int menu;
			System.out.println(" 1. insert Customer");
			System.out.println(" 2. update Customer");
			System.out.println(" 3. delete customer");
			System.out.println(" 4. create  account");
			System.out.println(" 5. update  account");
			System.out.println(" 6. delete  account");
			
			
			System.out.println("");
			boolean quit = false;

			do {
			System.out.print("Please enter your choice: ");
			Scanner sc=new Scanner(System.in);
			menu = sc.nextInt();
			
			switch(menu)
			{
			case 1:
				
				customer.setFname("tiffi");
			    customer.setLname("cyaan");
			    customer.setAddress("assb,hynh");
			    customer.setEmail("tffi@gmail.com");
			    customer.setNumber(5756);

				custService.insertCustomer(customer);
			    
				
			break;
			
			case 2:

				    customer.setFname("rashmi");
				    customer.setLname("jaiswal");
				    customer.setAddress("Indore");
				    customer.setEmail("tffi@gmail.com");
				    customer.setNumber(56565645);

				    custService.saveOrUpdate(customer);
			break;
			
			case 3:
				try {
				custService.delete(5656);
				}
				catch(DataAccessException ex) {
					
					ex.printStackTrace();
				}
				break;
			
				
			case 4: 
				account.setAccountNumber(1); 
				account.setBalance(500);
			    //account.setInterestRate(0.4);
				accountService.createAccount(account);
				//account.setBalance(600);
				break;
				
			case 5:
				
				
				account.setAccountNumber(1);
				account.setBalance(600);
				accountService.saveOrUpdate(account);
				break;
				
			case 6:
				
				try {
					accountService.delete(1);
					}
					catch(DataAccessException ex) {
						
						ex.printStackTrace();
					}
				
				
				break;
				
			     
			case 7:
			quit = true;
			break;
			}
			}
			while(!quit);
			}
		    
		    
	}


