package com.example.OffboardingManagementSystem.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.OffboardingManagementSystem.EmployeeService.EmployeeService;
import com.example.OffboardingManagementSystem.EmployeeService.OffboardingService;
import com.example.OffboardingManagementSystem.model.Employee;

@Controller
@RequestMapping("/offboarding")
public class OffboardingController {
    @Autowired
    private OffboardingService offboardingService;
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/initiate/{employeeId}")
    public String initiateOffboarding(@PathVariable Long employeeId, Model model) {
        Optional<Employee> employee = employeeService.getEmployeeById(employeeId);
        if (employee.isPresent()) {
            offboardingService.initiateOffboarding(employee.get());
            return "redirect:/offboarding";
        }
        return "error";
    }
}
