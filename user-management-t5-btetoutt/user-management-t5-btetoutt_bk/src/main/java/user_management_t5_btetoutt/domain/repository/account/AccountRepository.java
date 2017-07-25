package user_management_t5_btetoutt.domain.repository.account;

import user_management_t5_btetoutt.domain.model.Account;

public interface AccountRepository {
	
	Account findOne(String userid);
	
	void update(Account account);
	/*
	Account findOne(String username);
	*/
}