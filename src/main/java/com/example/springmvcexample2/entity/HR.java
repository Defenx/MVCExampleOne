package com.example.springmvcexample2.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("hr")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Setter
@Getter
@ToString(callSuper = true)
public class HR extends Employee {

}
