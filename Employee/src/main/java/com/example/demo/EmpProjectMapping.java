package com.example.demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.example.demo.models.Employee;
import com.example.demo.models.Project;

@Embeddable
public class EmpProjectMapping implements Serializable {

	@Column(name="emp_id")
	private Employee id;

	@Column(name="project_id")
	private Project projectId;
}
