package com.example.employee.entity;

import javax.persistence.*;

@Entity
@Table(name = "Company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int employeesNumber;

    private String companyName;

    public Company(){}
    public Company(int id, int employeesNumber) {
        this.id = id;
        this.employeesNumber = employeesNumber;
    }

    public int getId() {
        return id;
    }

    public int getEmployeesNumber() {
        return employeesNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
