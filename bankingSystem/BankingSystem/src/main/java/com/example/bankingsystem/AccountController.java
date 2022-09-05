package com.example.bankingsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AccountController 
{
	@Autowired
	AccountRepo repo;
	@RequestMapping("/")
	public String home() 
	{
		return "home.jsp";
	}
	@RequestMapping("/addAccount")
	public String addAccount(Account account) 
	{
		repo.save(account);
		return "home.jsp";
	}
	/*public String addMoney(@RequestParam int amt) {
		Account acc;
		double bal = acc.getBalance() +amt;
		return "add.jsp";
	}*/
}