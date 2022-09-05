package com.sixdee.bankingsystem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountConrtroller {
	
	AccountRepo acc;
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addCustomer")
	public String addCustomer(Account account) {
		acc.save(account);
		return "home.jsp";
	}
}
