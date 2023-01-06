package com.h2practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.h2practice.entities.Employee;
import com.h2practice.repository.EmployeeRepo;

@RestController
@RequestMapping("api/")
public class EmployeeController {
	
	
	@Autowired
	private EmployeeRepo empRepo;
	
	
	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee) {
		return empRepo.save(employee);
		
	}
	
	@GetMapping("/emp")
	public List<Employee> getAllEmployees(){
		return empRepo.findAll();
	}
	
	

}
