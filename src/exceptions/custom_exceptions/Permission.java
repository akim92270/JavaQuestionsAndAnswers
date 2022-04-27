package exceptions.custom_exceptions;

import java.util.Scanner;

public class Permission {
        /*
        Create a method that checks the age of user, takes an argument int age
        if age is more than 16, "it is allowed to have driver licence"
        if the age is less than 16, the method will throw an exception
        "Age of {age} is not allowed to have driver licence"
         */

    public static void checksAge(int age) {
        if (age >= 16) System.out.println("it is allowed to have driver licence");
        else throw new RuntimeException("Age of " + age + " is not allowed to have driver licence");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey User enter your age");
        int age = scan.nextInt();

        try{
            checksAge(age);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Your age is = " + age);
        }
        System.out.println("End of Program");
    }
}
