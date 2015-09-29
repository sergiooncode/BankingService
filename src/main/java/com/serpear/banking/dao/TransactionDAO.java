package com.serpear.banking.dao;

//import java.util.List;

import com.serpear.banking.model.Transaction;

public interface TransactionDAO {
//	public List<Account> list();
	
	public void saveOrUpdate(Transaction transaction);
}
