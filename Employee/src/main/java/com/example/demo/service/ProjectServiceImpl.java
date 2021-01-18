package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Project;
import com.example.demo.repo.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	private ProjectRepository projectRepo;
	
	@Override
	public List<Project> getAllProjects() {
		return projectRepo.findAll();
	}

	@Override
	public List<Project> getAllProjectsofEmp(Long id) {
		return projectRepo.getAllProjectsofEmp(id);
	}
}
