package com.capgemini.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.capgemini.bean.Address;
import com.capgemini.bean.City;
import com.capgemini.bean.Country;
import com.capgemini.bean.Employee;
import com.capgemini.exception.nullFieldsFoundException;
import com.capgemini.repo.EmployeeRepoImplimentation;
import com.capgemini.service.EmployeeServiceImplimentation;

public class EmployeeTest {

	static final int[] id = {101, (Integer) null, 103, 104, 101};
	static final String[] EmpName = {null, "DEF", "GHI", "JKL", "MNO"};
	static final String[] AddlineName = {"12-B", "42-B", null, "45-D", "24-AB"};
	static final String[] CounName = {"India", "India", "India", "India", "India"};
	static final String[] CityName = {"Pune", "Mumbai", "Delhi", "Banglore", "Hyderabad"};
	
	EmployeeRepoImplimentation EmpRepo = new EmployeeRepoImplimentation();
    EmployeeServiceImplimentation EmpService = new EmployeeServiceImplimentation(EmpRepo);

	
	@Test(expected = com.capgemini.exception.nullFieldsFoundException.class)
	public void tag1() throws nullFieldsFoundException {
		int i = 0;
		City city = new City(CityName[i]);
		Country country = new Country(CounName[i], city);
		Address address = new Address(AddlineName[i], country);
		Employee employee = EmpService.createEmployee(id[i], EmpName[i], address);
	}
	
	@Test(expected = com.capgemini.exception.nullFieldsFoundException.class)
	public void tag2() throws nullFieldsFoundException {
		int i = 1;
		City city = new City(CityName[i]);
		Country country = new Country(CounName[i], city);
		Address address = new Address(AddlineName[i], country);
		Employee employee = EmpService.createEmployee(id[i], EmpName[i], address);
	}
	
	@Test(expected = com.capgemini.exception.nullFieldsFoundException.class)
	public void tag3() throws nullFieldsFoundException {
		int i = 2;
		City city = new City(CityName[i]);
		Country country = new Country(CounName[i], city);
		Address address = new Address(AddlineName[i], country);
		Employee employee = EmpService.createEmployee(id[i], EmpName[i], address);
	}
	
	@Test
	public void tag4() throws nullFieldsFoundException {
		int i = 3;
		City city = new City(CityName[i]);
		Country country = new Country(CounName[i], city);
		Address address = new Address(AddlineName[i], country);
		Employee employee = EmpService.createEmployee(id[i], EmpName[i], address);
	}
	
	@Test(expected = com.capgemini.exception.idAlreadyExistsException.class)
	public void tag5() throws nullFieldsFoundException {
		int i = 4;
		City city = new City(CityName[i]);
		Country country = new Country(CounName[i], city);
		Address address = new Address(AddlineName[i], country);
		Employee employee = EmpService.createEmployee(id[i], EmpName[i], address);
	}
	
	@Test(expected = com.capgemini.exception.InvalidNameException.class)
	public void tag6() {
		List<Employee> Emp = EmpService.searchByName(null);
	}
	
	@Test(expected = com.capgemini.exception.nameNotFountException.class)
	public void tag7() {
		List<Employee> Emp = EmpService.searchByName(null);
	}
	
	@Test
	public void tag8()
	{
		List<Employee> Emp = EmpService.searchByName(null);
	}

}
