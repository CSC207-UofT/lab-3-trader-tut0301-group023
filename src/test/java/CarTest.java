import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {

    Car car;

    @Before
    public void setUp() throws Exception{
        car = new Car("A", 50000, 240);
    }

    @Test(timeout = 50)
    public void TestGetPrice(){
        assertEquals(50000, car.getPrice());
    }

    @Test (timeout = 50)
    public void TestGetMaximumSpeed(){
        assertEquals(240, car.getMaxSpeed());
    }

    @Test (timeout = 50)
    public void TestUpgradeSpeed(){
        car.upgradeSpeed();
        assertEquals(241, car.getMaxSpeed());
    }

    @Test (timeout = 50)
    public void TestDowngradeSpeed(){
        car.downgradeSpeed();
        assertEquals(239, car.getMaxSpeed());
    }

}
