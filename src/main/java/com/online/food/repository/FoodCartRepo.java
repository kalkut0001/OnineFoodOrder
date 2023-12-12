package com.online.food.repository;

import com.online.food.model.FoodCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodCartRepo extends JpaRepository<FoodCart, Integer>{

}
