import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class PasswordTest {

    @Test
    public void getRandomNumber() {
        Password password = new Password();
        Random random = new Random();
        assertEquals(random.nextInt(5), password.getRandomNumber());
    }
}