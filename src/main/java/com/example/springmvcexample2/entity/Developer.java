package com.example.springmvcexample2.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("dev")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Setter
@Getter
@ToString(callSuper = true)
public class Developer extends Employee {
    UUID secretToken;
}
