package homeworks;

public class Homework21 {

    public static void main(String[] args) {
        System.out.println("-----Task-1----------");

        fizzBuzz1(15);

        System.out.println("-----Task-2----------");

        System.out.println(fizzBuzz2(0));
        System.out.println(fizzBuzz2(17));

        System.out.println("-----Task-3----------");

        System.out.println(findSumNumbers("abc$"));
        System.out.println(findSumNumbers("a1b4c  6#"));
        System.out.println(findSumNumbers("ab110c045d"));
        System.out.println(findSumNumbers("525"));

        System.out.println("-----Task-4----------");

        System.out.println(findBiggestNumber("abc$"));
        System.out.println(findBiggestNumber("a1b4c  6#"));
        System.out.println(findBiggestNumber("ab110c045d"));
        System.out.println(findBiggestNumber("525"));

        System.out.println("-----Task-5----------");

        System.out.println(countSequenceOfCharacters(""));
        System.out.println(countSequenceOfCharacters("abc"));
        System.out.println(countSequenceOfCharacters("abbcca"));
        System.out.println(countSequenceOfCharacters("aaAA"));
    }

    /*
    Requirement:
    -Create a method called fizzBuzz1()
    -This method will take an int argument, and it will print numbers starting from 1 to given argument.
    BUT, it will print “Fizz” for the numbers divided by 3, “Buzz” for the numbers divided by 5, and “FizzBuzz” for the numbers divided both by 3 and 5.
     */

    //Task-1
    public static void fizzBuzz1(int num) {
        for (int i = 0; i <= num; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else System.out.println(i);
        }
    }


    /*
    Requirement:
    -Create a method called fizzBuzz2()
    -This method will take an int argument, and it will return a String. BUT it will return “Fizz” if the given number is divided by 3,
    “Buzz” if the number is divided by 5, and “FizzBuzz” if the number is divided both by 3 and 5. Otherwise, it will return number itself.

    Test Data 1: 0
    Expected Result 1: FizzBuzz

    Test Data 2: 1
    Expected Result 2: 1

    Test Data 3: 3
    Expected Result 3: Fizz

    Test Data 4: 5
    Expected Result 4: Buzz

    Test Data 5: 15
    Expected Result 5: FizzBuzz
     */

    //Task-2
    public static String fizzBuzz2(int num) {
        if (num % 15 == 0) return "FizzBuzz";
        else if (num % 5 == 0) return "Buzz";
        else if (num % 3 == 0) return "Fizz";
        return String.valueOf(num);
    }

    /*
    Requirement:
    -Create a method called findSumNumbers()
    -This method will take a String argument and it will return an int which is the sum of all numbers presented in the String.

    NOTE: If there are no numbers represented in the String, return 0.
     */

    //Task-3
    public static int findSumNumbers(String str) {
        int sum = 0;
        String store = "0";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) store += str.charAt(i);
            else {
                sum += Integer.parseInt(store);
                store = "0";
            }
        }
        return sum + Integer.parseInt(store);
    }

    /*
    Requirement:
    -Create a method called findBiggestNumber()
    -This method will take a String argument and it will return an int which is the number presented in the String.

    NOTE: If there are no numbers represented in the String, return 0.
     */

    //Task-4

    public static int findBiggestNumber(String str) {
        int max = Integer.MIN_VALUE;
        for (String element : str.replaceAll("[^0-9]", " ").split(" ")){
            if(!element.isEmpty()){
                if(Integer.parseInt(element) > max) max = Integer.parseInt(element);
                return max;
            }
        }
        return 0;
    }

    //Task-5

    public static String countSequenceOfCharacters(String str) {
        String sequence = "";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            if (!sequence.contains(str.charAt(i) + "")) {
                sequence += str.charAt(i);
                sequence += count;
                count = 1;
            }
        }
        return sequence;
    }
}
