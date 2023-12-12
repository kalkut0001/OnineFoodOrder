package com.online.food.service;

import com.online.food.exception.AddressException;
import com.online.food.exception.ItemException;
import com.online.food.exception.LoginException;
import com.online.food.exception.RestaurantException;
import com.online.food.model.Restaurant;

import java.util.List;

public interface RestaurantService {

	public Restaurant addRestaurant(String key, Restaurant restaurant) throws RestaurantException, LoginException;

	public Restaurant updateRestaurant(String key, Restaurant restaurant) throws RestaurantException, LoginException;

	public Restaurant removeRestaurant(String key, Integer restaurantId) throws RestaurantException, LoginException;

	public Restaurant viewRestaurantById(String key, Integer restaurantId) throws RestaurantException, LoginException;

	public List<Restaurant> getAllRestaurants(String key) throws RestaurantException, LoginException;

	public List<Restaurant> viewNearByRestaurant(String key, String city)
			throws RestaurantException, AddressException, LoginException;

	public List<Restaurant> viewRestaurantByItemName(String key, String itemName)
			throws RestaurantException, ItemException, LoginException;

}
