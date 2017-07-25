package user_management_t5_btetoutt.domain.service.userdetails;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import user_management_t5_btetoutt.domain.model.Account;

public class SampleUserDetails extends User {
    private static final long serialVersionUID = 1L;

    private final Account account_security;

    public SampleUserDetails(Account account_security) {
    	
        super(account_security.getUserid(), account_security.getPassword(), 
        		AuthorityUtils.createAuthorityList("ROLE_USER"));
    	
        /*
        super(account.getUsername(), account.getPassword(), AuthorityUtils
                .createAuthorityList("ROLE_USER"));
        */
        this.account_security = account_security;
    }

    public Account getAccount() { // (5)
        return account_security;
    }
}
