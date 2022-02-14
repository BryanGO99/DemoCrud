package com.example.CRUDDemo.service;

import com.example.CRUDDemo.entity.Employee;
import com.example.CRUDDemo.repository.EmployeeRepo;

import java.util.List;

public class EmployeeService {
    private EmployeeRepo emp;

    public List<Employee> getAll(){
        List<Employee> employees = emp.findAll();
        return employees;
    }

    public Employee getById (int id){
        Employee employee = emp.getById(id);
        return employee;
    }

    public void addEmployee (Employee e){
        emp.save(e);
    }

    public void deleteEmployee (int id){
        emp.deleteById(id);

    }
}
