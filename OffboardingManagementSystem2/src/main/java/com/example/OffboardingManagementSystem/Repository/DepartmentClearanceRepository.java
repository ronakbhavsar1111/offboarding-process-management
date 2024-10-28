package com.example.OffboardingManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OffboardingManagementSystem.model.DepartmentClearance;

@Repository
public interface DepartmentClearanceRepository extends JpaRepository<DepartmentClearance, Long> {
}