package com.bookstore.models;

import java.util.ArrayList;

public class Customer {

	private int id;
	private String name;
	private String email;
	private ArrayList<CreditCard> ccList;
	
	public Customer(int id, String name, String email, ArrayList<CreditCard> ccList) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.ccList = ccList;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (id != other.id)
			return false;
		return true;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<CreditCard> getCcList() {
		return ccList;
	}

	public void setCcList(ArrayList<CreditCard> ccList) {
		this.ccList = ccList;
	}
	
	
	
	
	
}
