package com.online.food.service;

import com.online.food.exception.CustomerException;
import com.online.food.exception.LoginException;
import com.online.food.model.Customer;

import java.util.List;

public interface CustomerService {

	Customer addCustomer(Customer customer) throws CustomerException;

	Customer updateCustomer(String key, Customer customer) throws CustomerException, LoginException;

	Customer removeCustomerById(String key, Integer customerId) throws CustomerException, LoginException;

	Customer removeCustomer(String key, Customer customer) throws CustomerException, LoginException;

	Customer viewCustomer(String key, Integer customerId) throws CustomerException, LoginException;

	List<Customer> viewAllCustomers(String key) throws CustomerException, LoginException;

}
