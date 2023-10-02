package com.rest.herokuwithh2.restApi;

import com.rest.herokuwithh2.entity.Employee;
import com.rest.herokuwithh2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeREST {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseEntity<String> insertEmployee(@RequestBody Employee employee){
        String msg = employeeService.upsertEmployee(employee);

        return new ResponseEntity<>(msg, HttpStatus.CREATED);
    }

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> allEmployee = employeeService.getAllEmployee();

        return new ResponseEntity<>(allEmployee, HttpStatus.OK);

    }

    @PutMapping("/employee")
    public ResponseEntity<String> updateEmployees(@RequestBody Employee employee){
        String msg = employeeService.upsertEmployee(employee);

        return  new ResponseEntity<>(msg, HttpStatus.OK);
    }

    @DeleteMapping("/employee/{empId}")
    public ResponseEntity<String> deleteEmployeeWithId(@PathVariable Integer empId){
        String msg = employeeService.deleteEmployee(empId);

        return  new ResponseEntity<>(msg, HttpStatus.OK);
    }

}
