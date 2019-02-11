package com.capgemini.bean;

import com.capgemini.exception.nullFieldsFoundException;

public class Address {
	
	String addressline;
	Country country;
	
	public String getAddressline() {
		return addressline;
	}
	public void setAddressline(String addressline) {
		this.addressline = addressline;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	
	
	public Address(String addressline, Country country) throws nullFieldsFoundException {
		super();
		
		if(addressline==null) throw new nullFieldsFoundException();
		this.addressline = addressline;
		this.country = country;
	}
	
	public String toString()
	{
		return (addressline + " " + country);
	}
	
}
