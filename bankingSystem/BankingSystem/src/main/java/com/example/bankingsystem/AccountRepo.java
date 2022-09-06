package com.example.bankingsystem;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepo extends JpaRepository<Account,Integer> {
	

}
