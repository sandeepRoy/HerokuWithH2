package com.rest.herokuwithh2.entity;

import jakarta.persistence.*;
import lombok.Data;


/*
http://localhost:8080/h2-console  for H2 console
http://localhost:8080/swagger-ui/index.html ---> for swagger


 */
@Data
@Entity
@Table(name = "Employee_Table")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Emp_Id")
    private Integer empId;

    @Column(name = "Emp_Name")
    private String empName;

    @Column(name = "Emp_Phone")
    private Long empPhoneNumber;

    @Column(name = "Age")
    private Integer age;

    @Column(name = "Company_Name")
    private String empCompanyName;
}
