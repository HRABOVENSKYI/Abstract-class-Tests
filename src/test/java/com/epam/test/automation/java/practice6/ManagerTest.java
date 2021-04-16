package com.epam.test.automation.java.practice6;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class ManagerTest {

    private static Employee manager1 = new Manager("Ivan", new BigDecimal("8300"), 100);
    private static Employee manager2 = new Manager("Ivan", new BigDecimal("8300"), 101);
    private static Employee manager3 = new Manager("Ivan", new BigDecimal("8300"), 150);
    private static Employee manager4 = new Manager("Ivan", new BigDecimal("8300"), 151);

    @Test
    public void testSetBonus() {
        manager1.setBonus(new BigDecimal("100"));
        Assert.assertEquals(manager1.getBonus(), new BigDecimal("100"));
        Assert.assertEquals(manager1.toPay(), new BigDecimal("8400"));

        manager2.setBonus(new BigDecimal("100"));
        Assert.assertEquals(manager2.getBonus(), new BigDecimal("600"));
        Assert.assertEquals(manager2.toPay(), new BigDecimal("8900"));

        manager3.setBonus(new BigDecimal("100"));
        Assert.assertEquals(manager3.getBonus(), new BigDecimal("600"));
        Assert.assertEquals(manager3.toPay(), new BigDecimal("8900"));

        manager4.setBonus(new BigDecimal("100"));
        Assert.assertEquals(manager4.getBonus(), new BigDecimal("1100"));
        Assert.assertEquals(manager4.toPay(), new BigDecimal("9400"));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public static void testMultiArithmeticElementsExceptionWithNull() {
        manager1.setBonus(null);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public static void testMultiArithmeticElementsExceptionWithNegativeValue() {
        manager1.setBonus(new BigDecimal("-1"));
    }
}
