package arrays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        /*
        How to sort an array of numbers
        byte, short, int, long, float, double

        We will sort these in ascending order
        Ascending: Lowest to highest
        Descending: Highest to lowest

         */

        System.out.println("\n--------Sorting numbers--------\n");
        int[] numbers = {10, -5, 0, 0, 3, 0, 7, 9};
        System.out.println("My array is = " + Arrays.toString(numbers)); // [10, -5, 0, 0 , 3, 0, 7, 9]

        //sort this array in ascending order //[-5, 0, 0, 0, 3, 7, 9, 10]

        Arrays.sort(numbers); //void so sout will not work directly. We must do use this, otherwise it will be compile error.

        System.out.println("My array sorted is = " + Arrays.toString(numbers));


        System.out.println("\n--------Sorting characters--------\n");
        char[] characters = {'A', 'b', 'z'};

        System.out.println("My characters arrays " + Arrays.toString(characters));

        Arrays.sort(characters);

        System.out.println("My characters array sorted " + Arrays.toString(characters));

        System.out.println("\n--------Sorting words--------\n");
        String[] names = {"Adam", "Adame", "Alex", "tom", "ally", "Adele", "terry", "Josh"};

        System.out.println("My names array = " + Arrays.toString(names));

        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].toLowerCase(); //

        }
        Arrays.sort(names);

        //Lexicographically
        System.out.println("My names array sorted " + Arrays.toString(names)); //Adam, Adame, Adele, Alex, Josh, ally, terry, tom
    }
}
