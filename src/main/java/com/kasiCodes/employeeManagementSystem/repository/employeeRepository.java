package com.kasiCodes.employeeManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kasiCodes.employeeManagementSystem.model.employee;

@Repository
public interface employeeRepository extends JpaRepository<employee, Long> {
    
}
