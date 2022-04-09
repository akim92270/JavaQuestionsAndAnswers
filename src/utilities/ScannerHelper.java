package utilities;

import java.util.Scanner;

public class ScannerHelper {

    public static int getNumberFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scan.nextInt();
        scan.nextLine();
        return number;
    }

    public static String getANameFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a Name: ");
        String name = scan.nextLine();
        return name;
    }

    public static String getAStringFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String string = scan.nextLine();
        return string;
    }

    public static String getASentenceFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String getASentenceFromUser = scan.nextLine();
        return getASentenceFromUser;
    }
    public static String getAddressFromUser() {
         Scanner scan = new Scanner(System.in);
         System.out.println("Please enter your full address: ");
         String getAddressFromUser = scan.nextLine();
         return getAddressFromUser;
    }
    public static String getColor() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 4 colors below");
        String getColor = scan.nextLine(), getColor1 = scan.nextLine(), getColor2 = scan.nextLine(), getColor3
                = scan.nextLine();
        return getColor + getColor1 + getColor2 + getColor3;
    }
    public static String getColor3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 colors below");
        String getColor = scan.nextLine(), getColor1 = scan.nextLine(), getColor2 = scan.nextLine();
        return getColor + getColor1 + getColor2;
    }
}
