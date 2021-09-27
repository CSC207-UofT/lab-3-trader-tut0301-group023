/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class HorseTest {
    Horse h;

    @Before
    public void setUp() throws Exception {
        h = new Horse();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Neigh!", h.sound());
    }
    
    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, h.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        h.upgradeSpeed();
        assertEquals(2, h.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        h.downgradeSpeed();
        assertEquals(0, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10, h.getPrice());
    }

}