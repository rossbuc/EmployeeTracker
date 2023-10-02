package com.codeclan.example.EmployeeTracker.repositories;

import com.codeclan.example.EmployeeTracker.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
