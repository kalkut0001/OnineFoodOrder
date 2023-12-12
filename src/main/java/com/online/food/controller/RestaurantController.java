package com.online.food.controller;

import com.online.food.exception.AddressException;
import com.online.food.exception.ItemException;
import com.online.food.exception.LoginException;
import com.online.food.exception.RestaurantException;
import com.online.food.model.Restaurant;
import com.online.food.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

	@Autowired
	private RestaurantService resService;

	@PostMapping("/add")
	public ResponseEntity<Restaurant> addRestaurant(@RequestParam(required = false) String key,
			@RequestBody Restaurant res) throws RestaurantException, LoginException {
		Restaurant restaurant = resService.addRestaurant(key, res);
		return new ResponseEntity<Restaurant>(restaurant, HttpStatus.ACCEPTED);
	}

	@PutMapping("/update")
	public ResponseEntity<Restaurant> updateRestaurant(@RequestParam(required = false) String key,
			@RequestBody Restaurant res) throws RestaurantException, LoginException {
		Restaurant restaurant = resService.updateRestaurant(key, res);
		return new ResponseEntity<Restaurant>(restaurant, HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<Restaurant> deleteRestaurant(@RequestParam(required = false) String key, Integer restaurantId)
			throws RestaurantException, LoginException {
		Restaurant restaurant = resService.removeRestaurant(key, restaurantId);
		return new ResponseEntity<Restaurant>(restaurant, HttpStatus.OK);
	}

	@GetMapping("/view/{id}")
	public ResponseEntity<Restaurant> viewRestaurant(@RequestParam(required = false) String key,
			@PathVariable("id") Integer restaurantId) throws RestaurantException, LoginException {
		Restaurant restaurant = resService.viewRestaurantById(key, restaurantId);
		return new ResponseEntity<Restaurant>(restaurant, HttpStatus.OK);
	}

	@GetMapping("/view")
	public ResponseEntity<List<Restaurant>> viewAllRestaurant(@RequestParam(required = false) String key)
			throws RestaurantException, LoginException {
		List<Restaurant> restaurant = resService.getAllRestaurants(key);
		return new ResponseEntity<List<Restaurant>>(restaurant, HttpStatus.OK);
	}

	@GetMapping("/findNearByRestaurantByCity/{city}")
	public ResponseEntity<List<Restaurant>> findNearByRestaurantByCityHandler(
			@RequestParam(required = false) String key, @PathVariable("city") String city)
			throws RestaurantException, AddressException, LoginException {
		List<Restaurant> restaurantList = resService.viewNearByRestaurant(key, city);
		return new ResponseEntity<List<Restaurant>>(restaurantList, HttpStatus.OK);
	}

	@GetMapping("/findNearByRestaurantByItemName/{item}")
	public ResponseEntity<List<Restaurant>> viewRestaurantByItemNameHandler(@RequestParam(required = false) String key,
			@PathVariable("item") String item) throws RestaurantException, ItemException, LoginException {
		List<Restaurant> restaurantList = resService.viewRestaurantByItemName(key, item);
		return new ResponseEntity<List<Restaurant>>(restaurantList, HttpStatus.OK);
	}

}
