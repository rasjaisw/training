package com.mvc.daos;

import org.springframework.jdbc.core.JdbcTemplate;

//import com.mvc.models.Customer;
import com.mvc.models.SavingAccount;

public class SavingAccountDaoImpl implements SavingAccountDaoInterface{

	private JdbcTemplate jdbcTemplate;
		
		public SavingAccountDaoImpl() {}
		
		public SavingAccountDaoImpl(JdbcTemplate jdbcTemplate ) {
			
			this.jdbcTemplate=jdbcTemplate;
			
		}
		
		
	public int createAccount(SavingAccount a) {
			String query = "insert into account  values (?, ?, ?)";  
		    return jdbcTemplate.update(query, a.getAccountNumber(), a.getBalance(), a.getInterestRate());
		}


		public int saveOrUpdate(SavingAccount a) {
			return jdbcTemplate.update("update account set balance = ?  where accountNumber = ?", a.getBalance(),a.getAccountNumber() );
		}

		
		public int delete(int accountNumber) {
			
			return jdbcTemplate.update("delete from account where accountNumber = ?", accountNumber);
		}

}
