package com.example.springmvcexample2.controller;

import com.example.springmvcexample2.dto.EmployeeDto;
import com.example.springmvcexample2.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping("/{id}")
    public EmployeeDto findEmployeeById(@PathVariable Long id) {
        return employeeService.findById(id);
    }

    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto) {
        var employee = employeeService.save(employeeDto);
        return ResponseEntity.status(CREATED).body(new EmployeeDto());
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteEmployeeById(@RequestParam("id") Long id) {
        employeeService.deleteById(id);
        return ResponseEntity.status(OK).build();
    }

}
