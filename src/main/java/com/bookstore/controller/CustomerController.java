package com.bookstore.controller;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.bookstore.models.Customer;

public class CustomerController {

	List<Customer> customerList = new CopyOnWriteArrayList<Customer>();
	String successMsg = "Customer added";
	String errorMsg = "Customer already exists";
	
	public Customer addCustInit(Customer customer) {
				
		customerList.add(customer.getId(), customer);
		return customer;
	}
	
	public Customer addCustomer(Customer customer) {
		
		for(Customer c : customerList) {
		if (c.equals(customer)) {
			System.out.println(errorMsg);
			
		}else {
		customerList.add(customer.getId(), customer);
		System.out.println(successMsg);
		}
	}
		return customer;
	}
	
}
