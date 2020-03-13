package com.bookstore.test;

import org.junit.Assert;
import org.junit.Test;

import com.bookstore.controller.BookController;
import com.bookstore.models.Book;

public class TestBookController {

	//@Test
	public void testAddBook() {
		
		//scenario
		BookController tester = new BookController();
		Book book1 = new Book(0, "Programming Java", "Diego Mota", 59.90);
		Book book2 = new Book(1, "Programming Python", "Diego Mota", 69.90);
		Book existingBook;
		Book addedBook;
		
		//action
		existingBook = tester.addBookInit(book1);
		addedBook = tester.addBook(book2);
		
		//assert
		Assert.assertNotSame(addedBook, existingBook);
		
		
	}
	
	@Test
	public void testRemoveBook() {
		
		//scenario
		BookController tester = new BookController();
		Book book1 = new Book(0, "Programming Java", "Diego Mota", 59.90);
		Book book2 = new Book(1, "Programming Python", "Diego Mota", 69.90);
		Book addedBook;
		Book removedBook;
		
		//action
		tester.addBookInit(book1);
		addedBook = tester.addBook(book2);
		removedBook = tester.removeBook(book2);
		
		//assert
		Assert.assertEquals(addedBook, removedBook);
		
		
	}
	
}
