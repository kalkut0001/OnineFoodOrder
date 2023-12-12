package com.online.food.service;

import com.online.food.exception.CustomerException;
import com.online.food.exception.FoodCartException;
import com.online.food.exception.ItemException;
import com.online.food.exception.LoginException;
import com.online.food.model.FoodCart;

public interface FoodCartService {
	
	public FoodCart addItemToCart(String key, Integer customerId, Integer itemId) throws ItemException, CustomerException, LoginException;
	
	public FoodCart increaseItemQuantity(String key, Integer cartId, Integer quantity, Integer itemId) throws FoodCartException, ItemException, LoginException;

	public FoodCart decreaseItemQuantity(String key, Integer cartId, Integer quantity, Integer itemId) throws FoodCartException, ItemException, LoginException;
	
	public FoodCart removeItem(String key, Integer cartId, Integer itemId) throws FoodCartException, ItemException, LoginException;
	
	public FoodCart removeCart(String key, Integer cartId) throws FoodCartException, LoginException;
}
