package user_management_t5_btetoutt.domain.service.account;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.terasoluna.gfw.common.exception.ResourceNotFoundException;

import user_management_t5_btetoutt.domain.model.Account;
import user_management_t5_btetoutt.domain.repository.account.AccountRepository;

@Service
public class AccountSharedServiceImpl implements AccountSharedService {
    @Inject
    AccountRepository accountRepository;

    @Transactional(readOnly=true)
	@Override
	public Account findOne(String username) {

        Account account = accountRepository.findOne(username);

        if (account == null) {
            throw new ResourceNotFoundException("The given account is not found! username="
                    + username);
        }
        return account;
	}

}
