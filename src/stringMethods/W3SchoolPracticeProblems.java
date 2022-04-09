package stringMethods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class W3SchoolPracticeProblems {
    public static void main(String[] args) {
/*

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a = scan.nextInt();
        System.out.println("Please enter another number");
        int b = scan.nextInt();
        System.out.println("Please enter a final number");
        int c = scan.nextInt();
        System.out.println(Math.min(Math.min(a, b),c));

        System.out.println((a + b + c) / 3);

        System.out.println("Please enter characters");
        String str = scan.nextLine();
        if(str.length() % 2 == 0) {
            System.out.println(str.length()/2);
        }else
            System.out.println(str.length()/2);

*/


        String s = "";
        String X = "abccat";

        for(int i = 0; i < X.length(); i++){


                if((i<X.length()-1) && X.charAt(i) != X.charAt(i+1)) {
                s+=X.charAt(i) ; }
            else {
                if(X.charAt(i) == X.charAt(i-1))s+=X.charAt(i);
                s+= X.charAt(X.length()-1);
            }

        }

        System.out.println(s);
    }
}
