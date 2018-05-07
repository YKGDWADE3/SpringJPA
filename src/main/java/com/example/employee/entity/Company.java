package com.example.employee.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {
    @Id
    private int id;

    private String companyId;

    private int employeesNumber;

    public Company(){}
    public Company(int id, String companyId, int employeesNumber) {
        this.id = id;
        this.companyId = companyId;
        this.employeesNumber = employeesNumber;
    }

    public int getId() {
        return id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public int getEmployeesNumber() {
        return employeesNumber;
    }
}
