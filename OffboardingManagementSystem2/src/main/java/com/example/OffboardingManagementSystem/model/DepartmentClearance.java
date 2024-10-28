package com.example.OffboardingManagementSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DepartmentClearance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String departmentName;
    private boolean cleared;

    @ManyToOne
    @JoinColumn(name = "offboarding_id")
    private Offboarding offboarding;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public boolean isCleared() {
		return cleared;
	}

	public void setCleared(boolean cleared) {
		this.cleared = cleared;
	}

	public Offboarding getOffboarding() {
		return offboarding;
	}

	public void setOffboarding(Offboarding offboarding) {
		this.offboarding = offboarding;
	}

	public DepartmentClearance(Long id, String departmentName, boolean cleared, Offboarding offboarding) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.cleared = cleared;
		this.offboarding = offboarding;
	}

    
}

