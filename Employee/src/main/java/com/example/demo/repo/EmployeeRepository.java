package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Employee;
import com.example.demo.models.Project;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	@Query( "select u from Employee u inner join u.projects r where r.projectId = :id" )
	List<Employee> getAllEmployeesOfProject(Long id);

}
