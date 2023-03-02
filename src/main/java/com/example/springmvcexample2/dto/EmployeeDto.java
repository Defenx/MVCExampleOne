package com.example.springmvcexample2.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeDto {

    String fullname;
    BigDecimal salary;
}
