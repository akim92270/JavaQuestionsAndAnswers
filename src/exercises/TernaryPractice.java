package exercises;

import java.util.Scanner;

public class TernaryPractice {
    public static void main(String[] args) {

        /*
        (expression) ? (action)if it is true : (action)if it is false;

        Write a program that asks user their height
        if their height is lower than 5 ft print out "You can't go to roller coaster"
        else print out "You are tall"
         */

        System.out.println("Enter your height");
        Scanner scan = new Scanner(System.in);

        String printOut = (scan.nextInt() >= 5) ? "You are tall" : "You can't go to roller coaster";
        System.out.println(printOut);

        /*
        Write a program that asks user their balance
        if their balance is lower than $50 print out "You are poor"
        else print out "You are not poor"
         */
        System.out.println("Enter your balance");
        System.out.println((scan.nextDouble() >= 50) ? "You are not poor" : "You are poor");
        }
    }

