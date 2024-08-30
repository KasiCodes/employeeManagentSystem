package com.kasiCodes.employeeManagementSystem.service.serviceImplemetantation;

import java.util.List;
import java.util.Optional;

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
        Optional<employee> optional = employeeRepository.findById(id);
        employee employee1 = null;
        if(optional.isPresent()){
            employee1 = optional.get();
        }else{
            throw new RuntimeException("Employee not found for id :: " + id);
        }
        return employee1;
        
    }

    @Override
    public employee addEmployee(employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void saveEmployee(employee employee) {
        this.employeeRepository.save(employee);
    }
    
}
