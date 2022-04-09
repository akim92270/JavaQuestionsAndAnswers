package stringMethods;

import utilities.ScannerHelper;
import utilities.StringHelper;

import java.util.Scanner;

public class PracticeSubString {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a sentence (multiple words)
        Find and print first and the last words from the given sentence.

        Test data1:
        I like Java

        Expected output:
        The first word is = I
        The last word is = Java

        Test data2:
        Today is Sunday

        Expected output:
        The first word is = Today
        The last word is = Sunday


        I like Java
        Today is Sunday
        Many students preferring to study after the class

        First word -> 0 - indexOf (' ')
        Last word -> lastIndexOf(' ') + 1 to the end


        First space - last space
        Everything before the first space is my first word
        Everything after the last space is my last word

         */


        String sentence = ScannerHelper.getASentenceFromUser();

        String first = sentence.substring(0,sentence.indexOf(' '));
        String last = sentence.substring(sentence.lastIndexOf(' ')+1);

        System.out.println("First word is = '" + first + "'");
        System.out.println("Last word is = '" + last + "'");
    }
}
