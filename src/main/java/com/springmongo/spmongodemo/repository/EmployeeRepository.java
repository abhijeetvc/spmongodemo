package com.springmongo.spmongodemo.repository;

import com.springmongo.spmongodemo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository  extends MongoRepository<Employee,String> {
}
