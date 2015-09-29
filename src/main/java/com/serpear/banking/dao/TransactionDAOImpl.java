package com.serpear.banking.dao;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.serpear.banking.model.Transaction;

public class TransactionDAOImpl implements TransactionDAO {
	private SessionFactory sessionFactory;
	
	public TransactionDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public void saveOrUpdate(Transaction transaction) {
		sessionFactory.getCurrentSession().saveOrUpdate(transaction);
	}

}
