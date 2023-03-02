package com.example.springmvcexample2.mapper;

import com.example.springmvcexample2.dto.EmployeeDto;
import com.example.springmvcexample2.entity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    EmployeeDto employeeToDto(Employee employee);

    Employee dtoToEmployee(EmployeeDto employeeDto);
}
