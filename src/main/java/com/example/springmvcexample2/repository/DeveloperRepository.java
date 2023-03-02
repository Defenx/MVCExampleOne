package com.example.springmvcexample2.repository;

import com.example.springmvcexample2.entity.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {
}
