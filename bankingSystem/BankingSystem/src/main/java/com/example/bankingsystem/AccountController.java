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
	
	
	@PostMapping("/Account")
	@ResponseBody
	public Account addAccount(@RequestBody Account account) 
	{
		repo.save(account);
		System.out.println("Account created...");
		return account;
	}
	/*@PutMapping("/Account/{balance}")
	public String addMoney(@PathVariable int balance) {
		Account acc =repo.updateBalance(balance);
		repo.save(acc);
		return "Money Added.......";
	}*/
	
	@DeleteMapping("/Account/{customerId}")
	public String closeAccount(@PathVariable int customerId) {
		Account acc = repo.getOne(customerId);
		repo.delete(acc);
		return "Account  deleted.......";
	}
}
