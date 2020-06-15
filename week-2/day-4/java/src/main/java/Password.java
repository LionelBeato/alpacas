import java.util.Random;

public class Password {

    public int getRandomNumber(){
        Random rand = new Random();
        return rand.nextInt(5);
    }

    public static void main(String[] args) {

        Random rand = new Random();
        System.out.println(rand.nextInt());

    }
}
