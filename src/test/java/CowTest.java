import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

public class CowTest {
    Cow c;

    @Before
    public void setUp() throws Exception{
        c = new Cow();
    }

    @Test
    public void getPrice() {
    }

    @Test
    public void sound() {
        assertEquals("Moo", c.sound());
    }
}