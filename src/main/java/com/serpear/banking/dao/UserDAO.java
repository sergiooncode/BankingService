package com.serpear.banking.dao;

//import java.util.List;

import com.serpear.banking.model.User;

public interface UserDAO {
//	public List<Account> list();
	
	public void saveOrUpdate(User user);
}
