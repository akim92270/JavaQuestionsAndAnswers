package homeworks;

import utilities.CharacterHelper;
import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {

        System.out.println("Task-1\n");
        String s = "";
        // use string container here bc you want to store the results as a String to use string
        // methods in sout

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) s += i + " - "; // results of each iteration
        }
        System.out.print(s.substring(0, s.length() - 3)); // substring method can be used bc results
        // is converted to strings

        System.out.println("\n\nTask-2\n");
        //Prints numbers that are diviable by 2 and 3 starting from 1-50.
        String s1 = "";
        for(int i = 1; i <= 50; i++)
            if(i % 2 == 0 && i % 3 == 0) s1 += i + " - ";

        System.out.print(s1.substring(0, s1.length()-3));

        System.out.println("\n\nTask-3\n");
        String s2 = "";
        for(int i = 100; i >= 50; i--)
            if(i % 5 == 0) s2 += i + " - ";

        System.out.print(s2.substring(0,s2.length()-3));

        System.out.println("\n\nTask-4\n");
        //squared starting from 0 - 7
        for (int i = 0; i <= 7; i++) {
            System.out.println("The square of 0 is = " + i * i);

        }
        System.out.println("\n\nTask-5\n");
        //find sum of numbers starting from 1 to 10
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("\n\nTask-6\n");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int positiveNumber = scan.nextInt();
        scan.nextLine();

        int factorial = 1;
        for (int i = 1; i <= positiveNumber; i++){
            factorial *= i;
        }
        System.out.println(factorial);

        System.out.println("\n\nTask-7\n");
        System.out.println("Program: Please enter your full name");
        String firstNameLastName = scan.nextLine();
        int count = 0;
        for (int i = 0; i <= firstNameLastName.length()-1; i++) {
            if (firstNameLastName.charAt(i) == 'A' || firstNameLastName.charAt(i) == 'E' || firstNameLastName.charAt(i) == 'I'
                    || firstNameLastName.charAt(i) == 'O' || firstNameLastName.charAt(i) == 'U' ||
                    firstNameLastName.charAt(i) == 'a' || firstNameLastName.charAt(i) == 'e' || firstNameLastName.charAt(i) == 'i' ||
                    firstNameLastName.charAt(i) == 'o' || firstNameLastName.charAt(i) == 'u')
            count++;

        }
        System.out.println("There are " + count + " vowel letters in this full name");


        System.out.println("\n\nTask-8\n");


        //if num < 100
        //ask another number and find the sum of 2 numbers.


        //else keep asking user to enter number until sum is at least 100


        // if more than 100
        // this number is already move than 100

        int count1 = 0;
        do {
            System.out.println("Please enter a number");
            Scanner scan1 = new Scanner(System.in);
            int number = scan1.nextInt();
            if (number >= 100){ System.out.println("This number is already is more than 100");
        }
        number++;
        count1 += number;
        }while(count1 < 100);
        System.out.println("Sum of the entered number is at least 100");


        System.out.println("\n\nTask-9\n");
        //Did not get it

        System.out.println("\n\nTask-10\n");
        //Did not get it

        Scanner scan2 = new Scanner(System.in);

        String name;
        int attempt = 1;
        do {
            if(attempt == 1) System.out.println("Please enter a name");
            else{
                System.out.println("Please enter a name");
            }
            name = scan2.nextLine();
            attempt++;
        }while(name.startsWith("j") || name.startsWith("J"));
        System.out.println("End of Program");

    }
}

