package com.mvc.daos;

import com.mvc.models.Customer;

public interface CustomerDaoInterface {

	
public int	insertCustomer(Customer cust);
public int saveOrUpdate(Customer cust);
public int delete(int number);
	
}
