package com.serpear.banking.dao;

import java.util.List;

import com.serpear.banking.model.Account;

public interface AccountDAO {
	public List<Account> list();
	
	public void saveOrUpdate(Account account);
}
