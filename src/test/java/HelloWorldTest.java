import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    public void testGreet() {
        assertEquals("¡Hola, Moises!", HelloWorld.greet("Moises"));
    }
}
