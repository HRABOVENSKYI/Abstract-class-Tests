package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public abstract class Employee {
    private String name;
    private BigDecimal salary;
    private BigDecimal bonus;

    public Employee(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public abstract void setBonus(BigDecimal bonus);

    public void setBonusValue(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public BigDecimal toPay() {
        return salary.add(bonus);
    }
}
