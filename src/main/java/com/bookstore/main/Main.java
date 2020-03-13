package com.bookstore.main;

import java.util.ArrayList;

import com.bookstore.controller.CustomerController;
import com.bookstore.models.CreditCard;
import com.bookstore.models.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditCard jwCC3 = new CreditCard(123456, "Visa");
		CreditCard jwCC4 = new CreditCard(654321, "MasterCard");
		CreditCard ptCC3 = new CreditCard(123456, "Visa");
		CreditCard ptCC4 = new CreditCard(654321, "MasterCard");
		ArrayList<CreditCard> ccList3 = new ArrayList<CreditCard>();
		ArrayList<CreditCard> ccList4 = new ArrayList<CreditCard>();
		
		ccList3.add(jwCC3);
		ccList3.add(jwCC4);
		ccList4.add(ptCC3);
		ccList4.add(ptCC4);
		
		Customer customer3 = new Customer(0, "John Wayne", "johnwayne@gmail.com", ccList3);
		Customer customer4 = new Customer(1, "Peter Tosh", "petertosh@gmail.com", ccList4);
		
		CustomerController newCustomer = new CustomerController();
		
		newCustomer.addCustInit(customer3);
		
		newCustomer.addCustomer(customer4);
		newCustomer.addCustomer(customer4);
		
	}

}
