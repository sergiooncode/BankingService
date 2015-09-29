package com.serpear.banking.dao;

import java.util.List;

import com.serpear.banking.model.Account;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

public class AccountDAOImpl implements AccountDAO {
	private SessionFactory sessionFactory;
	 
    public AccountDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	@Override
	@Transactional
	public List<Account> list() {
		@SuppressWarnings("unchecked")
        List<Account> listAccount = (List<Account>) sessionFactory.getCurrentSession()
                .createCriteria(Account.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
 
        return listAccount;
	}

	@Override
    @Transactional
    public void saveOrUpdate(Account account) {
        sessionFactory.getCurrentSession().saveOrUpdate(account);
    }
}
