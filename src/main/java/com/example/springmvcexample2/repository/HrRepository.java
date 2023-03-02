package com.example.springmvcexample2.repository;

import com.example.springmvcexample2.entity.HR;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HrRepository extends JpaRepository<HR, Long> {
}
