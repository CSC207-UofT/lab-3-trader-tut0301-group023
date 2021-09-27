import org.junit.*;

import static org.junit.Assert.*;

public class SkateboardTest {
    Skateboard s;

    @Before
    public void setUp() throws Exception {
        s = new Skateboard(5);
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(5, s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        s.upgradeSpeed();
        assertEquals(7, s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        s.downgradeSpeed();
        assertEquals(4, s.getMaxSpeed());
    }
}
