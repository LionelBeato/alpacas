package Practice;

public class BigOPractice {

    // lets see if we can determine the time-space complexity of this function
    public static void printFirstItemThenFirstHalfThenSayHi100Times(int[] items){
        // this is O(1)
        System.out.println(items[0]);

        int middleIndex = items.length / 2;
        int index = 0;

        // this is O(a/2)
        while (index < middleIndex){
            System.out.println(items[index]);
            index++;
        }

        // this is O(100)
        for (int i = 0; i < 100; i++) {
            System.out.println("hi");
        }

        // O(1)
        // O(a/2)
        // O(100)



    }

    public static void main(String[] args) {

        int[] ints = {1,2,3,4,5};
        BigOPractice.printFirstItemThenFirstHalfThenSayHi100Times(ints);
    }
}
