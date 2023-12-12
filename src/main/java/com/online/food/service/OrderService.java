package com.online.food.service;

import com.online.food.exception.CustomerException;
import com.online.food.exception.FoodCartException;
import com.online.food.exception.LoginException;
import com.online.food.exception.OrderDetailsException;
import com.online.food.model.OrderDetails;

public interface OrderService {

	public OrderDetails addOrder(String key, Integer customerId)
			throws CustomerException, FoodCartException, LoginException;

	public OrderDetails updateOrder(String key, Integer orderId, Integer customerId)
			throws OrderDetailsException, CustomerException, FoodCartException, LoginException;

	public OrderDetails removeOrder(String key, Integer orderId) throws OrderDetailsException, LoginException;

	public OrderDetails viewOrder(String key, Integer orderId) throws OrderDetailsException, LoginException;

}
