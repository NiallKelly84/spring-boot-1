package com.verge.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
@PrimaryKeyJoinColumn(name = "employee_id", referencedColumnName = "id")
public class Employee extends Person {

    @Column(name = "employee_number")
    private Long employeeNumber;

    @Column(name = "salary")
    private Long salary;

    public Employee(String firstName, String surname, Long employeeNumber, Long salary) {
        super(firstName, surname);
        this.employeeNumber = employeeNumber;
        this.salary = salary;
    }

    public Employee(Long employeeNumber, Long salary) {
        this.employeeNumber = employeeNumber;
        this.salary = salary;
    }

    public Long getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Long employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
