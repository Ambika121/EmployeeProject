package com.capgemini.view;

import java.util.List;

import com.capgemini.bean.Address;
import com.capgemini.bean.City;
import com.capgemini.bean.Country;
import com.capgemini.bean.Employee;
import com.capgemini.exception.nullFieldsFoundException;
import com.capgemini.repo.EmployeeRepoImplimentation;
import com.capgemini.service.EmployeeServiceImplimentation;

public class EmployeeClient {
	
	
	static final int[] id = {101, 102, 103, 104, 105};
	static final String[] EmpName = {"ABC", "DEF", "GHI", "JKL", "MNO"};
	static final String[] AddlineName = {"12-B", "42-B", "65-C", "45-D", "24-AB"};
	static final String[] CounName = {"India", "India", "India", "India", "India"};
	static final String[] CityName = {"Pune", "Mumbai", "Delhi", "Banglore", "Hyderabad"};
	
	public static void main(String[] args) throws nullFieldsFoundException {
		// TODO Auto-generated method stub
		int i;
	    EmployeeRepoImplimentation EmpRepo = new EmployeeRepoImplimentation();
	    EmployeeServiceImplimentation EmpService = new EmployeeServiceImplimentation(EmpRepo);
		for(i=0; i<5; i++)
		{
			City city = new City(CityName[i]);
			Country country = new Country(CounName[i], city);
			Address address = new Address(AddlineName[i], country);
			Employee employee = EmpService.createEmployee(id[i], EmpName[i], address);
			System.out.println(employee);
		}
		
		List<Employee> Emp = EmpService.searchByName("DEF");
		System.out.println(Emp);

	}

}
