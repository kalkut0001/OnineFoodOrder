package com.online.food.service;

import com.online.food.exception.AddressException;
import com.online.food.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService{

	@Override
	public List<Restaurant> getAllRestaurantsByAddressId(Integer addressId) throws AddressException {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
