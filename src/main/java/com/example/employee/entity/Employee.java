package com.example.employee.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    private int id;

    private String name;

    private int age;

    private String gender;

    private int companyId;

    private int salary;

    public Employee(){}
    public Employee(String name, int age, String gender, int salary, int id,int companyId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.companyId = companyId;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getCompanyId() {
        return companyId;
    }

    public int getSalary() {
        return salary;
    }
}
