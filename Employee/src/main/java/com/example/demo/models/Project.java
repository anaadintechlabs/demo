package com.example.demo.models;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * Project Info
 * @author paras.miglani
 *
 */

@Entity
@Table(name="PROJECT")
@Data
public class Project {

	@Id @GeneratedValue(strategy  = GenerationType.IDENTITY)
	private Long projectId;
	
	private String  projectName;
	
	@ManyToMany(mappedBy = "projects", fetch = FetchType.LAZY)
    private List<Employee> employees;
}
