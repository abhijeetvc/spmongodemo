package com.springmongo.spmongodemo.repository;

import com.springmongo.spmongodemo.model.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepository extends MongoRepository<Department,String> {
}
