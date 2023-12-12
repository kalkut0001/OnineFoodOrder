package com.online.food.service;

import com.online.food.exception.BillException;
import com.online.food.exception.CustomerException;
import com.online.food.exception.LoginException;
import com.online.food.exception.OrderDetailsException;
import com.online.food.model.Bill;

public interface BillService {

	public Bill generateBill(String key, Integer customerId, Integer orderDetailId)
			throws BillException, CustomerException, OrderDetailsException, LoginException;

	public Bill updateBill(String key, Bill bill) throws BillException, LoginException;

	public Bill removeBill(String key, Integer billId) throws BillException, LoginException;

	public Bill viewBill(String key, Integer billId) throws BillException, LoginException;

}
