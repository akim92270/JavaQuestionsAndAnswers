package arrays;

import java.util.Arrays;

public class PracticeArrays {
    public static void main(String[] args) {

        /*
        Task-1
        Create an array that will store 4 fruit names
        Then, print the empty array

        EXPECTED OUTPUT:
        [null, null, null, null]
         */
        System.out.println("\nTask-1\n");
        String[] fruit = new String[4];

        /*
        Task-2
        Store your fav fruit in the index of 0
        Store the 4th fav fruit in the index of 3
        Print the array again

        EXPECTED OUTPUT:
        [Apple, null, null, Banana]
         */
        System.out.println("\nTask-2\n");
        fruit[0] = "Apple";
        fruit[3] = "Banana";

        /*
        Task-3
        Find the size of your array and print it
        SIZE = How many elements you have in the array

        EXPECTED OUTPUT:
        4
         */

        System.out.println("\nTask-3\n");
        System.out.println(fruit.length);

        /*
        Task-4
        Print the elements at the index of 0 and 3
         */
        System.out.println("\nTask-4\n");
        System.out.println(Arrays.toString(fruit));

        /*
        Print each element with a message

        Expected output:

        Element 1 = A
        Element 2 =
        Element 3 = ,
        Element 4 = #
        Element 5 = T
        Element 6 = 6
        Element 7 = 9
         */

        System.out.println("\nTask-5\n");

        char[] chars = {'A', ' ', ',', '#', 'T', '6', '9'};

        for (int i = 0; i < chars.length; i++) {

            System.out.println(i);

        }
        /*
        Create an array to store 1, 2, 3
        Print array

        EXPECTED OUTPUT:
        [1, 2, 3]
         */

        int[] store = {1,2,3};
        System.out.println(Arrays.toString(store));
    }
}
