package com.example.terasoluna.domain.repository.account;

import com.example.terasoluna.domain.model.Account;
import com.example.terasoluna.domain.model.password.PasschangeForm;

public interface AccountRepository {

	Account findOne(String userid);

	boolean update(PasschangeForm passchangeForm);

}
