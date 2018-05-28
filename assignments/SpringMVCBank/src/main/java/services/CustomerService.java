package services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mvc.daos.CustomerDaoImp;
import com.mvc.models.Customer;

public class CustomerService implements CustomerServiceInterface {

	
	 ApplicationContext context = new ClassPathXmlApplicationContext("springconfiguration.xml");
	    

	 CustomerDaoImp custDao = (CustomerDaoImp) context.getBean("custdao");

	public int insertCustomer(Customer cust) {
   
		return	custDao.insertCustomer(cust);	
   }

	public int saveOrUpdate(Customer cust) {
		
		return  custDao.saveOrUpdate(cust);
	}

	public int delete(int number) {
		
		return custDao.delete(number);
	}
	
}
