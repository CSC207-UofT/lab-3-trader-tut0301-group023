/*
 * This file contains sample JUnit test cases for Truck.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class TruckTest {
    Truck t;

    @Before
    public void setUp() throws Exception {
        t = new Truck();
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(30000, t.getPrice());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(100, t.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        t.upgradeSpeed();
        assertEquals(101, t.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        t.downgradeSpeed();
        assertEquals(99, t.getMaxSpeed());
    }

}