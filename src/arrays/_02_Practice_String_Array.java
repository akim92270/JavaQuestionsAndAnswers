package arrays;

import utilities.CharacterHelper;

import java.util.Arrays;

public class _02_Practice_String_Array {
    public static void main(String[] args) {
        /*
        TASK-1
        Create a String array and store below data
        Name of the array will be students

        Alex
        Tom
        John
        James
        Jordan
        Lionel
        Adam

        1. Print the array
        2. Sort the array and print it again

        EXPECTED:
        Unsorted array = [Alex, Tom, John, James, Jordan, Lionel, Adam]
        Sorted array = [Adam, Alex, James, John, Jordan, Lionel, Tom]
         */

        System.out.println("\n---------TASK-1----------\n");
        String[] students = {"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"};

        System.out.println("Unsorted array = " + Arrays.toString(students));

        Arrays.sort(students);
        System.out.println("Sorted array = " + Arrays.toString(students));


        /*
        TASK-2
        Print the first and the last names after it is sorted

        EXPECTED:
        First name is = Adam
        Last name is = Tom


        [element1, element2 ..................  elementX]
        0          1       2 ................   length-1
         */

        System.out.println("\n---------TASK-2----------\n");

        System.out.println("First name is = " + students[0]);
        System.out.println("Last name is = " + students[students.length - 1]);


        /*
        TASK-3
        [Adam, Alex, James, John, Jordan, Lionel, Tom]

        Count how many names starts with A

        EXPECTED:
        2
         */

        System.out.println("\n---------TASK-3 for each loop----------\n");

        int countA = 0;

        for (String student : students) {
            //if(student.startsWith("A")) countA++;
            if (student.charAt(0) == 'A') countA++;
        }

        System.out.println(countA);

        System.out.println("\n---------TASK-3 fori loop----------\n");

        int countA2 = 0;
        for (int i = 0; i < students.length; i++) {
            //if(students[i].startsWith("A")) countA2++;
            if (students[i].charAt(0) == 'A') countA2++;
        }

        System.out.println(countA2);



        /*
        TASK-4
        [Adam, Alex, James, John, Jordan, Lionel, Tom]

        Count how many names contains a-A or e-E

        EXPECTED:
        5
         */

        System.out.println("\n---------TASK-4 for each loop----------\n");

        int countAorE = 0;

        for (String student : students) {
            //if(student.contains("A") || student.contains("E") || student.contains("a") || student.contains("e")) countAorE++;
            student = student.toLowerCase();
            if (student.contains("a") || student.contains("e")) countAorE++;
        }

        System.out.println(countAorE);

        System.out.println("\n---------TASK-4 fori loop----------\n");

        int countAorE2 = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i].toUpperCase().contains("A") || students[i].toUpperCase().contains("E")) countAorE2++;
        }

        System.out.println(countAorE2);


        System.out.println("\n---------TASK-5 for i loop----------\n");
        /*
        TASK-4
        [Adam, Alex, James, John, Jordan, Lionel, Tom]

        Count how many names has at least 5 characters

        EXPECTED:
        3
         */

        int countLength = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i].length() >= 5) countLength++;
        }

        System.out.println(countLength);

        System.out.println("\n---------TASK-5 for each loop----------\n");


        /*int countLength5 = 0;

        for (String student : students) {
            if (student.length() >= 5) countLength5++;
        }
        System.out.println(countLength5);


        Count how many names start with J or j
        Count how many names start or ends with S-s
        Count names has O-o
        Count names has even length
        Count names that has odd length
        Count names that starts with a vowel letters
         */

        /*
        [Adam, Alex, James, John, Jordan, Lionel, Tom]
         */
        int countNamesJj = 0;

        for (String student : students) {
            if (student.toLowerCase().startsWith("j")) countNamesJj++;
        }
        System.out.println("Names that start with J or j = " + countNamesJj);

        int countStartsEndsS = 0;

        for (String student : students) {
            if (student.toLowerCase().startsWith("s") || student.toLowerCase().endsWith("s")) countStartsEndsS++;
        }
        System.out.println("Names that start with S or ends with s = " + countStartsEndsS);

        int countO = 0;
        for (String student : students) {
            if(student.toLowerCase().contains("o")) countO++;
        }
        System.out.println("Name that contains o = " + countO);

        int countEvenNames = 0;
        for (String student : students) {
            if(student.length() % 2 == 0) countEvenNames++;
        }
        System.out.println("Name that has even length = " + countEvenNames);

        int countOdd = 0;
        for (String student : students) {
            if(student.length() % 2 != 0) countOdd++;
        }
        System.out.println("Name that has odd names =" + countOdd);

        int countVowel = 0;
        for (String student : students) {
            student = student.toLowerCase();
            if(student.startsWith("a") || student.startsWith("e") || student.startsWith("i") || student.startsWith("o")
                    || student.startsWith("u")) countVowel++;
        }
        System.out.println("Names that start with vowels = " + countVowel);

        /*
        Task-06
        [Adam, Alex, James, John, Jordan, Lionel, Tom]

        Check if this array has an element that is equal to "Jennifer"
        Expected:
        Print True or False
         */

        boolean hasJennifer = false;

        for (String student : students) {
            if (student.equalsIgnoreCase("Jennifer")) {
                hasJennifer = true;
                break;
            }
        }
            System.out.println(hasJennifer);
    }
}