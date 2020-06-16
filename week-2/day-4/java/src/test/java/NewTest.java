import org.junit.Test;
// this static import allows you to treat the methods as belong to the class itself
// therefore, you don't need to specify a namespace like Assert.assertEquals
import static org.junit.Assert.*;

public class NewTest {

    @Test
    public void testing(){
        int x = 2;
        assertEquals(2,x);

    }

}
