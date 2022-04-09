package arrays;

public class _04_Practice_Partial_Arrays {
    public static void main(String[] args) {

        /* TASK-1
        Create an array to store below numbers
        10, -3, -7, 0, 0, 7, 22
        Print all elements one by one in separate lines using FOR EACH LOOP
        RESULT:
        10
        -3
        -7
        0
        0
        7
        22
         */


        System.out.println("\n---------Task1---------\n");


        int[] numbers = {10, -3, -7, 0, 0, 7, 22};

        for (int anInt : numbers) {
            System.out.println(anInt);
        }

        /*
        TASK-2
        Find the sum of all the elements

        RESULT:
        29
         */

        System.out.println("\n---------Task2 for each---------\n");
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);


        System.out.println("\n---------Task2 for i---------\n");
        int count = 0;
        for (int i = 0; i < 7; i++) {
            count += numbers[i];
        }
        System.out.println(count);

        /*
        TASK-3
        Find the sum of first 3 elements in the array

        RESULT:
        0
         */

        System.out.println("\n---------Task3 fori---------\n");
        int count1 = 0;
        for (int i = 0; i < 3; i++) {
            count1 += numbers[i];
        }
        System.out.println(count1);



        /*
        TASK-4
        Find the sum of last 5 elements in the array
        // 10, -3, -7, 0, 0, 7, 22

        RESULT:
        22
         */

        System.out.println("\n---------Task4 fori---------\n");

        int sumOfLast5 = 0;
        for (int i = numbers.length - 5; i < numbers.length; i++) {
            sumOfLast5 += numbers[i];

        }
        System.out.println(sumOfLast5);

        // 10, -3, -7, 0, 0, 7, 22

        System.out.println("\n---------Task5 fori---------\n");
        int product = 1;

        for (int i = numbers.length - 4; i < numbers.length; i++) {
            int number = numbers[i];
            if (number != 0) product *= number;

        }
        System.out.println(product);


        System.out.println("\n---------Task6 fori---------\n");
        /*
        TASK-6
        Check your collection and print true if one of the element is 0
        Print false if none of the elements is zero

        RESULT:
        true
         */

        boolean booleans = false;
        for (int number : numbers) {
            if (number == 0) booleans = true; break;  //make it ONE LINEEEE
        }
        System.out.println(booleans);

    }
}
