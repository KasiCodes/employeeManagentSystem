package com.kasiCodes.employeeManagementSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kasiCodes.employeeManagementSystem.model.employee;

@Service
public interface employeeService {

    public void saveEmployee(employee employee);

    public List<employee> getAllEmployees();
    
    public employee getEmployeeById(long id);

    public employee addEmployee(employee employee);
    
}
