package com.example.bankingsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController 
{
	@Autowired
	AccountRepo repo;
	
	
	@PostMapping("/Account")
	@ResponseBody
	public int addAccount(@RequestBody Account account) 
	{
		repo.save(account);
		System.out.println("Account created...");
		return 0;
	}
	@PutMapping("/addMoney/{customerId}/{balance}")
	public int addMoney(@PathVariable int customerId,@PathVariable int balance) {
		Account acc = repo.getById(customerId);
		int newbal = acc.getBalance()+balance;
		acc.setBalance(newbal);
		repo.save(acc);
		System.out.println("Amount created......\n Remaning balance is :"+newbal);
		return 0;
	}
	@PutMapping("/withDrawMoney/{customerId}/{balance}")
	public int withDrawMoney(@PathVariable int customerId,@PathVariable int balance) {
		Account acc = repo.getById(customerId);
		int newbal = acc.getBalance()-balance;
		acc.setBalance(newbal);
		repo.save(acc);
		System.out.println("Amount withdraw successfully.....\n Remaining balance is:"+newbal);
		return 0;
	}
	@DeleteMapping("/Account/{customerId}")
	public int closeAccount(@PathVariable int customerId) {
		Account acc = repo.getOne(customerId);
		repo.delete(acc);
		System.out.println("Account  deleted.......");
		return 0;
	}
	
}