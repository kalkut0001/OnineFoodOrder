package com.online.food.repository;

import com.online.food.exception.AddressException;
import com.online.food.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer>{

	public Address findByCity(String city) throws AddressException;
	
}
