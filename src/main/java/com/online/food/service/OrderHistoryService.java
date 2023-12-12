package com.online.food.service;

import com.online.food.exception.CustomerException;
import com.online.food.exception.LoginException;
import com.online.food.exception.OrderHistoryException;
import com.online.food.model.OrderHistory;

import java.util.List;

public interface OrderHistoryService {

	public OrderHistory getOrderHistoryById(String key, Integer orderHisId)
			throws OrderHistoryException, LoginException;

	public List<OrderHistory> getOrderHistoryByCustomerId(String key, Integer customerId)
			throws OrderHistoryException, LoginException, CustomerException;

	public List<OrderHistory> getAllOrderHistory(String key) throws OrderHistoryException, LoginException;

}
