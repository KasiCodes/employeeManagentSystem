package com.kasiCodes.employeeManagementSystem.controller;

import com.kasiCodes.employeeManagementSystem.service.employeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class emplyeeController {
    @Autowired
    private employeeService employeeService;

    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listEmployee", employeeService.getAllEmployees());

        return "index";

    }


    
}
