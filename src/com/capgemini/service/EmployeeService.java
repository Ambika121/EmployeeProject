package com.capgemini.service;

import java.util.List;

import com.capgemini.bean.Address;
import com.capgemini.bean.Employee;
import com.capgemini.exception.nullFieldsFoundException;

public interface EmployeeService {

	Employee createEmployee(int id, String name, Address address) throws nullFieldsFoundException;

	List<Employee> searchByName(String name);

}