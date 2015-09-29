package com.serpear.banking.controller;
 
import java.util.List;

import com.serpear.banking.model.Account;
import com.serpear.banking.dao.AccountDAO;
import com.serpear.banking.model.User;
import com.serpear.banking.dao.UserDAO;
import com.serpear.banking.model.Transaction;
import com.serpear.banking.dao.TransactionDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
     
    @Autowired
    private AccountDAO accountDao;
    
    @Autowired
    private UserDAO userDao;
    
    @Autowired
    private TransactionDAO transactionDao;
     
    @RequestMapping(value="/")
    public ModelAndView handleRequest() throws Exception {
        List<Account> listAccounts = accountDao.list();
        ModelAndView model = new ModelAndView("BankingHome");
        model.addObject("accountList", listAccounts);
        return model;
    }
    
    @RequestMapping(value = "/newAccount", method = RequestMethod.GET)
	public ModelAndView newAccount() {
		ModelAndView model = new ModelAndView("AccountForm");
		model.addObject("account", new Account());
		return model;		
	}
    
    @RequestMapping(value = "/saveAccount", method = RequestMethod.POST)
	public ModelAndView saveAccount(@ModelAttribute Account account) {
		accountDao.saveOrUpdate(account);
		return new ModelAndView("redirect:/");
	}
    
    @RequestMapping(value = "/newUser", method = RequestMethod.GET)
	public ModelAndView newUser() {
		ModelAndView model = new ModelAndView("UserForm");
		model.addObject("user", new User());
		return model;		
	}
    
    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute User user, @ModelAttribute Account account) {
		userDao.saveOrUpdate(user);
		accountDao.saveOrUpdate(account);
		return new ModelAndView("redirect:/");
	}
    
    @RequestMapping(value = "/depositCurrency", method = RequestMethod.GET)
	public ModelAndView depositCurrency() {
		ModelAndView model = new ModelAndView("DepositForm");
		model.addObject("transaction", new Transaction());
		return model;
    }
    
  @RequestMapping(value = "/saveDeposit", method = RequestMethod.POST)
	public ModelAndView saveDeposit(@ModelAttribute Transaction transaction) {
	  	transactionDao.saveOrUpdate(transaction);
	  	return new ModelAndView("redirect:/");
	}
    
    @RequestMapping(value = "/withdrawCurrency", method = RequestMethod.GET)
	public ModelAndView withdrawCurrency() {
		ModelAndView model = new ModelAndView("WithdrawalForm");
		model.addObject("transaction", new Transaction());
		return model;
    }
    
}
