package com.kasiCodes.employeeManagementSystem.controller;

import com.kasiCodes.employeeManagementSystem.model.employee;
import com.kasiCodes.employeeManagementSystem.service.employeeService;

import jakarta.servlet.http.HttpSession;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class employeeController {
    @Autowired
    private employeeService employeeService;

    
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/login";
    }

    @GetMapping("/viewHomePage")
    public String viewHomePage(Model model){
        return findPaginated(1,"firstName", "asc", model);

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

        return "redirect:/viewHomePage";
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
        return "redirect:/viewHomePage";
    }
    @GetMapping("/page/{pageNo}")
    public String findPaginated(@PathVariable  (value = "pageNo")int pageNo ,
        @RequestParam("sortField") String sortField, @RequestParam("sortDir") String sortDir, Model model){
        int pageSize = 5;
        Page<employee> page = employeeService.findPaginated(pageNo, pageSize , "id" , "asc");
        List<employee> listEmployees = page.getContent();
        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());
        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDir", sortDir);
        model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
        model.addAttribute("listEmployees", listEmployees);
        return "index";

    }
}
