package com.capgemini.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.capgemini.bean.Employee;

public class EmployeeRepoImplimentation implements EmployeeRepo {
	
	HashMap<Integer, Employee> map = new HashMap<>();
	
	
	@Override
	public Employee save(Employee e)
	{
		map.put(e.getId(), e);
		return e;
	}
	
	@Override
	public List<Employee> findByName(String name)
	{
		List<Employee> list = new ArrayList<>();
		Iterator<Employee> iterator= map.values().iterator();
		Employee emp;
		while(iterator.hasNext()){
			
			emp = iterator.next();
			if(emp.getName()==name)
				list.add(emp);
		}
		
		return list;
	}

}
