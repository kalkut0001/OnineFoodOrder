package com.online.food.repository;

import com.online.food.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepo extends JpaRepository<Bill, Integer>{

}


