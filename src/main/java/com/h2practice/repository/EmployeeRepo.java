package com.h2practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.h2practice.entities.Employee;

public interface
EmployeeRepo extends JpaRepository<Employee, Long> {

}
