package com.online.food.service;

import com.online.food.exception.CategoryException;
import com.online.food.exception.LoginException;
import com.online.food.model.Category;

import java.util.List;

public interface CategoryService {

	public Category addCategory(String key, String categoryName) throws CategoryException, LoginException;

	public Category removeCategory(String key, String categoryName) throws CategoryException, LoginException;

	public List<Category> viewAllCategory(String key) throws CategoryException, LoginException;

	public Category viewCategoryById(String key, Integer categoryId) throws CategoryException, LoginException;

	public Category updateCategory(String key, Category category) throws CategoryException, LoginException;

}
