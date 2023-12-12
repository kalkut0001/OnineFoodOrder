package com.online.food.repository;

import com.online.food.model.OrderHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderHistoryRepo extends JpaRepository<OrderHistory, Integer> {

	public List<OrderHistory> findByCustomerId(Integer customerId);

}
