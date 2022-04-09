package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {

        char[] chars = {'A', ' ', ',' , '#', 'T', '6', '9'};

        //System.out.println(chars.length); //7

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


        System.out.println("\n-------fori Loop--------\n");
        for (int i = 0; i < chars.length; i++) {
            System.out.println("Element " + i + " = " + chars[i]);
        }
        System.out.println("\n-------for each Loop--------\n");
        int i = 0;
        for (char element: chars) {
            System.out.println("Element " + i + " = " + element);
            i++;
        }
    }
}
