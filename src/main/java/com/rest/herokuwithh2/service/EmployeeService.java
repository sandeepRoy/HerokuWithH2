package com.rest.herokuwithh2.service;

import com.rest.herokuwithh2.entity.Employee;
import java.util.List;

public interface EmployeeService {
    public String upsertEmployee(Employee employee);
    public String deleteEmployee(Integer empId);
    public List<Employee> getAllEmployee();
}
