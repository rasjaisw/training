package com.mvc.daos;

import com.mvc.models.SavingAccount;

public interface SavingAccountDaoInterface {
	
	public int createAccount(SavingAccount a) ;
	public int saveOrUpdate(SavingAccount a);
	public int delete(int accountNumber);

}
