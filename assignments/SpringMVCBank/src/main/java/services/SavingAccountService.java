package services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mvc.daos.SavingAccountDaoImpl;
import com.mvc.models.SavingAccount;

public class SavingAccountService implements SavingAccountServiceInterface {

	ApplicationContext context = new ClassPathXmlApplicationContext("springconfiguration.xml");
	SavingAccountDaoImpl savingAccountDao=(SavingAccountDaoImpl) context.getBean("accountdao");
	
	public int createAccount(SavingAccount a) {
		// TODO Auto-generated method stub
		return savingAccountDao.createAccount(a);
	}

	public int saveOrUpdate(SavingAccount a) {
		// TODO Auto-generated method stub
		return savingAccountDao.saveOrUpdate(a);
	}

	public int delete(int accountNumber) {
		// TODO Auto-generated method stub
		return savingAccountDao.delete(accountNumber);
	}

	
}
