package com.online.food.repository;

import com.online.food.exception.ItemException;
import com.online.food.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo extends JpaRepository<Item, Integer>{
	
	public Item findByItemName(String item) throws ItemException;
	
	
}
