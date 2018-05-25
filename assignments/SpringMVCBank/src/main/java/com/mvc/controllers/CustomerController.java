package com.mvc.controllers;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.mvc.daos.CustomerDaoImp;
import com.mvc.models.Customer;

public class CustomerController {

	public static void main(String[] args) throws SQLException
	{
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("springconfiguration.xml");
		    
		    CustomerDaoImp custDao = (CustomerDaoImp) context.getBean("custdao");

		    Customer customer = (Customer) context.getBean("cust");
		    
		  
			int menu;
			System.out.println(" 1. insert Customer");
			System.out.println(" 2. update Customer");
			System.out.println(" 3. delete customer");
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
			    customer.setNumber(5656);

				custDao.insertCustomer(customer);
			    
				
			break;
			
			case 2:

				    customer.setFname("rashmi");
				    customer.setLname("jaiswal");
				    customer.setAddress("Indore");
				    customer.setEmail("tffi@gmail.com");
				    customer.setNumber(56565645);

				    custDao.saveOrUpdate(customer);
			break;
			
			case 3:
				try {
				custDao.delete(5656);
				}
				catch(DataAccessException ex) {
					
					ex.printStackTrace();
				}
				break;
			
			
			case 4:
			quit = true;
			break;
			}
			}
			while(!quit);
			}
		    
		    
	}


