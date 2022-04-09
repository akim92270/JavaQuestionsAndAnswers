package homeworks;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {

        System.out.println("Task-1");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = scan.nextLine();

        if(str.length() >= 1){
            System.out.println("Length is = " + str.length());
            System.out.println("First char is = " + str.charAt(0));
            System.out.println("Last char is = " + str.charAt(str.length()-1));
            if(str.contains("a") || str.contains("e") || str.contains("i") || str.contains("u") ||
                    str.contains("o"));
                System.out.println("This String has vowel");
        }else{
                System.out.println("Length is zero");

        }
        System.out.println("\nTask-2");

        System.out.println("Please enter a string");
        String s1 = scan.nextLine();

        if(s1.length() >= 3){
            if(s1.length() % 2 == 0)
                System.out.println("" + s1.charAt(s1.length()/2 - 1) +
                        s1.charAt(s1.length() / 2)); //find middle character
            else
                System.out.println(s1.charAt(s1.length()/2));
        }else{
            System.out.println("Length is less than 3");//
        }

        System.out.println("\nTask-3");

        String str1 = scan.nextLine();
        System.out.println("Please enter a string");
        if(str1.length() >= 4){

            String first2 = str1.substring(0,2);
            String last2 = str1.substring(str1.length()-2);
            String middle2 = str1.substring(2, str1.length()-2);
            System.out.println("First 2 characters are = " + first2);
            System.out.println("Last 2 characters are = " + last2);
            System.out.println("The other characters are = " + middle2);
        }else{
            System.out.println("INVALID INPUT"); //length not more than 4
        }
        System.out.println("\nTask-4");


        System.out.println("Please enter a string");
        String str2 = scan.nextLine();

        if(str2.length() >= 2){
            String firstChar2 = str2.substring(0,2);
            String lastChar2 = str2.substring(str2.length()-2);
            if(firstChar2.equals(lastChar2)) {
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }else
            System.out.println("Length is less than 2");

        System.out.println("\nTask-5");

        String c1 = ScannerHelper.getAStringFromUser();
        String c2 = ScannerHelper.getAStringFromUser();

        if(c1.length() < 2 || c2.length() < 2){
            System.out.println("Invalid input!");
        }else{
            String strc1 = c1.substring(1,c1.length()-1);
            String strc2 = c2.substring(1,c2.length()-1);
            System.out.println(strc1 + strc2);
        }
        System.out.println("\nTask-6");
        String len = ScannerHelper.getAStringFromUser();
        if(len.length() >= 4 && len.startsWith("xx")) {
            if (len.startsWith("xx"))
                System.out.println("true");
            else if (len.endsWith("xx"))
                System.out.println("true");
            else
                System.out.println("false");
        }else
                System.out.println("INVALID INPUT");
    }
}
