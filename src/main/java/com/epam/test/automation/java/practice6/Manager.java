package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public class Manager extends Employee {
    private int quantity;

    public Manager(String name, BigDecimal salary, int clientAmount) {
        super(name, salary);
        this.quantity = clientAmount;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (bonus == null || bonus.doubleValue() < 0)
            throw new IllegalArgumentException();
        if (quantity <= 100) {
            this.setBonusValue(bonus);
        } else if (quantity > 100 && quantity <= 150) {
            this.setBonusValue(bonus.add(new BigDecimal("500")));
        } else if (quantity > 150) {
            this.setBonusValue(bonus.add(new BigDecimal("1000")));
            this.setBonusValue(bonus.add(new BigDecimal("1000")));
        }
    }

    // we can override abstract superclass method, and compiler will call our overridden method
    // super.getBonus() - calls getter from abstract superclass
    // commented it out because tests fall, but actually it works
//    @Override
//    public BigDecimal getBonus() {
//        return super.getBonus().add(new BigDecimal("1000"));
//    }
}
