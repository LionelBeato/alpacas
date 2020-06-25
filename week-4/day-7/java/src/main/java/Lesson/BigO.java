package Lesson;

public class BigO {

    // Today we will be discussing Big O Notation and time-space complexity

    // take a look at the function below
    // note that the input can be arbitrarily large
    // the function below works in constant time
    // no matter the input, the output will be returned at the same rate
    // this is because the amount of operations will always be the same
    // you could say this function is O(1)
    public static void simpleFunction(int N){
        long start = System.currentTimeMillis();
        System.out.println(N);
        long end = System.currentTimeMillis();
        System.out.println("Here is how long the function took: " + (end - start) + "ms");
    }

    public static void constantFunction(int[] N){
        long start = System.currentTimeMillis();
        System.out.println(N[0]);
        long end = System.currentTimeMillis();
        System.out.println("Here is how long the function took: " + (end - start) + "ms");
    }

    public static void linearFunction(int N){
        long start = System.currentTimeMillis();
        for(int i = 1; i <= N; i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Here is how long the function took: " + (end - start) + "ms");
    }

    public static void otherLinearFunction(int[] N){
        long start = System.currentTimeMillis();
        for (int element : N){
            System.out.println(element);
        }

        long end = System.currentTimeMillis();
        System.out.println("Here is how long the function took: " + (end - start) + "ms");

    }

    public static void polynomialFunction(int[] N){
        long start = System.currentTimeMillis();

        for (int firstElement : N){
            for (int secondElement : N){
                System.out.println(firstElement +", " + secondElement);
            }

        }
        long end = System.currentTimeMillis();
        System.out.println("Here is how long the function took: " + (end - start) + "ms");


    }


    public static void main(String[] args) {

        int[] ints = {1,2,3,4,5};
        int[] otherInts = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

//        Lesson.Main.simpleFunction(100000);
//        Lesson.Main.constantFunction(ints);
//        Lesson.Main.linearFunction(200000);

//        Lesson.Main.otherLinearFunction(otherInts);
        BigO.polynomialFunction(otherInts);



    }
}
