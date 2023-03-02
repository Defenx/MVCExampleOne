package com.example.springmvcexample2.repository;

import com.example.springmvcexample2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
