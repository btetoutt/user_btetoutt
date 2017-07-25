package user_management_t5_btetoutt.domain.service.account;

import user_management_t5_btetoutt.domain.model.Account;

public interface AccountSharedService {
	Account findOne(String userid);
	
	Account update(String userid);

}
