package com.emp_serv.emp_serv.repository;

import com.emp_serv.emp_serv.model.Employee;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	@Query("SELECT e FROM Employee e WHERE e.del = :delValue")
	public List<Employee> findbydelCustomQuery(@Param("delValue") int del);
	
	@Query("SELECT e FROM Employee e WHERE e.del = 0")
	public Page<Employee> findbydelCustomQuery1( Pageable pageable );
}

