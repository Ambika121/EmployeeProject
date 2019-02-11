package com.capgemini.service;

import java.util.List;

import com.capgemini.bean.Address;
import com.capgemini.bean.Employee;
import com.capgemini.exception.nullFieldsFoundException;
import com.capgemini.repo.EmployeeRepoImplimentation;

public class EmployeeServiceImplimentation implements EmployeeService {
	
	EmployeeRepoImplimentation EmpRepo;
	
	
	public EmployeeServiceImplimentation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeServiceImplimentation(EmployeeRepoImplimentation empRepo) {
		super();
		EmpRepo = empRepo;
	}

	
	@Override
	public Employee createEmployee(int id, String name, Address address) throws nullFieldsFoundException
	{
		Employee employee = new Employee(id, name, address);
		return EmpRepo.save(employee);
	}
	
	
	@Override
	public List<Employee> searchByName(String name)
	{
		return EmpRepo.findByName(name);
	}

}
