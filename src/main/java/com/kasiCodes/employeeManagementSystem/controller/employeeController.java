package com.kasiCodes.employeeManagementSystem.controller;

import com.kasiCodes.employeeManagementSystem.model.employee;
import com.kasiCodes.employeeManagementSystem.service.employeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class employeeController {
    @Autowired
    private employeeService employeeService;

    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listEmployee", employeeService.getAllEmployees());

        return "index";

    }
    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model){
        employee employee = new employee();
        model.addAttribute("employee", employee);

        return "new_employee";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") employee employee){
        employeeService.saveEmployee(employee);

        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable (value = "id") long id, Model model){
        
        employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee", employee);

        return "update_employee";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable (value = "id") long id){
        
        this.employeeService.deleteEmployeeById(id);
        return "redirect:/";
    }
}
