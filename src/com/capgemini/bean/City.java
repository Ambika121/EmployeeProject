package com.capgemini.bean;

import com.capgemini.exception.nullFieldsFoundException;

public class City {
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City(String name) throws nullFieldsFoundException {
		super();
		
		if(name==null) throw new nullFieldsFoundException();
			
		this.name = name;
	}
	
	public String toString() {
		return (name);
	}

}
