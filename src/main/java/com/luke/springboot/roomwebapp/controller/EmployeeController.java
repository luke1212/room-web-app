package com.luke.springboot.roomwebapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luke.springboot.roomwebapp.models.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private static final List<Employee> employees = new ArrayList<>();
    static {
        employees.add(new Employee(1, "Luke", "Skywalker", "Jedi"));
        employees.add(new Employee(2, "Han", "Solo", "Smuggler"));
        employees.add(new Employee(3, "Leia", "Organa", "Princess"));
        employees.add(new Employee(4, "Chewbacca", "Wookiee", "Co-pilot"));
    }

    @GetMapping
    public String getAllEmployees(Model model) {
        model.addAttribute("employees", employees);
        return "employees";
    }
}
