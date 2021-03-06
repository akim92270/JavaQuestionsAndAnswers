package methods;

import utilities.MathHelper;
import utilities.ScannerHelper;

import java.util.Scanner;

public class FindIfNumberIsPosNegOrZero {
    public static void main(String[] args) {
        /*
        Ask user to enter an any number
        -Print "The number is positive" if the user enters a positive number
        -Print "The number is negative" if the user enters a negative number
        -Print "The number is zero" if the user enters zero
         */
        int num = ScannerHelper.getNumberFromUser(); // returns an int

        // String name = ScannerHelper.getNumberFromUser();
        // System.out.println(name + " 's age is " + num);

        if(MathHelper.isPositive(num)){
            System.out.println("The number is positive");
        }else if(MathHelper.isNegative(num)){
            System.out.println("The number is negative");
        }else{
            System.out.println("The number is zero");
        }
    }
}
