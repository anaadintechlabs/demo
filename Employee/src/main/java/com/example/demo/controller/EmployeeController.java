package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Employee;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.ProjectService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@Autowired
	private ProjectService projectService;
	
	@GetMapping("/getallEmployees")
	public ResponseEntity<Employee> getallEmployee(){
		
		return new ResponseEntity(empService.getallEmployee(), HttpStatus.OK);
	}
	
	@GetMapping("/getallProjectsOfEmp")
	public ResponseEntity getallProjectsofEmp(@RequestParam Long id){
		return new ResponseEntity(projectService.getAllProjectsofEmp(id), HttpStatus.OK);
	}
	
	@GetMapping("/getallProjects")
	public ResponseEntity getallProjects(){
		
		return new ResponseEntity(projectService.getAllProjects(), HttpStatus.OK);
	}
}
