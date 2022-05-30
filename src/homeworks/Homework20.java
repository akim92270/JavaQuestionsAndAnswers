package homeworks;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Homework20 {

    //Task-1
    public static boolean hasLowerCase_1(String str) {
        boolean lowercase = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) lowercase = true;
        }
        return lowercase;
    }

    //Task-2
    public static ArrayList<Integer> noZero(ArrayList<Integer> num) {
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) != 0) newArr.add((num.get(i)));
        }
        return newArr;
    }

    //Task-3
    public static int[][] numberAndSquare(int[] arr) {
        int[][] squareArray = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            int[] arr1 = {arr[i], arr[i] * arr[i]};
            squareArray[i] = arr1;
        }
        return squareArray;
    }

    //Task-4
    public static boolean containsValue_1(String[] arr, String str) {
        Arrays.sort(arr);
        return Arrays.binarySearch(arr, str) >= 0;
    }

    //Task-5
    /*public static String reverseSentence(String str) { //Java is fun
        String first = str.substring(0, str.indexOf(" "));
        String last = str.substring(str.lastIndexOf(" ") + 1);
        String middle = str.substring(str.indexOf(" ") + 1, str.lastIndexOf(" "));

        return last + middle + first;
    }
     */

    //Task-6
    public static String removeStringSpecialsDigit_1(String str) {
        return str.replaceAll("[^ A-Za-z]", "");
    }


    //Task-7
    public static String[] removeArraySpecialsDigits(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = removeStringSpecialsDigit_1(arr[i]);
        }
        return arr;
    }

    //Task-8
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> arr1, ArrayList<String> arr2){
        ArrayList<String> newArr = new ArrayList<>();
        for (String s : arr1) {
            for (String s1 : arr2) {
                if(s.equals(s1) && !newArr.contains(s)) newArr.add(s);
            }
        }
        return newArr;
    }

    //Task-9
    public static ArrayList<String> noXInVariables(ArrayList<String> arr){
        ArrayList<String> newArr = new ArrayList<>();
        for (String s : arr) {
            String s1 = s.replaceAll("[xX]", "");
            if (s1.length() > 0) newArr.add(s1);
        }
        return newArr;
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
        System.out.println(hasLowerCase_1(""));
        System.out.println(hasLowerCase_1("JAVA"));
        System.out.println(hasLowerCase_1("125$"));
        System.out.println(hasLowerCase_1("hello"));

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
        int[] num = {1, 2, 3};
        System.out.println(Arrays.deepToString(new int[][]{num}));


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
        System.out.println(containsValue_1(arr1, "hello"));
        String[] arr2 = {"abc", "def", "123"};
        System.out.println(containsValue_1(arr2, "Abc"));
        String[] arr3 = {"abc", "def", "123", "Java", "Hello"};
        System.out.println(containsValue_1(arr3, "123"));

        /*
        Requirement:
        -Create a method called reverseSentence()
        -This method will take a String argument and it will return a String with changing the place of every word. All words should be in reverse order. Make sure that there are two words inside the sentence at least. If there is no two words return "There is not enough words!".

        NOTE: After you reverse, only first letter must be uppercase and the rest will be lowercase!

        Test Data 1: "Hello"
        Expected Result 1: "There is not enough words!"

        Test Data 2: "Java is fun"
        Expected Result 2: "Fun is java"

        Test Data 3: "This is a sentence"
        Expected Result 3: "Sentence a is this"

        Hint: Use split() for easy solution
        Note: Make the new first word’s first letter upper case and make the old first word’s first letter lower case
         */

        /*
        System.out.println("\n----Task 5 ------\n");
        System.out.println(reverseSentence("Hello"));
        System.out.println(reverseSentence("Java is fun"));
        System.out.println(reverseSe("This is a sentence"));

         */


        /*
        Requirement:
        -Create a method called removeStringSpecialsDigits()
        -This method will take a String as argument, and it will return a String without the special characters or digits.
        NOTE: Assume that String length is at least 1.
        NOTE: Do not remove spaces.

        Test Data 1: "123Java #$%is fun"
        Expected Result 1: "Java is fun"

        Test Data 2: "Selenium"
        Expected Result 2: "Selenium"

        Test Data 3: "Selenium 123#$%Cypress"
        Expected Result 3: "Selenium Cypress"
         */
        System.out.println("\n----Task 6 ------\n");
        System.out.println(removeStringSpecialsDigit_1("123Java #$%is fun"));
        System.out.println(removeStringSpecialsDigit_1("Selenium"));
        System.out.println(removeStringSpecialsDigit_1("Selenium Cypress"));


        /*Requirement:
        -Create a method called removeArraySpecialsDigits()
                -This method will take a String array as argument, and it will return a String array without the special characters or digits from the elements.
                NOTE: Assume that array size is at least 1.

        Test Data 1: ["123Java", "#$%is", "fun"]
        Expected Result 1: ["Java", "is", "fun"]

        Test Data 2: ["Selenium", "123$%", "###"]
        Expected Result 2: ["Selenium", "", ""]

        Test Data 3: ["Selenium", "123#$%Cypress"]
        Expected Result 3: ["Selenium", "Cypress"]*/

        System.out.println("\n----Task 7 ------\n");
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"123Java", "#$%is", "fun"})));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "", ""})));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "Cypress"})));

        /*Requirement:
        -Create a method called removeAndReturnCommons()
                -This method will take two String ArrayList and it will return all the common words as String ArrayList.
        NOTE: Assume that both ArrayList sizes are at least 1.

        Test Data 1: ["Java", "is", "fun"], ["abc", "xyz", "123"]
        Expected Result 1: []

        Test Data 2: ["Java", "is", "fun"], ["Java", "C#", "Python"]
        Expected Result 2: ["Java"]

        Test Data 3: ["Java", "C#", "C#"], ["Python", "C#", "C++"]
        Expected Result 3: ["C#"]*/

        System.out.println("\n----Task 8 ------\n");

    }
}
