package homeworks;

import utilities.ScannerHelper;

import java.util.Scanner;

public class PracticeAgain {
    public static void main(String[] args) {

        /*
        TASK-1
        Requirement:
        Assume that you are given a String as below;
        String str = "SDLC is step-by-step procedure to create an application";
        Write a program to find length of given String and the indexes of “SDLC” and “application” words


        String str = "SDLC is step-by-step procedure to create an application";
        System.out.println("The length of the first word is = " + str.length());
        System.out.println("The index of \''SDLC\' word is = " + str.indexOf("SDLC"));
        System.out.println("The index of \'application\' is = " + str.indexOf("application"));





        /*
        TASK-2
        Requirement:
        Assume that you are given a String as below;
        String str = "  I know how to code with Python  ";

        •Write a program to manipulate given String and convert it to be:
        "I KNOW HOW TO CODE WITH JAVA"

        1.
        replace Python with java
        then trim and convert to uppercase

        2.trim and convert to uppercase

        String str = ("  I know how to code with Python  " +
                "").toUpperCase().trim().replace("PYTHON", "JAVA");
        System.out.println(str);
        /*
        TASK-3
        Requirement:
        Assume that you are given a String as below;
        String str = "     SDLC has planning, design, development, testing, deployment and maintenance phases   ";
        1.Find the first character of given String which is not white space
        2.Find the last character of given String which is not white space

        String str = "     SDLC has planning, design, development, testing, deployment and maintenance phases   ".trim();
        System.out.println("The first character is = " + str.charAt(0));
        System.out.println("The last character is = " + str.charAt(str.length()-1));

        TASK-4
        Requirement:
        Assume you are given 3 Strings as below;
        String s1 = “  TECH ”;
        String s2 = “ glo  ”;
        String s3 = “ BAL       “;
        Write a program that manipulates these 3 Strings and stores them in a
        new String s4 and s4 will get value of “TechGlobal”
        Note: The length of s4 will be 10 at the end!!!


        String s1 = "  TECH ".toLowerCase().trim().replace("t","T");
        String s2 = " glo  ".trim().replace("g","G");
        String s3 = " BAL       ".toLowerCase().trim();
        String s4 = s1 + s2 + s3;
        System.out.println(s4);


        TASK-5
        Requirement:
        Write a program that asks user to enter their favorite color.
        Then, print the first and last characters of the color
        Also, print the first and last 3 characters of the color

        Test data:
        green
        Expected output:
        First character is = g
        Last character is = n
        First 3 characters are = gre
        Last 3 characters are = een


        String a = ScannerHelper.getColor();
        System.out.println("The first character is = " + a.charAt(0));
        System.out.println("The last character is = " + a.charAt(a.length()-1));
        System.out.println("The first 3 character is = " + a.substring(0,3));
        System.out.println("The last 3 character is = " + a.substring(a.length()-3));




        TASK-6
        Requirement:
        Write a program that asks user to enter a full sentence
        Then, convert all sentence to lower case and print the first and last words in the given sentence

        Test data:
        JavA is an object-oriented programming LanguAGE
        We practice today

        Expected output:
        First word is = java - we
        Last word is = language - today

         */


        String sentence = ScannerHelper.getAStringFromUser().toLowerCase();
        System.out.println(sentence.substring(0, sentence.indexOf(' ')));
        System.out.println(sentence.substring(sentence.lastIndexOf(' ')+1));



        /*
        TASK-7
        Requirement:
        Write a program that asks user to enter a full sentence
        Then, check if given sentence contains $ character
        If it contains $ character, then find the index of the $ character and print a proper message for the found index

        Test data 1:
        I saved $100 to buy new airpods

        Expected output 1:
        This sentence contains $ character
        $ character’s index is = 8

        Test data 2:
        I’ll become a Software Engineer in Test

        Expected output 2:
        This sentence does not contain $ character
         */
        //if $

        String sentence1 = ScannerHelper.getAStringFromUser().trim().toLowerCase();

        System.out.println(sentence1.contains("$"));
        System.out.println(sentence1.indexOf('$'));
    }
}
