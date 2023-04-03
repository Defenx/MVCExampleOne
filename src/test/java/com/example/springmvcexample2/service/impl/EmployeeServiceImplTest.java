package com.example.springmvcexample2.service.impl;

import com.example.springmvcexample2.entity.Employee;
import com.example.springmvcexample2.mapper.EmployeeMapper;
import com.example.springmvcexample2.repository.EmployeeRepository;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@SpringJUnitConfig(MockitoExtension.class)
class EmployeeServiceImplTest {

    @Mock
    EmployeeRepository employeeRepository;

    @Mock
    EmployeeMapper employeeMapper = Mappers.getMapper(EmployeeMapper.class);

    @InjectMocks
    EmployeeServiceImpl employeeService;

    @Test
    void whenWeGetExistedEmployeeAllFinishSuccess() {

        //given
        Employee employee = buildEmployee();
        //when
        when(employeeRepository.findById(1L)).thenReturn(Optional.of(employee));
        //then
        assertEquals(employeeMapper.employeeToDto(employee), employeeService.findById(1L));
    }

    @Test
    void whenWeGetNotExistedEmployeeThenThrowEntityNotFoundException() {
        //when
        when(employeeRepository.findById(1L)).thenReturn(Optional.empty());
        //then
        assertThrows(EntityNotFoundException.class, () -> employeeService.findById(1L));
    }

    private Employee buildEmployee() {
        return Employee.builder().
                id(1L).
                fullname("Valera")
                .salary(BigDecimal.ONE).build();
    }

}