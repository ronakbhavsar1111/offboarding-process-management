package com.example.OffboardingManagementSystem.EmployeeService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OffboardingManagementSystem.Repository.EmployeeRepository;
import com.example.OffboardingManagementSystem.model.Employee;

@Service
public class EmployeeService {
    @Autowired
    
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    // Additional methods for employee retrieval and updates
}
