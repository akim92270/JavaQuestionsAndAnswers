package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework20 {

    //Task-1
    public static boolean hasLowerCase(String str){
        boolean lowercase = false;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLowerCase(str.charAt(i))) lowercase = true;
        }
       return lowercase;
    }
    //Task-2
    public static ArrayList<Integer> noZero(ArrayList<Integer> num){
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < num.size(); i++) {
            if(num.get(i) != 0) newArr.add((num.get(i)));
        }
        return newArr;
    }

    //Task-3
    /*public static int[][] numberAndSquare(int[] arr){

    }
     */

    //Task-4
    public static boolean containsValue_1(String[] arr, String str){
        Arrays.sort(arr);
        return Arrays.binarySearch(arr,str) >= 0;
    }

    //find another way //Task-4
    public static boolean containsValue_2(String[] arr, String str){
        boolean check = false;
        for (char c : str.toCharArray()) {
            if(c == arr.length) check = true;
            break;
        }
        return check;
    }

    //Task-5
    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
        }

    public static void main(String[] args) {
        /*
        Requirement:
        -Create a method called hasLowerCase()
        -This method will take a String argument, and it will return boolean true if there is lowercase letter and false if it doesn’t.

        Test Data 1: ""
        Expected Result 1: false

        Test Data 2: "JAVA"
        Expected Result 2: false

        Test Data 3: "125$"
        Expected Result 3: false

        Test Data 4: "hello"
        Expected Result 4: true
         */

        System.out.println("\n----Task 1 ------\n");
        System.out.println(hasLowerCase(""));
        System.out.println(hasLowerCase("JAVA"));
        System.out.println(hasLowerCase("125$"));
        System.out.println(hasLowerCase("hello"));

        /*
        Requirement:
        -Create a method called noZero()
        -This method will take one Integer ArrayList argument and it will return an ArrayList with all zeros
        removed from the original Integer ArrayList.

        NOTE: Assume that ArrayList size will be at least 1.

        Test Data 1: [1]
        Expected Result 1: [1]

        Test Data 2: [1, 1, 10]
        Expected Result 2: [1, 1, 10]

        Test Data 3: [0, 1, 10]
        Expected Result 3: [1, 10]

        Test Data 4: [0, 0, 0]
        Expected Result 4: []
         */

        System.out.println("\n----Task 2 ------\n");
        ArrayList<Integer> ex1 = new ArrayList<>();
        ex1.add(1);
        System.out.println(noZero(ex1));
        ArrayList<Integer> ex2 = new ArrayList<>();
        ex2.add(1);
        ex2.add(1);
        ex2.add(10);
        System.out.println(noZero(ex2));
        ArrayList<Integer> ex3 = new ArrayList<>();
        ex3.add(0);
        ex3.add(1);
        ex3.add(10);
        System.out.println(noZero(ex3));
        ArrayList<Integer> ex4 = new ArrayList<>();
        ex4.add(0);
        ex4.add(0);
        ex4.add(0);
        System.out.println(noZero(ex4));

        /*
        Requirement:
        -Create a method called numberAndSquare()
        -This method will take an int array argument and it will return a multidimensional array with all numbers squared.

        NOTE: Assume that array size is at least 1.

        Test Data 1: [1, 2, 3]
        Expected Result 1: [[1, 1], [2, 4], [3, 9]]

        Test Data 2: [0, 3, 6]
        Expected Result 2: [[0, 0], [3, 9], [6, 36]]

        Test Data 3: [1, 4]
        Expected Result 3: [[1,1], [4, 16]]
         */

        System.out.println("\n----Task 3 ------\n");


        /*
        Requirement:
        -Create a method called containsValue()
        -This method will take a String array and a String argument, and it will return a boolean. Search the variable inside of the array and return true if it exists in the array. If it doesn’t exist, return false.
        NOTE: Assume that array size is at least 1.
        NOTE: The method is case-sensitive

        Test Data 1: ["abc", "foo", "java"], "hello"
        Expected Result 1: false

        Test Data 2: ["abc", "def", "123"], "Abc"
        Expected Result 2: false

        Test Data 3: ["abc", "def", "123", "Java", "Hello"], "123"
        Expected Result 3: true

        Hint: Use binarySearch() for easy solution
         */
        System.out.println("\n----Task 4 ------\n");
        String[] arr1 = {"abc", "foo", "java"};
        System.out.println(containsValue_2(arr1, "hello"));
        String[] arr2 = {"abc", "def", "123"};
        System.out.println(containsValue_2(arr2, "Abc"));
        String[] arr3 = {"abc", "def", "123", "Java", "Hello"};
        System.out.println(containsValue_2(arr3, "123"));

        /*
        Requirement:
        -Create a method called reverseSentence()
        -This method will take a String argument and it will return a String with changing the place of every word. All words should be in reverse order. Make sure that there are two words inside the sentence at least. If there is no two words return “There is not enough words!”.

        NOTE: After you reverse, only first letter must be uppercase and the rest will be lowercase!

        Test Data 1: “Hello”
        Expected Result 1: “There is not enough words!”

        Test Data 2: “Java is fun”
        Expected Result 2: “Fun is java”

        Test Data 3: “This is a sentence”
        Expected Result 3: “Sentence a is this”

        Hint: Use split() for easy solution
        Note: Make the new first word’s first letter upper case and make the old first word’s first letter lower case
         */

        System.out.println("\n----Task 4 ------\n");
        System.out.println("\n----Task 5 ------\n");
        System.out.println(reverseString("Hello"));
        System.out.println(reverseString("Hello"));
        System.out.println(reverseString("Java is fun"));
        System.out.println(reverseString("This is a sentence"));

    }
}
