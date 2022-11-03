package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.employee;

@Repository
public interface emp_repository extends JpaRepository<employee, Long>{

}

