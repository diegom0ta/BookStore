package com.bookstore.models;

import java.util.List;

public class Purchase {

	private int id;
	private Customer customer;
	private List<Book> wishedBookList;
	private double value;
	
	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Purchase(int id, Customer customer, List<Book> wishedBookList, double value) {
		super();
		this.id = id;
		this.customer = customer;
		this.wishedBookList = wishedBookList;
		this.value = value;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Book> getWishedBookList() {
		return wishedBookList;
	}
	public void setWishedBookList(List<Book> wishedBookList) {
		this.wishedBookList = wishedBookList;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
	
	
}
