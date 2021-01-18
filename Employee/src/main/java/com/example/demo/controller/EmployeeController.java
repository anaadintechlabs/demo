package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Employee;
import com.example.demo.models.Project;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.ProjectService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@Autowired
	private ProjectService projectService;
	
	@GetMapping("/getAllEmployees")
	public ResponseEntity<Employee> getAllEmployees(){
		
		return new ResponseEntity(empService.getAllEmployee(), HttpStatus.OK);
	}
	
	@GetMapping("/getAllProjectsOfEmp")
	public ResponseEntity<Project> getAllProjectsOfEmp(@RequestParam Long id){
		return new ResponseEntity(projectService.getAllProjectsofEmp(id), HttpStatus.OK);
	}
	
	@GetMapping("/getAllProjects")
	public ResponseEntity<Project> getAllProjects(){
		return new ResponseEntity(projectService.getAllProjects(), HttpStatus.OK);
	}
	
	
	@GetMapping("/getAllEmployeesOfProject")
	public ResponseEntity<Employee> getAllEmployeesOfProject(@RequestParam Long id){
		
		return new ResponseEntity(empService.getAllEmployeesOfProject(id), HttpStatus.OK);
	}
}
