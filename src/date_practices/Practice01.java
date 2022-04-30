package date_practices;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter their date of birth year
        Then calculate their age and print with the message below

        EXPECTED OUTPUT:
        You are {age} years old!

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your birth year");
        int birthYear = scan.nextInt();

        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");


        System.out.println(currentDate);
        System.out.println("You are " + (Integer.parseInt(dateFormat.format(currentDate))-birthYear) + " years old!");

        /* one-line
        System.out.println("Hey, please enter your year of birth");
        System.out.println("You are " + (Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date())) - new Scanner(System.in).nextInt()) + " years old!");
         */
    }
}
