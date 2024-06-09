package com.fidan.springboot.cruddemoProject.dao;

import com.fidan.springboot.cruddemoProject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // that's it ... no need to write any code
}
