package arrays;

import java.util.Arrays;

public class _03_Practice_int_Array {
    public static void main(String[] args) {

        /*
        TASK-1
        Create an int array and store below data

        -3
        -7
        0
        2
        0
        7
        7
        10
        2
        15

        Print the array with message "Array not sorted = "
        Print the sorted array with message "Array sorted = "
         */

        System.out.println("\n-------------Task-1------------------\n");
        int[] numbers = {-3, -7, 0, 2, 0, 7, 7, 10, 2, 15};

        System.out.println("Array not sorted" + Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("Array is sorted" + Arrays.toString(numbers));


        /*
        Task-2
        Count how many positive-negative and zero numbers you have

        Expected:
        Positives = 6
        Negatives = 2
        Zeros = 2
         */

        System.out.println("\n-------------Task-2------------------\n");

        int positive = 0, negative = 0, zero = 0;

        for (int number : numbers) {
            if(number > 0) positive++;
            else if(number < 0) negative++;
            else zero++;
        }
        System.out.println("Positives = " + positive + "\nNegatives = " + negative + "\nZeros = " + zero);



        System.out.println("\n-------------Task-2 for each------------------\n");
        int pos = 0, neg = 0;

        for (int number : numbers) {
            if(number > 0) pos++;
            else if(number < 0) neg++;
        }
        System.out.println("Positives = " + pos);
        System.out.println("Negatives = " + neg);
        System.out.println("Zeros = " + (numbers.length-pos));

        /*
        Count how many even and odds

        Expected:
        Evens = 5
        Odds = 5
         */

        System.out.println("\n-------------Task-3 for each------------------\n");


        int countEvens = 0, countOdds = 0;
        for (int number : numbers) {
            if(number % 2 == 0) countEvens++;
            else countOdds++;
        }
        System.out.println("Evens = " + countEvens + "\nOdds = " + countOdds);


        /*
        Extra Practice
        Numbers that are more than 7 - > 2
        Numbers that can be divided by 5 - > 4
        Numbers can be divided by 2 but not by 3 -> 3
        Check if it contains 10 -> true
        Check if it contains 8 -> false

        Please do this Count how many numbers are 2 digits
         */
        System.out.println("\n-------------Task-4 for each------------------\n");

        int count7 = 0, dividedBy5 = 0, dividedBy2ButNot3 = 0;
        for (int number : numbers) {
            if(number % 2 == 0 && number % 3 != 0) dividedBy2ButNot3++;
            else if(number > 7) count7++;
            else if(number % 5 == 0) dividedBy5++;

        }
        System.out.println("more than 7 = " + count7 + "\ndivided by 5 = " + dividedBy5 + "\ndivided by 2 but not 3 = " + dividedBy2ButNot3);
    }
}
