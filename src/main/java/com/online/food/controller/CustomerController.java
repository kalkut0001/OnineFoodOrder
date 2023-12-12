package com.online.food.controller;

import com.online.food.exception.CustomerException;
import com.online.food.exception.LoginException;
import com.online.food.model.Customer;
import com.online.food.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/add")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) throws CustomerException {
		Customer returnCustomer = customerService.addCustomer(customer);
		return new ResponseEntity<Customer>(returnCustomer, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<Customer> updateCustomer(@RequestParam(required = false) String key,
			@RequestBody Customer customer) throws CustomerException, LoginException {
		Customer returnCustomer = customerService.updateCustomer(key, customer);
		return new ResponseEntity<Customer>(returnCustomer, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Customer> deleteCustomerById(@RequestParam(required = false) String key,
			@PathVariable("id") Integer customerId) throws CustomerException, LoginException {
		Customer customer = customerService.removeCustomerById(key, customerId);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<Customer> deleteCustomer(@RequestParam(required = false) String key,
			@RequestBody Customer customer) throws CustomerException, LoginException {
		Customer resCustomer = customerService.removeCustomer(key, customer);
		return new ResponseEntity<Customer>(resCustomer, HttpStatus.OK);
	}

	@GetMapping("/all/{id}")
	public ResponseEntity<Customer> viewCutomer(@RequestParam(required = false) String key,
			@PathVariable("id") Integer id) throws CustomerException, LoginException {
		Customer customer = customerService.viewCustomer(key, id);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}

	@GetMapping("/all")
	public ResponseEntity<List<Customer>> viewAllCustomers(@RequestParam(required = false) String key)
			throws CustomerException, LoginException {
		List<Customer> customers = customerService.viewAllCustomers(key);
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
	}
}
