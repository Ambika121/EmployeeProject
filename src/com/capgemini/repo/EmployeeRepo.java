package com.capgemini.repo;

import java.util.List;

import com.capgemini.bean.Employee;

public interface EmployeeRepo {

	Employee save(Employee e);

	List<Employee> findByName(String name);

}