package com.online.food.controller;

import com.online.food.exception.CategoryException;
import com.online.food.exception.ItemException;
import com.online.food.exception.LoginException;
import com.online.food.model.CategoryDTO;
import com.online.food.model.Item;
import com.online.food.model.ItemDTO;
import com.online.food.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

	@Autowired
	private ItemService itemService;

	@GetMapping("/all")
	public ResponseEntity<List<Item>> getAllItem(@RequestParam(required = false) String key)
			throws ItemException, LoginException {
		List<Item> itemList = itemService.getAllItem(key);
		return new ResponseEntity<List<Item>>(itemList, HttpStatus.OK);
	}

	@GetMapping("/category")
	public ResponseEntity<List<Item>> getAllItemByCategory(@RequestParam(required = false) String key,
			@RequestBody CategoryDTO categoryDTO) throws ItemException, CategoryException, LoginException {
		List<Item> itemList = itemService.getAllItemByCategory(key, categoryDTO);
		return new ResponseEntity<List<Item>>(itemList, HttpStatus.OK);
	}

	@GetMapping("/get/{categoryName}")
	public ResponseEntity<List<Item>> getAllItemByCategoryName(@RequestParam(required = false) String key,
			@PathVariable String categoryName) throws ItemException, CategoryException, LoginException {
		List<Item> itemList = itemService.getAllItemByCategoryName(key, categoryName);
		return new ResponseEntity<List<Item>>(itemList, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<Item> addItem(@RequestParam(required = false) String key, @RequestBody Item item)
			throws ItemException, CategoryException, LoginException {
		Item savedItem = itemService.addItem(key, item);

		return new ResponseEntity<Item>(savedItem, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<Item> updateItem(@RequestParam(required = false) String key, @RequestBody ItemDTO itemDTO)
			throws ItemException, CategoryException, LoginException {
		Item updatedItem = itemService.updateItem(key, itemDTO);

		return new ResponseEntity<Item>(updatedItem, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<Item> removeItem(@RequestParam(required = false) String key, @RequestBody ItemDTO itemDTO)
			throws ItemException, LoginException {
		Item deletedItem = itemService.removeItem(key, itemDTO);

		return new ResponseEntity<Item>(deletedItem, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Item> removeItemById(@RequestParam(required = false) String key,
			@PathVariable("id") Integer id) throws ItemException, LoginException {
		Item deletedItem = itemService.removeItemById(key, id);

		return new ResponseEntity<Item>(deletedItem, HttpStatus.OK);
	}
}
