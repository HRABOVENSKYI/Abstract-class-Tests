package com.epam.test.automation.java.practice6;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class CompanyTest {

    private static final Employee[] employees = {
            new Manager("Oleg", new BigDecimal("8300"), 100),
            new Manager("Ivan", new BigDecimal("9300"), 101),
            new Manager("Peter", new BigDecimal("8350"), 150),
            new Manager("Taras", new BigDecimal("11300"), 151),
            new SalesPerson("Max", new BigDecimal("5600"), 100),
            new SalesPerson("Teodor", new BigDecimal("26300"), 101),
            new SalesPerson("Mark", new BigDecimal("10300"), 200),
            new SalesPerson("Arsen", new BigDecimal("10500"), 201),
    };

    private static final Company company = new Company(employees);

    @Test
    public void testGiveEverybodyBonus() {
        company.giveEverybodyBonus(new BigDecimal("100"));
        Assert.assertEquals(company.getEmployees()[0].toPay(), new BigDecimal("8400"));
        Assert.assertEquals(company.getEmployees()[1].toPay(), new BigDecimal("9900"));
        Assert.assertEquals(company.getEmployees()[2].toPay(), new BigDecimal("8950"));
        Assert.assertEquals(company.getEmployees()[3].toPay(), new BigDecimal("12400"));
        Assert.assertEquals(company.getEmployees()[4].toPay(), new BigDecimal("5700"));
        Assert.assertEquals(company.getEmployees()[5].toPay(), new BigDecimal("26500"));
        Assert.assertEquals(company.getEmployees()[6].toPay(), new BigDecimal("10500"));
        Assert.assertEquals(company.getEmployees()[7].toPay(), new BigDecimal("10800"));
    }

    @Test
    public void testTotalToPay() {
        Assert.assertEquals(company.totalToPay(), new BigDecimal("93150"));
    }

    @Test
    public void testNameMaxSalary() {
        Assert.assertEquals(company.nameMaxSalary(), "Teodor");
    }
}