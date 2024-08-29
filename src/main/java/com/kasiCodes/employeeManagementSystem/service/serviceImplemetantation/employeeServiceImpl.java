package com.kasiCodes.employeeManagementSystem.service.serviceImplemetantation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kasiCodes.employeeManagementSystem.model.employee;
import com.kasiCodes.employeeManagementSystem.repository.employeeRepository;
import com.kasiCodes.employeeManagementSystem.service.employeeService;

@Service
public class employeeServiceImpl implements employeeService {

    @Autowired
    private employeeRepository employeeRepository;

    @Override
    public List<employee> getAllEmployees() {
        return employeeRepository.findAll();    
    }

    @Override
    public employee getEmployeeById(long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public employee addEmployee(employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public employee saveEmployee(employee employee) {
        return employeeRepository.save(employee);
    }
    
}
