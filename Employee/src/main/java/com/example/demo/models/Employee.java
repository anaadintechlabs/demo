package com.example.demo.models;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * Employee Details 
 * @author paras.miglani
 *
 */
@Entity
@Table(name="EMPLOYEE")
@Data
public class Employee {

	@Id @GeneratedValue(strategy  = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="NAME")
	private String name;

	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="AGE")
	private String age;
	
	@JsonIgnore
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "emp_projects", joinColumns = @JoinColumn(name = "emp_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "project_id", referencedColumnName = "projectId"))
	private Set<Project> projects;

}
