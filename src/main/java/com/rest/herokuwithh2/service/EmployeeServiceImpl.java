package com.rest.herokuwithh2.service;

import com.rest.herokuwithh2.entity.Employee;
import com.rest.herokuwithh2.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public String upsertEmployee(Employee employee) {
        Integer empId = employee.getEmpId();
        employeeRepository.save(employee);

        if(empId == null){
            return "Employee is Inserted...";
        }
        return "Employee is Updated...";
    }

    @Override
    public String deleteEmployee(Integer empId) {
        employeeRepository.deleteById(empId);

        return "Employee with id: "+ empId + " is Deleted...";
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
}
