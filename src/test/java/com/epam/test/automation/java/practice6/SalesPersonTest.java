package com.epam.test.automation.java.practice6;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class SalesPersonTest {

    private static Employee salesPerson1 = new SalesPerson("Ivan", new BigDecimal("8300"), 100);
    private static Employee salesPerson2 = new SalesPerson("Ivan", new BigDecimal("8300"), 101);
    private static Employee salesPerson3 = new SalesPerson("Ivan", new BigDecimal("8300"), 200);
    private static Employee salesPerson4 = new SalesPerson("Ivan", new BigDecimal("8300"), 201);

    @Test
    public void testSetBonus() {
        salesPerson1.setBonus(new BigDecimal("100"));
        Assert.assertEquals(salesPerson1.getBonus(), new BigDecimal("100"));
        Assert.assertEquals(salesPerson1.toPay(), new BigDecimal("8400"));

        salesPerson2.setBonus(new BigDecimal("100"));
        Assert.assertEquals(salesPerson2.getBonus(), new BigDecimal("200"));
        Assert.assertEquals(salesPerson2.toPay(), new BigDecimal("8500"));

        salesPerson3.setBonus(new BigDecimal("100"));
        Assert.assertEquals(salesPerson3.getBonus(), new BigDecimal("200"));
        Assert.assertEquals(salesPerson3.toPay(), new BigDecimal("8500"));

        salesPerson4.setBonus(new BigDecimal("100"));
        Assert.assertEquals(salesPerson4.getBonus(), new BigDecimal("300"));
        Assert.assertEquals(salesPerson4.toPay(), new BigDecimal("8600"));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public static void testMultiArithmeticElementsExceptionWithNull() {
        salesPerson1.setBonus(null);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public static void testMultiArithmeticElementsExceptionWithNegativeValue() {
        salesPerson1.setBonus(new BigDecimal("-1"));
    }
}
