package com.kasiCodes.employeeManagementSystem.service.serviceImplemetantation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kasiCodes.employeeManagementSystem.model.employee;
import com.kasiCodes.employeeManagementSystem.repository.employeeRepository;
import com.kasiCodes.employeeManagementSystem.service.employeeService;

public class employeeServiceImpl implements employeeService {

    @Autowired
    private employeeRepository employeeRepository;

    @Override
    public List<employee> getAllEmployees() {
        return employeeRepository.findAll();    
    }
    
}
