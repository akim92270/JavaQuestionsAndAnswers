package homeworks;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework09 {
    public static void main(String[] args) {

        System.out.println("Task-1");

        String name = ScannerHelper.getANameFromUser();
        System.out.println("The length of the name is = " + name.length() + "\nThe first character in the name is " +
                name.charAt(0) + "\nThe The last character in the name is " + name.charAt(name.length() - 1) +
                "\nThe first 3 characters in the name are = " + name.substring(0, 3) + "\nThe last 3 characters in the " +
                "name are = " + name.substring(name.length()-3));

        if (name.startsWith("a") || name.startsWith("A")){
            System.out.println("You are in the club!");
        }else{
            System.out.println("Sorry, you are not in the club");
        }

        System.out.println("\nTask-2");
        String address = ScannerHelper.getAddressFromUser();
        if(address.toLowerCase().contains("chicago")) System.out.println("You are in the club");
        else if (address.toUpperCase().contains("CHICAGO")) System.out.println("You are in the club");
        else if(address.toLowerCase().contains("des plaines")) System.out.println("You are welcome to join to the club");
        else if(address.toUpperCase().contains("DES PLAINES")) System.out.println("You are welcome to join to the club");
        else System.out.println("You are not in the club");



        System.out.println("\nTask-3");
        String colors = ScannerHelper.getColor().trim().toLowerCase();

        if(colors.contains("red") && colors.contains("green")) System.out.println("Green and red are in the list");
        else if(colors.contains("red")) System.out.println("Red is in the list");
        else if(colors.contains("green")) System.out.println("Green is in the list");
        else System.out.println("Green and red are not in the list");

        System.out.println("\nTask-4");

        String str = ScannerHelper.getASentenceFromUser();
        //"   Java is FUN   ";
        String str1 = str.trim().toLowerCase();
        String first = str1.substring(0,str1.indexOf(' '));
        String middle = str1.substring(5,7);
        String last = str1.substring(str1.lastIndexOf(' ')+1);

        System.out.println("The first word in the str is = " + first + "\nThe second word in the str is = " +
                middle + "\nThe third word in the str is = " + last);



    }
}