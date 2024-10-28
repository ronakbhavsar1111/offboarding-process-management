package com.example.OffboardingManagementSystem.EmployeeService;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OffboardingManagementSystem.Repository.OffboardingRepository;
import com.example.OffboardingManagementSystem.model.Employee;
import com.example.OffboardingManagementSystem.model.Offboarding;

@Service
public class OffboardingService {
    @Autowired
    private OffboardingRepository offboardingRepository;
    
    public Offboarding initiateOffboarding(Employee employee) {
        Offboarding offboarding = new Offboarding();
        offboarding.setEmployee(employee);
        offboarding.setExitInterviewDate(LocalDateTime.now().plusDays(7));
        return offboardingRepository.save(offboarding);
    }
}
