package user_management_t5_btetoutt.domain.service.userdetails;

import javax.inject.Inject;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.terasoluna.gfw.common.exception.ResourceNotFoundException;

import user_management_t5_btetoutt.domain.model.Account;
import user_management_t5_btetoutt.domain.service.account.AccountSharedService;

@Service
public class SampleUserDetailsService implements UserDetailsService {
    @Inject
    AccountSharedService accountSharedService;
    
    @Transactional(readOnly=true)
	@Override
	public UserDetails loadUserByUsername(String userid) throws UsernameNotFoundException {
        try {
        	Account account = accountSharedService.findOne(userid); 
            return new SampleUserDetails(account);
        } catch (ResourceNotFoundException e) {
            throw new UsernameNotFoundException("user not found", e);
        }

	}

}
