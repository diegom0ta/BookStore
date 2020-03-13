package com.bookstore.controller;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.bookstore.models.Book;

public class BookController {

	List<Book> bookList = new CopyOnWriteArrayList<Book>();
	String successMsgAdd = "Book added";
	String errorMsgAdd = "Book already exists";
	String successMsgR = "Book removed";
	String errorMsgR = "Book doesn't exist";
	
	
public Book addBookInit(Book book) {
		
		bookList.add(book.getId(), book);
		return book;
	}
	
	public Book addBook(Book book) {
		
		for(Book b : bookList) {
		if (b.equals(book)) {
			System.out.println(errorMsgAdd);
			
		}else {
		bookList.add(book.getId(), book);
		System.out.println(successMsgAdd);
		}
	}
		return book;
	}
	
public Book removeBook(Book book) {
		
		for(Book b : bookList) {
		if (b.equals(book)) {
			bookList.remove(book.getId());
			System.out.println(successMsgR);
			
		}else {
		System.out.println(errorMsgR);
		}
	}
		return book;
	}
	
}
