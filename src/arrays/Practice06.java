package arrays;

import java.util.Arrays;

public class Practice06 {
    public static void main(String[] args) {

        System.out.println("\n-------TASK-1-------06 Additional Interview Questions-------\n");
        /*
        Find the greatest and print it
        RESULT:
        {5, 3, 0, -5} -> 5
        {4, 10, 15} -> 15
         */
        int[] numbers = {5, 3, 0, -5};

        int max = Integer.MIN_VALUE;
        for (int element : numbers) {
            max = Math.max(max, element);
        }
        System.out.println(max);

        /*
        TASK-2
        Create a double array and store below elements
        {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25}
        Find the minimum value
        RESULT:
        0.5
         */
        double[] num = {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25};
        double min = Double.MAX_VALUE;
        for (double elements : num) {
            min = Math.min(min, elements);
        }
        System.out.println(min);


        double min1 = Double.MAX_VALUE;
        for (double elements : num) {
            if (elements == min) continue;
            else if (elements < min1) min1 = elements;
        }
        System.out.println(min1);


        /*
        Find the string that has the most characters and print it
        ASSUME ALL THE STRINGS HAS DIFFERENT LENGTHS
        RESULT:
        yellow
         */
        String[] colors = {"red", "blue", "yellow", "white"};

        String colorlongest = colors[0];
        for (String color : colors){
            if(color.length() > colorlongest.length()) colorlongest = color;
        }
        System.out.println(colorlongest);

        for (int i = 1; i < 4; i++) {
            System.out.println(i);
            for (int j = 5; j > 2; j--) {
                System.out.println("\t" + j);
            }
        }

        for (int i = 1; i <= 2; i++) {
            int start = 97;
            if(i == 1){
                //First iteration start point = 97 end = 122 = start+25
                System.out.println("Lowercase Letters");
            }
            else{
                //Second iteration start point = 65 end = 90
                System.out.println("Uppercase Letters");
                start = 65;
            }

            for (int j = start; j <= start+25; j++) {
                System.out.println((char)j);
            }
        }

        System.out.println("\n\n-----Separate Loops Solution-----\n");

        System.out.println("Lowercase letters");
        for (int i = 97; i <= 122; i++) { // 97 122 -> 26
            System.out.println((char)i);
        }

        System.out.println("Uppercase letters");
        for (int i = 65; i <= 90; i++) { // 65 90 -> 26
            System.out.println((char)i);
        }

        System.out.println("End of the program!");
    }
}