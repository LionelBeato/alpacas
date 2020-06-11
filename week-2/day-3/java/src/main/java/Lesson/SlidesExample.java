package Lesson;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SlidesExample {

    private static int divide(int x, int y){
        return x / y;
    }

    private static int divideLBYL(int x, int y){
        if( y != 0){
            return x / y;
        } else {
            return 0;
        }
    }

    private static int divideEAFP (int x, int y){
        try{
            return x / y;
        } catch (ArithmeticException e){
            e.printStackTrace();
            return 0;
        }
    }

    public static int getInt() throws InputMismatchException {
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }




    public static void main(String[] args) {
        int x = 100;
        int y = 0;
        int z = getInt();
//        System.out.println(divide(x,y));
        System.out.println(divideLBYL(x,y));
        System.out.println(divideEAFP(x,y));

        System.out.printf("z is %d", z);



    }
}
