package com.online.food.service;

import com.online.food.exception.AddressException;
import com.online.food.model.Restaurant;

import java.util.List;

public interface AddressService {
	
	public List<Restaurant> getAllRestaurantsByAddressId(Integer addressId) throws AddressException;

}
