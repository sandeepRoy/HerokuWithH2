package com.rest.herokuwithh2.repository;

import com.rest.herokuwithh2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
