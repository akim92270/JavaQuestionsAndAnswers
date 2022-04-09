package homeworks;

import utilities.CharacterHelper;

import java.util.Scanner;

public class Homework11Review {
    public static void main(String[] args) {
        /*
        1. Scanner for Full Name
        2. Create a counter outside the loop
        3. create a fori loop check EVERY SINGLE CHAR if they are vowel count.
        4. print out "There are 3 vowel letters in this full name.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your Full Name");
        String fullName = scan.nextLine();

        int count = 0;
        for (int i = 0; i < fullName.length(); i++) { //0,1,.....)
            if(CharacterHelper.isVowel(fullName.charAt(i)))
                count++;
        }
        System.out.println("There are " + count + "vowel letters in this full name.");

        /*

        1. Do while Loop at least once run
        2. Create a scanner and add them to sum and if they are more than 100 or equal sout (Sum of the entered number)
        3. Create a container for attempt (counter), sum, and number
         */

        int num = 0; // for getting a number from user
        int sum = 0; //for getting the SUM of given NUMBERS
        int attempt = 1; //for checking how many TIMES this loop has run
        do {
            System.out.println("Please enter a number");
            num = scan.nextInt();

            if(attempt == 1 && num >= 100){
                System.out.println("This number is already more than 100");
                break;
            }else{
                sum += num;
                if(sum >= 100)
                    System.out.println("Sum of the entered numbers is at least 100");
                }
            attempt++;
        }while(sum < 100);


        System.out.println("\nTask9\n");

        /*
        1. two containers for 0,1 and another one for the sum, String for message
        2. Create a fori loop run 'n' times
        3. print out the series
         */

        int n1 = 0;
        int n2 = 1;
        int total = 0;
        String message = "";

        /*

        n1 n2 total
        i = 0
         */

        for (int i = 0; i < 7; i++) {


        }
    }
}
