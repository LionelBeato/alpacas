import org.junit.Test;
// this static import allows you to treat the methods as belong to the class itself
// therefore, you don't need to specify a namespace like Assert.assertEquals
import static org.junit.Assert.*;

public class NewTest {



    // tests don't need to align with source code
    // the test below is not testing for anything that we've written in main
    @Test
    public void testing(){
        // this variable is created within this method and has no affiliation with any other class
        int x = 2;
        assertEquals(2,x);
    }

    @Test
    public void exceptionTesting(){
     
    }


}
