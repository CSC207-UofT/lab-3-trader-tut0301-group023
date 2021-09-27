import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car c;
    @Before
    public void setUp() throws Exception {
        c = new Car();
    }

    @Test(timeout = 50)
    public void TestgetMaxSpeed() {
        assertEquals(100, c.getMaxSpeed());
    }
}
