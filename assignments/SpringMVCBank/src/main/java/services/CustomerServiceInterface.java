package services;

import com.mvc.models.Customer;

public interface CustomerServiceInterface {

	public int	insertCustomer(Customer cust);
	public int saveOrUpdate(Customer cust);
	public int delete(int number);
		
}
