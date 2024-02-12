package com.psl.employee.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.psl.employee.entity.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {	
}
