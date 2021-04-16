package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public class SalesPerson extends Employee {
    private int percent;

    public SalesPerson(String name, BigDecimal salary, int percent) {
        super(name, salary);
        this.percent = percent;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (bonus == null || bonus.doubleValue() < 0)
            throw new IllegalArgumentException();
        if (percent <= 100) {
            this.setBonusValue(bonus);
        } else if (percent > 100 && percent <= 200)
            this.setBonusValue(bonus.multiply(new BigDecimal("2")));
        else if (percent > 200)
            this.setBonusValue(bonus.multiply(new BigDecimal("3")));
    }
}
