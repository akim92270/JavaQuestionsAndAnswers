package methods;

import utilities.CharacterHelper;

public class CharacterHelperPractice {
    /*
    Project 04
    utilities -> characterHelper
    public class CharacterHelper {
    1. What is a method? Function or behaviors of the class.
    Invoke the code of block usually in the form of curly braces {}.
    How many methods are there? 2. Return and void

    2. How do we know it is static & non-static? Static methods are called or invoked with
     class name & non-static we invoked with objectName

    3. What is return type? return type specifies what type of value the method will return

    4. What is an argument? What is this also known as? Parameters; they act as variables inside the method.

    TASK-1
    -Create a method called isSpace()
    -It should be public and static
    -It should be a return type and must return a boolean
    -It should take a char argument
    -It should return true if the given char is space, return false if the given char is not a space

    public static boolean isSpace(char c) {
        if (c == ' '){
            return true;
        }else{
            return false;
        }

    public static boolean isSpace(char c) {
            return c == ' ';
        }

    public static boolean isSpace(char c) {
        return (c == ' ') ? true : false;
    TASK-2
    -Create a method called isDigit()
    -It should be public and static
    -It should be a return type and must return a boolean
    -It should take a char argument
    -It should return true if the given char is a digit, return false if the given char is not a digit
    NOTE: Digits are represented from 48 to 57 in the ASCII Table

    public static boolean isDigit(char c) {
            return c >= 48 && c <= 57;
        }

    TASK-3
    -Create a method called isUppercase()
    -It should be public and static
    -It should be a return type and must return a boolean
    -It should take a char argument
    -It should return true if the given char is an uppercase letter, return false if the given char is not an uppercase letter
    NOTE: Uppercase letters are represented from 65 to 90 in the ASCII Table

    public static boolean isUppercase(char c) {
            return c >= 65 && c <= 90;
        }

    TASK-4
    -Create a method called isLowercase()
    -It should be public and static
    -It should be a return type and must return a boolean
    -It should take a char argument
    -It should return true if the given char is a lowercase letter, return false if the given char is not a lowercase letter
    NOTE: Lowercase letters are represented from 97 to 122 in the ASCII Table

    public static boolean isLowercase(char c) {
            return c >= 97 && c <= 122;
        }

    TASK-5
    -Create a method called isLetter()
    -It should be public and static
    -It should be a return type and must return a boolean
    -It should take a char argument
    -It should return true if the given char is a letter, return false if the given char is not a letter
    NOTE: Letters are represented from 65 to 90 and from 97 to 122 in the ASCII Table

    public static boolean isLetter(char c) {
            return isUppercase(c) || isLowercase(c);
        }

    TASK-6
    -Create a method called isVowel()
    -It should be public and static
    -It should be a return type and must return a boolean
    -It should take a char argument
    -It should return true if the given char is a vowel letter, return false if the given char is not a vowel letter
    NOTE: Vowel letters are A,E,O,U,I,a,e,o,u,i

    public static boolean isVowel(char c) {
            return c == 'A' || c == 'E' || c == 'I'
                    || c == 'O' || c == 'U' ||
                    c == 'a' || c == 'e' || c == 'i' ||
                    c == 'o' || c == 'u' ;
        }

    TASK-7
    -Create a method called isConsonant()
    -It should be public and static
    -It should be a return type and must return a boolean
    -It should take a char argument
    -It should return true if the given char is a consonant letter, return false if the given char is not a consonant letter
    NOTE: Consonant letters are any number represented from 65 to 90 and from 97 to 122 in the ASCII Table but not vowels (A,E,O,U,I,a,e,o,u,i) or specials etc.

    public static boolean isConsonant(char c) {
            return isLetter(c) && !isVowel(c);
        }
     */

    public static void main(String[] args) {

        char a = '7';
        System.out.println(" is a digit = " + CharacterHelper.isDigit(a));

        char b = 'F';
        System.out.println(b + " letter is uppercase = " + CharacterHelper.isUppercase(b));

        char c = 'L';
        System.out.println(c + " letter is lowercase = " + CharacterHelper.isLowercase(c));

        char d = 'y';
        System.out.println(d + " is a letter = " + CharacterHelper.isLetter(d));

        char e = 'i';
        System.out.println(e + " is a vowel = " + CharacterHelper.isVowel(e));

        char f = 'o';
        System.out.println(f + " is a consonant = " + CharacterHelper.isConsonant(f));
    }
}
