package homeworks;

import utilities.RandomNumberGenerator;

import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {
        System.out.println("\n-------Task-1----------\n");

        /*
        print 1 - 10 both included
        if num is dividable by 2 print "Foo"
        if num is diviable by 5 print "Bar"
        if num is dividable by 2 and 5, then print FooBar
        else print num itself.
         */

        for (int i = 1; i < 11; i++) {
            if (i % 5 == 0 && i % 2 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 5 == 0) System.out.println("Bar");
            else System.out.println(i);
        }

        System.out.println("\n-------Task-2----------\n");

        /*
        Find first positive and break;
        Find first negative and break;
        Created flags, then created for each loop
        Looked at in class examples to follow along
        If /elseif  conditions otherwise it can look for 0
        */

        int[] numbers = {0, -4, -7, 0, 5, 10, 45};

        boolean isPositive = false, isNegative = false;
        for (int number : numbers) {
            if (number > 0 && !isPositive) {
                isPositive = true;
                System.out.println("First positive = " + number);
            } else if (number < 0 && !isNegative) {
                isNegative = true;
                System.out.println("First negative = " + number);
            }
            if (isPositive && isNegative) break;
        }

        System.out.println("\n-------Task-3----------\n");

        /*
        Created 5 int size then used our randomgenerator and store inside the indexes.
        Create for each loop and contains 2 or 3 (most condition) print contains 2 and 3
        otherwise return false.

         */
        int[] randomOf5 = new int[5];
        randomOf5[0] = RandomNumberGenerator.getRandomNumber(1, 10);
        randomOf5[1] = RandomNumberGenerator.getRandomNumber(1, 10);
        randomOf5[2] = RandomNumberGenerator.getRandomNumber(1, 10);
        randomOf5[3] = RandomNumberGenerator.getRandomNumber(1, 10);
        randomOf5[4] = RandomNumberGenerator.getRandomNumber(1, 10);

        boolean has2and3 = false;
        boolean has2 = false;
        boolean has3 = false;
        for (int i : randomOf5) {
            if (i == 2 || i == 3)
                has2and3 = true;
            //else if(i == 2) has2 = true;
            //else
            //    has3 = true;
        }
        System.out.println("Array contains 2 and 3 " + has2and3);
        //System.out.println("Array contains 2 " + has2);
        //System.out.println("Array contains 3 " + has3);

        System.out.println("\n-------Task-4----------\n");
        /*
        Took string array, created for each to check every condition
        Created a flag, set as false
        Changed elements to lowercase to make it dynamic and print outside

        I wanted to create a break to stop, but it returns false so I took it out. Maybe due
        to .equals it already is a boolean so it break.
         */

        String[] list = {"banana", "orange", "Apple", "orange"};
        boolean check = false;

        for (String elements : list) {
            if (elements.toLowerCase().equals("apple")) check = true;
        }
        System.out.println(check);


        System.out.println("\n-------Task-5----------\n");

        /*
        Created for each loop and 2nd for each loop and compared them together
        Not sure how to print out "There is no matching elements" because it keeps on looping the statement

         */
        int[] numbers1 = {30, 50, 70};
        int[] numbers2 = {20, 100, 300};

        boolean s = false;
        for (int i : numbers1) {
            for (int i1 : numbers2) {
                if (i == i1) {
                    System.out.println(i);
                    //} else {
                    // System.out.println("There is no matching elements");
                    s = true;
                }
            }
        }
        if(!s) System.out.println("There is no matching elements");

        System.out.println("\n-------Task-6----------\n");

        /*
        Use toCharArray
        tried container but I don't want to count A instead of the numbers
        tried boolean but I don't want to write true or false
        comparing fori loops with each other.
         */
        String str = "baNana";
        String duplicates = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j) &&
                        !duplicates.contains(str.toLowerCase().substring(i, i + 1))){
                    duplicates += str.toLowerCase().charAt(i);
                    System.out.println(str.charAt(i));
                    break;
                }
            }
        }//looked at Meldas solution had a hard time reading it.
        //System.out.println("..........TASK6............");
        //String task6 = "banana";
        //char[] c = task6.toCharArray();
        //for (int i = 0; i < c.length; i++) {
        //    for (int j = i + 1; j < c.length; j++) {
        //        if (c[i] == c[j]) {
        //            System.out.println(c[j]);


        String str1 = "baNana";
        String duplicates1 = ""; // inside container is a & n

        for (int i = 0; i < str.length()-1; i++){ // i = 0; i < str.length()-1; --> outer loop must start at 0 to start checking from first element
            for (int j = i + 1; j < str.length(); j++){ // j = i + 1; j < str.length(); --> inner loop must start at the iteration(index) the outer is in plus 1
                if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j) // checking if there's matching letters
                        && !duplicates.contains("" + str.toLowerCase().charAt(i))){ //see below note
                    duplicates += str.toLowerCase().charAt(i); // add to/update container when condition is met
                    System.out.println(str.charAt(i)); // here not printing container but the original str
                    break;
                }
            }
        }
/* NOTE: a sign that a container is needed other than keywords "sum" and "count" is when a condition has already been meet and there
are other elements that also meets the same condition; the container tell it not to check that like-element anymore.
FOR THE ABOVE EXAMPLE: !duplicates.contains("" + str.toLowerCase().charAt(i)) --> HERE IS SAYING IF CONTAINER ALREADY HAS
THIS ELEMENT IN IT THEN DON'T ADD ANOTHER SIMILAR ELEMENT. */
    }
}


