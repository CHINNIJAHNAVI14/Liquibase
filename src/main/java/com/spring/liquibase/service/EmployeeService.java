package com.spring.liquibase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.liquibase.entity.Employee;
import com.spring.liquibase.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees() 
	{
	        return employeeRepository.findAll();
	}

	public Employee saveEmployee(Employee employee)
	{
	        return employeeRepository.save(employee);
	}

}
