package com.capgemini.bean;

import com.capgemini.exception.nullFieldsFoundException;

public class Employee {
	
	int id;
	String name;
	Address address;
	
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public Employee(int id, String name, Address address) throws nullFieldsFoundException {
		super();
		
		if(id == (Integer) null) throw new nullFieldsFoundException();
		if(name == null) throw new nullFieldsFoundException();
		
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public String toString()
	{
		return (id + " " + name + " " + address);
	}
	
}
