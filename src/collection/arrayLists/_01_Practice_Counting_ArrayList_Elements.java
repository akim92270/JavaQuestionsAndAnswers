package collection.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class _01_Practice_Counting_ArrayList_Elements {
    public static void main(String[] args) {
        /*
        TASK-1
        Create an ArrayList called numbers that stores below numbers,

        10
        12
        13
        8
        9
        15

        Print the list

        RESULT:
        [10, 12, 13, 8, 9, 15]
         */

        System.out.println("\n--------TASK-1-----------\n");
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(12);
        numbers.add(13);
        numbers.add(8);
        numbers.add(9);
        numbers.add(15);

        System.out.println(numbers);


        /*
        TASK-2
        Count how many odd numbers you have in the list and print the result

        RESULT:
        Odds = 3
         */

        System.out.println("\n-------TASK-2-for each loop ---------\n");

        int countOdds = 0;

        for (Integer number : numbers) {
            if(number % 2 == 1) countOdds++;
        }

        System.out.println("Odds = " + countOdds);

        System.out.println("\n-------TASK-2-fori loop ---------\n");
        countOdds = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) % 2 == 1) countOdds++;
        }

        System.out.println("Odds = " + countOdds);

        /*
        Practices
        Evens
        Positives
        Negatives
        Zeros
        Numbers more than 10
        Numbers can be divided by 5
         */
    }
}