import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TractorTest {
    Tractor t;

    @Before
    public void setUp() throws Exception {
        t = new Tractor();
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

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(1000, t.getPrice());
    }
}
