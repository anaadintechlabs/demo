package com.example.demo.service;

import java.util.List;

import org.springframework.util.MultiValueMap;

import com.example.demo.models.Project;

public interface ProjectService {

	List<Project> getAllProjects();

	List<Project> getAllProjectsofEmp(Long id);
}
