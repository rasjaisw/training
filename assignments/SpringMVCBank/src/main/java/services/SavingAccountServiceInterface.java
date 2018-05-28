package services;

import com.mvc.models.SavingAccount;

public interface SavingAccountServiceInterface {
	public int createAccount(SavingAccount a) ;
	public int saveOrUpdate(SavingAccount a);
	public int delete(int accountNumber);


}
