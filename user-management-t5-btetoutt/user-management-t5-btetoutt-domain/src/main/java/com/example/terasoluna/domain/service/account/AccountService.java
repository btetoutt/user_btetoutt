package com.example.terasoluna.domain.service.account;

import javax.inject.Inject;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.terasoluna.gfw.common.exception.ResourceNotFoundException;

import com.example.terasoluna.domain.model.Account;
import com.example.terasoluna.domain.model.password.PasschangeForm;
import com.example.terasoluna.domain.repository.account.AccountRepository;

@Service
public class AccountService {

	@Inject
	AccountRepository accountRespository;

	@Inject
	PasswordEncoder passwordEncoder;

	public Account findOne(String userid) {
		Account account = accountRespository.findOne(userid);

		if (account == null) {
			throw new ResourceNotFoundException("アカウントが存在しません");
		}

		return account;
	}

	public void update(PasschangeForm passchangeForm) {
		accountRespository.update(passchangeForm);
	}

	/*
	public void create(Account account, String password) {

		account.setEncodedPassword(passwordEncoder.encode(password));
		accountRespository.create(account);
	}
	*/
}
