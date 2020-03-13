package com.bookstore.controller;

import java.util.List;

import com.bookstore.models.Book;
import com.bookstore.models.Purchase;

public class PurchaseController {
	
	Purchase purchase = new Purchase();
	List<Book> bookList = purchase.getWishedBookList();
	
	public double purchaseValue(List<Book> bookList) {
		
		double value = 0;
		   	
		for (int i=0; i < bookList.size(); i++) {
			
			value += bookList.get(i).getPrice();
			
		}

		 System.out.println(value);
		
		return value;
	}

}
