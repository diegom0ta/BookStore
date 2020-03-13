package com.bookstore.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.bookstore.controller.PurchaseController;
import com.bookstore.models.Book;

public class TestPurchaseController {
	
	@Test
	public void testPurchaseValue() {
		
		//Scenario
		Book book1 = new Book(0, "Programming Java", "Diego Mota", 59.90);
		Book book2 = new Book(1, "Programming Python", "Diego Mota", 69.90);
		List<Book> bookList = new ArrayList<Book>();
		PurchaseController tester = new PurchaseController();
		
		//action
		bookList.add(book1.getId(), book1);
		bookList.add(book2.getId(), book2);
		double finalValue = tester.purchaseValue(bookList);
		
		//assert
		Assert.assertEquals(129.80, finalValue, 1e-8);
		
	}
	
}
