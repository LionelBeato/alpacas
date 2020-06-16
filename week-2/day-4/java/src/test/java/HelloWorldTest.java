import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    // @Test is an annotation
    // This lets JUnit know what is a test method and what isn't
    // annotations are heavily encouraged with JUnit4 and above
    @Test
    public void getMessage() {
        // here were constructing a new instance of HelloWorld
        HelloWorld hw = new HelloWorld();
        // here were asserting that two given values are the same
        assertEquals("Hello, World", hw.getMessage());
    }

    @Test
    public void testGetMessage() {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello, Lionel!", hw.getMessage("Lionel"));

    }
}