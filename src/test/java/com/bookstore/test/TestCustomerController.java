package com.bookstore.test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.bookstore.controller.CustomerController;
import com.bookstore.models.CreditCard;
import com.bookstore.models.Customer;

public class TestCustomerController {
	
	@Test
	public void testAddCustomer() {
		
		//scenario
		CreditCard jaCC3 = new CreditCard(123456, "Visa");
		CreditCard jaCC4 = new CreditCard(654321, "MasterCard");
		ArrayList<CreditCard> ccList5 = new ArrayList<CreditCard>();
		Customer customer1 = new Customer(0, "Josh Ashford", "joshashford@gmail.com", ccList5);
		ArrayList<CreditCard> ccList3 = new ArrayList<CreditCard>();
		CreditCard ptCC3 = new CreditCard(123456, "Visa");
		Customer customer2 = new Customer(1, "Josh Kerr", "joshkerr@gmail.com", ccList3);
		Customer addedCustomer;
		Customer existingCust;
		CustomerController tester = new CustomerController();
		
		//action
		ccList5.add(jaCC3);
		ccList5.add(jaCC4);
		ccList3.add(ptCC3);
		existingCust = tester.addCustInit(customer1);
		addedCustomer = tester.addCustomer(customer2);
		
		
		//assert
		Assert.assertNotSame(existingCust, addedCustomer);
		
	}	

}
