package com.online.food.service;

import com.online.food.exception.CategoryException;
import com.online.food.exception.ItemException;
import com.online.food.exception.LoginException;
import com.online.food.model.CategoryDTO;
import com.online.food.model.Item;
import com.online.food.model.ItemDTO;

import java.util.List;

public interface ItemService {

	public Item addItem(String key, Item item) throws ItemException, CategoryException, LoginException;

	public Item updateItem(String key, ItemDTO itemDTO) throws ItemException, CategoryException, LoginException;

	public Item removeItem(String key, ItemDTO itemDTO) throws ItemException, LoginException;

	public Item removeItemById(String key, Integer itemId) throws ItemException, LoginException;

	public List<Item> getAllItem(String key) throws ItemException, LoginException;

	public List<Item> getAllItemByCategory(String key, CategoryDTO categoryDTO)
			throws ItemException, CategoryException, LoginException;

	public List<Item> getAllItemByCategoryName(String key, String categoryName)
			throws ItemException, CategoryException, LoginException;

}
