import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

public class CowTest {
    Cow c;

    @Before
    public void setUp() throws Exception{
        c = new Cow();
    }

    @Test
    public void TestGetPrice() {
        assertEquals(7, c.getPrice());
    }

    @Test
    public void TestSound() {
        assertEquals("Moo", c.sound());
    }
}