import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    private int added;

    @Before
    public void variables(){
        added = Main.adder(4,3);
    }

    @Test
    public void adder() {
        assertEquals(7, added);
    }

    @Test
    public void main() {
    }
}