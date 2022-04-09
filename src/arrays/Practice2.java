package arrays;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        System.out.println("\n-------TASK-1-------\n");
        int[] numbers = {10, -3, -7, 0, 0, 7, 22};

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("\n-------TASK-2-------\n");
        int sum = 0;
        for ( int element: numbers) {
            sum += element;
        }
        System.out.println(sum);

        int sumvalue = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumvalue += numbers[i];
        } System.out.println(sumvalue);

        System.out.println("\n-------TASK-3-------\n");
        int count = 0;
        for (int i = 0; i < 3; i++) {
            count += numbers[i];
        }
        System.out.println(count);

        System.out.println("\n-------TASK-4-------\n");
        int counter = 0;
        for (int i = 2; i < numbers.length; i++) {
            counter += numbers[i];
        }
        System.out.println(counter);

        System.out.println("\n-------TASK-5-------\n");
        int product = 1;
        for (int i = 3; i < numbers.length; i++) {
            int number = numbers[i];
            if(number != 0) product *= number;
        }
        System.out.println(product);

        System.out.println("\n-------TASK-6-------\n");

        boolean check = false;
        for(int num : numbers)
            if (num == 0) {
                check = true;
                break;
            }
        System.out.println(check);

        System.out.println("\n-------TASK-1  05 Practice Searching-------\n");

        /*
        TASK-1
        Check the collection you have above and print true if it contains Mouse
        Print false otherwise
        RESULT:
        true
         */
        String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad"};
        boolean check1 = false;
        for (String object : objects){
            if(object.equals("Mouse")){
                check1 = true;
                break;
            }
        }
        System.out.println(check1);
        /*
        TASK-2
        Check the collection you have above and print true if one of the element is board
        Print false otherwise
        RESULT:
        false
        */
        System.out.println("\n-------TASK-2  05 Practice Searching-------\n");

        boolean check2 = false;
        for(String object : objects){
            if(object.equals("board")){
                check2 = true; break;
            }
        }
        System.out.println(check2);

        System.out.println("\n-------TASK-3  05 Practice Searching-------\n");

        /*
        TASK-3
        Check if you have an element equals to "iPad"
        If so, print true
        Else, print false
        "Remote", "Mouse","Mouse", "Keyboard", "iPad"
         */
        boolean checkElement = false;
        for (String element: objects){
            if(element.equals("iPad")){
                checkElement = true; break;
            }
        }
        System.out.println(checkElement);

        System.out.println("\n-------TASK-3 /4  05 Practice Searching-------\n");

        Arrays.sort(objects);
        System.out.println(Arrays.binarySearch(objects,"iPad"));

         /*
        TASK-4
        Create an int array to store below data
        {5, -2, 0, -7, 0, 5, 8, 45, 53}
        Check if collection has 5
        Check if collection has 0
        Check if collection has 45
        Check if collection has 3
        Check if collection has -7
        RESULT:
        true
        true
        true
        false
        true
         */

        int[] data = {5, -2, 0, -7, 0, 5, 8, 45, 53};

        Arrays.sort(data);
        System.out.println(Arrays.binarySearch(data,5) >= 0);
        System.out.println(Arrays.binarySearch(data,0) >= 0);
        System.out.println(Arrays.binarySearch(data,45) >= 0);
        System.out.println(Arrays.binarySearch(data,3) >= 0);
        System.out.println(Arrays.binarySearch(data,-7) >= 0);




    }
}