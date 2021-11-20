package com.ekm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ekm.model.Employee;
import com.ekm.repository.EmployeeRepository;

@Controller
public class EmployeeController {
	@Autowired
    EmployeeRepository repository;

	@RequestMapping("/addStudent")
	public String home(@RequestParam("id") String id, @RequestParam("name") String name) {
		try {
			try {
				System.out.println(id+ "::"+name);
				Employee employee = new Employee();
				employee.setId(Integer.parseInt(id));
				employee.setName(name);
				employee.setType("contract");
				employee.setSalary(1000);
				repository.save(employee);
				Iterable<Employee> iterator = repository.findAll();
				System.out.println("All Employee items: "); iterator.forEach(item ->
				System.out.println(item));
				/*
				 * repository.save(new Employee("emp1", 5)); repository.save(new
				 * Employee("emp2", 2));
				 * 
				 * Iterable<Employee> iterator = repository.findAll();
				 * 
				 * System.out.println("All Employee items: "); iterator.forEach(item ->
				 * System.out.println(item));
				 * 
				 * List<Employee> name = repository.findByName("emp1"); name.forEach(item ->
				 * System.out.println(item));
				 */
		     
	        } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("test");	
			return "home1";
		} catch (Exception e) {
			e.printStackTrace();
			return "home1";
		}
		
	}
}
