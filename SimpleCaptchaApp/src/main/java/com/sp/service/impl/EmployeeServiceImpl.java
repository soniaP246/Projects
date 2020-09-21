package com.sp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.model.Employee;
import com.sp.repo.EmployeeRepo;
import com.sp.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepo repo;
	
	@Override
	public void createEmployee(Employee e) {
      repo.save(e);		
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	@Override
	public Optional<Employee> getOneEmployee(Integer id) {
		return repo.findById(id);
	}

	

}
