package com.online.food.repository;

import com.online.food.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	
	public Customer findByEmail(String email);

}
