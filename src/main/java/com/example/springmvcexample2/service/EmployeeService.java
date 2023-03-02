package com.example.springmvcexample2.service;

import com.example.springmvcexample2.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    List<EmployeeDto> findAll();
    EmployeeDto findById(Long id);

    void deleteById(Long id);

    EmployeeDto save(EmployeeDto employee);
}
