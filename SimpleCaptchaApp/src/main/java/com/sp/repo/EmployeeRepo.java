package com.sp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sp.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
