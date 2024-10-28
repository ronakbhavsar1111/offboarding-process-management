package com.example.OffboardingManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OffboardingManagementSystem.model.Asset;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Long> {
}