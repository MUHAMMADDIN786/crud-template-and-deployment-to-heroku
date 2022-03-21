package com.din.demo.controller;

import com.din.demo.model.Employee;
import com.din.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AppController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping("/")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}
