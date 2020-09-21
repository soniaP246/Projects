package com.sp.service;

import java.util.List;
import java.util.Optional;


import com.sp.model.Employee;


public interface IEmployeeService{

	void createEmployee(Employee e);
	List<Employee>getAllEmployees();
	Optional<Employee>getOneEmployee(Integer id);
	
}
