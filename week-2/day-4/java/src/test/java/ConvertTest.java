import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConvertTest {

    Convert convert;
    double length;
    double amount;

    @Before
    public void setup(){

        convert = new Convert();
        length = 240;
        amount = 4200;



    }

    @Test
    public void convertLength() {
//        fail("Not yet implemented!");
//        Convert convert = new Convert();
        String unit = "inches";
        double result = convert.convertLength(length, unit);

        assertEquals(100.0, result, 0.0);
    }

    @Test
    public void convertVolume() {
//        fail("Not yet implemented!");
//        Convert convert = new Convert();
        String unit = "ml";
        double result = convert.convertVolume(amount,unit);

        assertEquals(142.03, result, 0.1);
    }

    @Test
    public void addString() {
        Convert convert = new Convert();
        assertEquals("worldhello",convert.addString("hello","world"));

    }
}