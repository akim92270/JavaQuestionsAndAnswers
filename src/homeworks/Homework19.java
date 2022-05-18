package homeworks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework19 {
    public static void main(String[] args) {
        System.out.println("\n-----TASK 1------\n");

        String test = "";
        String test1 = "Java";
        String test2 = "123Hello";
        String test3 = "23Hello World149";
        String test4 = "123Tech456Global149";
        System.out.println(noDigit_1(test));
        System.out.println(noDigit_1(test1));
        System.out.println(noDigit_1(test2));
        System.out.println(noDigit_1(test3));
        System.out.println(noDigit_1(test4));

        System.out.println("\n-----TASK 1 Solution 2------\n");

        System.out.println(noDigit_2(test));
        System.out.println(noDigit_2(test1));
        System.out.println(noDigit_2(test2));
        System.out.println(noDigit_2(test3));
        System.out.println(noDigit_2(test4));

        System.out.println("\n-----TASK 2 Solution 1------\n");

        String task2_1 = "";
        String task2_2 = "xyz";
        String task2_3 = "JAVA";
        String task2_4 = "125$";
        String task2_5 = "125$";
        System.out.println(noVowel_1(task2_1));
        System.out.println(noVowel_1(task2_2));
        System.out.println(noVowel_1(task2_3));
        System.out.println(noVowel_1(task2_4));
        System.out.println(noVowel_1(task2_5));

        System.out.println("\n-----TASK 2 Solution 2------\n");

        System.out.println(noVowel_2(task2_1));
        System.out.println(noVowel_2(task2_2));
        System.out.println(noVowel_2(task2_3));
        System.out.println(noVowel_2(task2_4));
        System.out.println(noVowel_2(task2_5));

        System.out.println("\n-----TASK 3 Solution 1------\n");

        String task3_1 = "";
        String task3_2 = "Java";
        String task3_3 = "John's age is 29";
        String task3_4 = "$125";
        System.out.println(sumOfDigits_1(task3_1));
        System.out.println(sumOfDigits_1(task3_2));
        System.out.println(sumOfDigits_1(task3_3));
        System.out.println(sumOfDigits_1(task3_4));

        System.out.println("\n-----TASK 3 Solution 2------\n");

        System.out.println(sumOfDigits_2(task3_1));
        System.out.println(sumOfDigits_2(task3_2));
        System.out.println(sumOfDigits_2(task3_3));
        System.out.println(sumOfDigits_2(task3_4));


        System.out.println("\n-----TASK 4 Solution 1------\n");

        String task4_1 = "";
        String task4_2 = "java";
        String task4_3 = "John's age is 29";
        String task4_4 = "$125";
        System.out.println(hasUpperCase_1(task4_1));
        System.out.println(hasUpperCase_1(task4_2));
        System.out.println(hasUpperCase_1(task4_3));
        System.out.println(hasUpperCase_1(task4_4));

        System.out.println("\n-----TASK 4 Solution 2------\n");

        System.out.println(hasUpperCase_2(task4_1));
        System.out.println(hasUpperCase_2(task4_2));
        System.out.println(hasUpperCase_2(task4_3));
        System.out.println(hasUpperCase_2(task4_4));

        System.out.println("\n-----TASK 5------\n");

        int first = 1, second = 1, third = 1;
        int a1 = 1, a2 = 2, a3 = 2;
        int a4 = 5, a5 = 5, a6 = 8;
        int a7 = 5, a8 = 3, a9 = 5;
        int a10 = -1, a11 = 25, a12 = 10;
        System.out.println("first solution " + middleInt_2(first, second, third));
        System.out.println("second solution " + middleInt_2(a1, a2, a3));
        System.out.println("third solution " + middleInt_2(a4, a5, a6));
        System.out.println("fourth solution " + middleInt_2(a7, a8, a9));
        System.out.println("fifth solution " + middleInt_2(a10, a11, a12));

        System.out.println("\n-----TASK 5 Solution 2------\n");

        System.out.println("first solution " + middleInt(first, second, third));
        System.out.println("second solution " + middleInt(a1, a2, a3));
        System.out.println("third solution " + middleInt(a4, a5, a6));
        System.out.println("four solution " + middleInt(a7, a8, a9));
        System.out.println("fifth solution " + middleInt(a10, a11, a12));

        System.out.println("\n-----TASK 6 Solution 1------\n");

        int[] a = {1, 2, 3, 4};
        int[] b = {13, 2, 3};
        int[] c = {13, 13, 13, 13, 13};
        System.out.println(Arrays.toString(no13_1(a)));
        System.out.println(Arrays.toString(no13_1(b)));
        System.out.println(Arrays.toString(no13_1(c)));

        System.out.println("\n-----TASK 6 Solution 2------\n");

        System.out.println(Arrays.toString(no13_2(a)));
        System.out.println(Arrays.toString(no13_2(b)));
        System.out.println(Arrays.toString(no13_2(c)));

        System.out.println("\n-----TASK 7 Solution 1------\n");

        int[] d = {1, 2, 3, 4};
        int[] e = {0, 2, 4, 1};
        int[] f = {5, 0, 6};
        System.out.println(Arrays.toString(arrFactorial(d)));
        System.out.println(Arrays.toString(arrFactorial(e)));
        System.out.println(Arrays.toString(arrFactorial(f)));


        System.out.println("\n-----TASK 8 Solution 1------\n");

        String g = "  ";
        String h = "abc123$#%";
        String i = "12ab$%3c%";
        System.out.println(Arrays.toString(categorizeCharacters(g)));
        System.out.println(Arrays.toString(categorizeCharacters(h)));
        System.out.println(Arrays.toString(categorizeCharacters(i)));
    }

    /* Task-1
    Requirement:
    -Create a method called noDigit()
    -This method will take one String argument and it will return a new String with all digits removed from the original String

    Test Data 1: “”
    Expected Result 1: “”

    Test Data 2: “Java”
    Expected Result 2: “Java”

    Test Data 3: “123Hello”
    Expected Result 3: “Hello”

    Test Data 4: “123Hello World149”
    Expected Result 4: “Hello World”

    Test Data 5: “123Tech456Global149”
    Expected Result 5: “TechGlobal”
    */


    // Task-1 Solution 1
    public static String noDigit_1(String s) {
        return s.replaceAll("[0-9]", "");
    }

    // Task-1 Solution 2
    public static String noDigit_2(String s) {
        String empty = "";
        for(int i = 0; i < s.length(); i++){
            if(!(Character.isDigit(s.charAt(i)))) empty += s.charAt(i);
        }
        return empty;
    }

    /* Task-2
    Requirement:
    -Create a method called noVowel()
    -This method will take one String argument and it will return a new String with all vowels removed from the original String

    Test Data 1: “”
    Expected Result 1: “”

    Test Data 2: “xyz”
    Expected Result 2: “xyz”

    Test Data 3: “JAVA”
    Expected Result 3: “JV”

    Test Data 4: “125$”
    Expected Result 4: “125$”

    Test Data 5: “TechGlobal”
    Expected Result 5: “TchGlbl”
    */

    // Task-2 Solution 1
    public static String noVowel_1(String s){
        return s.replaceAll("[aeiouAEIOU]", "");
    }

    // Task-2 Solution 2
    public static String noVowel_2(String s) {
        String empty = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u' &&
                    s.charAt(i) != 'A' && s.charAt(i) != 'E' && s.charAt(i) != 'I' && s.charAt(i) != 'O' && s.charAt(i) != 'U') empty += s.charAt(i);
        }
        return empty;
    }

    /* Task-3
    Requirement:
    -Create a method called sumOfDigits()
    -This method will take one String argument and it will return an int sum of all digits from the original String.

    NOTE: Return zero if there is no digits in the String

    Test Data 1: “”
    Expected Result 1: 0

    Test Data 2: “Java”
    Expected Result 2: 0

    Test Data 3: “John’s age is 29”
    Expected Result 3: 11

    Test Data 4: “$125.0”
    Expected Result 4: 8
     */

    // Task-3 Solution 1
    public static int sumOfDigits_1(String s){
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) number += Integer.parseInt("" + s.charAt(i));
        }
        return number;
    }

    //Task-3 Solution 2
    public static int sumOfDigits_2(String s){
        int number = 0;
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)) number += Integer.parseInt("" + c);
        }
        return number;
    }

    /* Task-4
    Requirement:
    -Create a method called hasUpperCase()
    -This method will take one String argument and it will return boolean true if there is an uppercase letter and false otherwise.

    Test Data 1: “”
    Expected Result 1: false

    Test Data 2: “java”
    Expected Result 2: false

    Test Data 3: “John’s age is 29”
    Expected Result 3: true

    Test Data 4: “$125.0”
    Expected Result 4: false
     */

    // Task-4 Solution 1
    public static boolean hasUpperCase_1(String s){
        boolean expect = false;
        for (char c : s.toCharArray()) {
            if(Character.isUpperCase(c)){
                expect = true;
                break;
            }
        }
        return expect;
    }

    // Task-4 Solution 2
    public static boolean hasUpperCase_2(String s){
        boolean expect = false;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))){
                expect = true;
                break;
            }
        }
        return expect;
    }

    /* Task-5
    Requirement:
    -Create a method called middleInt()
    -This method will take three int arguments and it will return the middle int.

    Test Data 1: 1, 1, 1
    Expected Result 1: 1

    Test Data 2: 1, 2, 2
    Expected Result 2: 2

    Test Data 3: 5, 5, 8
    Expected Result 3: 5

    Test Data 4: 5, 3, 5
    Expected Result 4: 5

    Test Data 4: -1, 25, 10
    Expected Result 4: 10
     */

    // Task-5 Solution 1
    public static int middleInt(int a, int b, int c){
        if(a <= b && b <= c) return b;
        else if(a == c) return a;

        int max = Math.max(Math.max(a,b),c);
        int min = Math.min(Math.min(a,b),c);

        if(a != max && a != min) return a;
        else if(b != max && b != min) return b;
        else return c;
    }

    // Task-5 Solution 2
    public static int middleInt_2(int a, int b, int c) {
        ArrayList<Integer> findMiddle = new ArrayList<>();
        findMiddle.add(a);
        findMiddle.add(b);
        findMiddle.add(c);
        Collections.sort(findMiddle);
        return findMiddle.get(1);
    }

    /* Task-6
    Requirement:
    -Create a method called no13()
    -This method will take an int array as argument and it will return a new array with all 13 replaced with 0.

    NOTE: Assume length will always be more than zero.

    Test Data 1: [1, 2, 3 ,4]
    Expected Result 1: [1, 2, 3 ,4]

    Test Data 2: [13, 2, 3 ]
    Expected Result 2: [0, 2, 3 ]

    Test Data 3:[13, 13, 13 , 13, 13]
    Expected Result 3: [0, 0, 0, 0, 0]
     */

    // Task-6 Solution 1
    public static int[] no13_1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 13) array[i] = 0;
        }
        return array;
    }

    public static int[] no13_2(int[] array) {
        int index = 0;
        for (int element : array) {
            if (element == 13) array[index++] = 0;
        }
        return array;
    }

    /* Task-7
    Requirement:
    -Create a method called arrFactorial()
    -This method will take an int array as argument and it will return the array with every number replaced with their factorials.

    NOTE: Assume length will always be more than zero.
    NOTE: 0! is equals to 1

    Test Data 1: [1, 2, 3, 4]
    Expected Result 1: [1, 2, 6, 24]

    Test Data 2: [0, 2, 4 , 1]
    Expected Result 2: [1, 2, 24, 1]

    Test Data 3:[5 , 0, 6]
    Expected Result 3: [120, 1, 720]
     */

    //Task-7 Solution 1
    public static int[] arrFactorial(int[] nums){

        for (int i = 0; i < nums.length; i++) { // { 5, 4, 3, 2, 1 } // 5 { 120,
            int factorial = 1; // then we reset our container after each  iteration
            for (int j = 2; j <= nums[i]; j++) {
                factorial *= j; // we find the factorial here
            }
            nums[i] = factorial; // then we are assigning our index of an element with our  new factorial number
        }
        return nums;

    }

    /*
    Requirement:
    -Create a method called categorizeCharacters()
    -This method will take String as an argument and return a String array as letters at index of 0, digits at index of 1 and specials at index of 2.
    NOTE: IGNORE SPACES

    NOTE: Assume length will always be more than zero.

    Test Data 1: “     ”
    Expected Result 3: [ , , ]

    Test Data 2: “abc123$#%”
    Expected Result 2: [abc, 123, $#%]

    Test Data 3: “12ab$%3c%”
    Expected Result 3: [abc, 123, $%%]
     */

    // Task-8 Solution 1
    public static String[] categorizeCharacters(String s){
        String letters = "";
        String numbers = "";
        String specials = "";

        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))) letters += s.charAt(i);
            else if(Character.isDigit(s.charAt(i))) numbers += s.charAt(i);
            else if(!(Character.isWhitespace(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(i)))) specials += s.charAt(i);
        }
        String[] category = new String[3];
        category[0] = letters;
        category[1] = numbers;
        category[2] = specials;
        return category;
    }
}
