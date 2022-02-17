package com.example.CRUDDemo.controller;

import com.example.CRUDDemo.domain.Employee;
import com.example.CRUDDemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService empService;

    @GetMapping("/get")
    public String index (@ModelAttribute("Employee") Model model){
        List<Employee> listEmployees = empService.getAll();
        model.addAttribute("employeeList",listEmployees);
        return "index";

    }

    @GetMapping("/error")
    public String error (){
        return "error";
    }

    @GetMapping("/new")
    public String form (){
        return "form";
    }

    @PostMapping("/add")
    public String addEmployee(Employee emp){
       empService.addEmployee(emp);
       return "index";

    }





    @PostMapping("/save")
    public String saveEmployee(Employee emp){
        empService.addEmployee(emp);
        System.out.println("Si se guardo");
        return "index";

    }


    @GetMapping("/getById/{id}")
    public Employee getById(int id) {
        Employee e = empService.getById(id);

        return e;

    }


}
