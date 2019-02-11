package com.capgemini.bean;

import com.capgemini.exception.nullFieldsFoundException;

public class Country {
	
	String name;
	City city;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public City getCity() {
		return city;
	}


	public void setCity(City city) {
		this.city = city;
	}


	public Country(String name, City city) throws nullFieldsFoundException {
		super();
		
		if(name == null) throw new nullFieldsFoundException();
		
		this.name = name;
		this.city = city;
	}
	
	public String toString()
	{
		return(name + " " + city);
	}

}
