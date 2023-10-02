package com.codeclan.example.EmployeeTracker;

import com.codeclan.example.EmployeeTracker.models.Department;
import com.codeclan.example.EmployeeTracker.models.Employee;
import com.codeclan.example.EmployeeTracker.models.Project;
import com.codeclan.example.EmployeeTracker.repositories.DepartmentRepository;
import com.codeclan.example.EmployeeTracker.repositories.EmployeeRepository;
import com.codeclan.example.EmployeeTracker.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class EmployeeTrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void createEmployeeAndDepartment() {
		Department department = new Department("HR");
		Employee employee = new Employee("Sandy", 34, "456HG1", "sandy@shagsmail.com", department);
		departmentRepository.save(department);
		employeeRepository.save(employee);
	}

	@Test
	void canAddEmployeeToDept() {
		Department department = new Department("HR");
		Employee employee = new Employee("Sandy", 34, "456HG1", "sandy@shagsmail.com", department);
		departmentRepository.save(department);
		employeeRepository.save(employee);
		department.addEmployee(employee);
		System.out.println(department.getEmployees());
	}

	@Test
	void canAddEmployeeToProj() {
		Department department = new Department("HR");
		Project project = new Project("Ice Man", 100);
		Employee employee = new Employee("Sandy", 34, "456HG1", "sandy@shagsmail.com", department);
		departmentRepository.save(department);
		projectRepository.save(project);
		employeeRepository.save(employee);
		project.addEmployee(employee);
		employeeRepository.save(employee);
		projectRepository.save(project);
		System.out.println(project.getEmployees());
	}

}
