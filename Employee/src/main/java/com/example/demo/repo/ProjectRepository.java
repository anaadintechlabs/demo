package com.example.demo.repo;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{

	@Query( "select u from Project u inner join u.employees r where r.id in :id" )
	List<Project> getAllProjectsofEmp(@Param("id")Long emp_id);

}
