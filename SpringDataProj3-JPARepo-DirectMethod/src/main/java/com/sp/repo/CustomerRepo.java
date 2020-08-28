package com.sp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.sp.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{
}
