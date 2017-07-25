package com.example.terasoluna.domain.repository.account;

import com.example.terasoluna.domain.model.Account;

public interface AccountRepository {

	Account findOne(String userid);

	/*
	void create(Account account);

	boolean update(Account account);
	*/
}
