package com.ekm.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ekm.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	 public List<Employee> findByName(String name);
}
