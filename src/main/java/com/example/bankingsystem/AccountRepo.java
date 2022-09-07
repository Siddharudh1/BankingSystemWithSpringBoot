package com.example.bankingsystem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountRepo extends JpaRepository<Account,Integer> {
	
	

}