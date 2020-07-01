package com.springmongo.spmongodemo.controller;

import com.springmongo.spmongodemo.model.Employee;
import com.springmongo.spmongodemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping(value="/save")
    public String saveData(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Employee saved";
    }

    @GetMapping(value="/getallemp")
    public List<Employee> getList(){
        return employeeRepository.findAll();
    }

    @GetMapping(value="/getemp/{id}")
    public Optional<Employee> getList(@PathVariable String id){
        return employeeRepository.findById(id);
    }
}
