package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Employee;
import com.example.demo.models.Project;
import com.example.demo.repo.EmployeeRepository;
import com.example.demo.repo.ProjectRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository empRepo;
	
	@Autowired
	private ProjectRepository projectRepo;
	
	@Override
	public List<Employee> getallEmployee() {
		return empRepo.findAll();
	}

}
