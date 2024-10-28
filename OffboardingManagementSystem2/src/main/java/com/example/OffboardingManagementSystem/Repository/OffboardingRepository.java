package com.example.OffboardingManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OffboardingManagementSystem.model.Offboarding;

@Repository
public interface OffboardingRepository extends JpaRepository<Offboarding, Long> {
}