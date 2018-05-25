package com.mvc.daos;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mvc.models.Customer;

public class CustomerDaoImp implements CustomerDaoInterface 
{

	private JdbcTemplate jdbcTemplate;
	
	public CustomerDaoImp() {}
	
	public CustomerDaoImp(JdbcTemplate jdbcTemplate ) {
		
		this.jdbcTemplate=jdbcTemplate;
		
	}
	
	public int insertCustomer(Customer c) {
		String query = "insert into customer values ('"+c.getFname()+"','"+c.getLname()+"','"+c.getAddress()+"','"+c.getEmail()+"','"+c.getNumber()+"')";  
	    return jdbcTemplate.update(query);
	}

	public int saveOrUpdate(Customer cust) {
		return jdbcTemplate.update("update customer set fname = ?, lname = ?, address = ?, email = ? where number = ?", cust.getFname(), cust.getLname(), cust.getAddress(), cust.getEmail(), cust.getNumber() );
	}

	public int delete(int number) {
		
		return jdbcTemplate.update("delete from customer where number = ?", number);
	}
	
	
}
