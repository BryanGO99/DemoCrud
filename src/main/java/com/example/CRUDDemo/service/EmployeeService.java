package com.example.CRUDDemo.service;

import com.example.CRUDDemo.entity.Employee;
import com.example.CRUDDemo.repository.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private EmployeeRepo emp;

    public List<Employee> getAll(){
        List<Employee> employees = emp.findAll();
        return employees;
    }

    public Employee getById (Long id){
        Employee employee = emp.getById(id);
        return employee;
    }

    public void addEmployee (Employee e){
        emp.save(e);
    }

    public void deleteEmployee (Long id){
        emp.deleteById(id);

    }
}
