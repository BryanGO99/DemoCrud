package com.example.CRUDDemo.controller;

import com.example.CRUDDemo.entity.Employee;
import com.example.CRUDDemo.service.EmployeeService;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {
    private EmployeeService empService;

    @GetMapping("/")
    public String index (@ModelAttribute("employee") @NotNull Model model){
        List<Employee> listEmployees = empService.getAll();
        model.addAttribute("employeeList",listEmployees);
        return "index";

    }

    @GetMapping("/error")
    public String error (){
        return "error";
    }

    @PostMapping("/add")
    public String addEmployee(Employee emp){
       empService.addEmployee(emp);
       return "index";

    }


}
