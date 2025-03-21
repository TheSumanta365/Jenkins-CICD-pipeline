import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimpleAppTest {
    @Test
    public void testMessage() {
        SimpleApp app = new SimpleApp();
        assertEquals("Welcome to Jenkins CI/CD!", app.getMessage());
    }
}