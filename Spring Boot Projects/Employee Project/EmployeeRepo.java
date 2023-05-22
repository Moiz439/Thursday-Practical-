package com.example.employee.Repo;

import org.springframework.data.repository.CrudRepository;

import com.example.employee.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee,Integer>{

}
