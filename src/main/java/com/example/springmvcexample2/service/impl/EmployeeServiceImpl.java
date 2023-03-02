package com.example.springmvcexample2.service.impl;

import com.example.springmvcexample2.dto.EmployeeDto;
import com.example.springmvcexample2.mapper.EmployeeMapper;
import com.example.springmvcexample2.repository.EmployeeRepository;
import com.example.springmvcexample2.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    @Override
    public List<EmployeeDto> findAll() {
        var employees = employeeRepository.findAll();

        return employees.stream().map(employeeMapper::employeeToDto).toList();
    }

    @Override
    public EmployeeDto findById(Long id) {
        var employee = employeeRepository.findById(id).orElseThrow();

        return employeeMapper.employeeToDto(employee);
    }

    @Override
    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public EmployeeDto save(EmployeeDto employee) {
        var employeeForSave = employeeMapper.dtoToEmployee(employee);

        employeeRepository.save(employeeForSave);

        return employee;
    }
}
