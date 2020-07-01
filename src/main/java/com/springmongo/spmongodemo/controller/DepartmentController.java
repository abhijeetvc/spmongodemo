package com.springmongo.spmongodemo.controller;

import com.springmongo.spmongodemo.model.Department;
import com.springmongo.spmongodemo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentRepository departmentRepository;
    @PostMapping(value="/savedept")
    public String addDepartment(@RequestBody Department department){
        departmentRepository.save(department);
        return "Dept saved";
    }
}
