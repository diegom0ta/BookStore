package com.bookstore.models;

public class CreditCard {

	private int number;
	private String flag;
	
	public CreditCard(int number, String flag) {
		super();
		this.number = number;
		this.flag = flag;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	
	
	
}
