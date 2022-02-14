package com.example.CRUDDemo.repository;

import com.example.CRUDDemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
