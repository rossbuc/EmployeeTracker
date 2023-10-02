package com.codeclan.example.EmployeeTracker.repositories;

import com.codeclan.example.EmployeeTracker.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
