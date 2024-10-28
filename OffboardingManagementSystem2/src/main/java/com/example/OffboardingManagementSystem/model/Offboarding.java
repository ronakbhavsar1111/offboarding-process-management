package com.example.OffboardingManagementSystem.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Offboarding {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    private LocalDateTime exitInterviewDate;
    private boolean finalSettlementComplete;

    @OneToMany(mappedBy = "offboarding", cascade = CascadeType.ALL)
    private List<DepartmentClearance> departmentClearances = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public LocalDateTime getExitInterviewDate() {
		return exitInterviewDate;
	}

	public void setExitInterviewDate(LocalDateTime exitInterviewDate) {
		this.exitInterviewDate = exitInterviewDate;
	}

	public boolean isFinalSettlementComplete() {
		return finalSettlementComplete;
	}

	public void setFinalSettlementComplete(boolean finalSettlementComplete) {
		this.finalSettlementComplete = finalSettlementComplete;
	}

	public List<DepartmentClearance> getDepartmentClearances() {
		return departmentClearances;
	}

	public void setDepartmentClearances(List<DepartmentClearance> departmentClearances) {
		this.departmentClearances = departmentClearances;
	}

	public Offboarding() {
		super();
		this.id = id;
		this.employee = employee;
		this.exitInterviewDate = exitInterviewDate;
		this.finalSettlementComplete = finalSettlementComplete;
		this.departmentClearances = departmentClearances;
	}

    
}
