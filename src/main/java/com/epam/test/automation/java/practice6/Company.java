package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public class Company {

    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    public void giveEverybodyBonus(BigDecimal companyBonus) {
        for (Employee employee : employees)
            employee.setBonus(companyBonus);
    }

    public BigDecimal totalToPay() {
        BigDecimal totalToPay = new BigDecimal("0");
        for (Employee employee : employees)
            totalToPay = totalToPay.add(employee.toPay());
        return totalToPay;
    }

    public String nameMaxSalary() {
        Employee employeeWithMaxToPay = employees[0];
        for (Employee employee : employees)
            if (employee.toPay().doubleValue() > employeeWithMaxToPay.toPay().doubleValue())
                employeeWithMaxToPay = employee;
        return employeeWithMaxToPay.getName();
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
}
