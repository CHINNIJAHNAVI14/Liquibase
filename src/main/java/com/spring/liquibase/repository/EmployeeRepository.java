package com.spring.liquibase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.liquibase.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
	

}
