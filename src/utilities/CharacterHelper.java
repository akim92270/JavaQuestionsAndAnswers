package utilities;

public class CharacterHelper {
    public static boolean isSpace(char c) {
        return (c == ' ');
    }

    public static boolean isSpace1(char c) {
        return c == ' ' ? true : false;
    }
    public static boolean isDigit(char c) {
        return (c >= 48 && c <= 57);
    }
    public static boolean isDigit1(char c) {
        return (c >=48 && c <= 57) ? true : false;
    }

    public static boolean isUppercase(char c) {
        return (c >= 65 && c <= 90);
    }

    public static boolean isLowercase(char c) {
        return (c >= 97 && c <= 122);
    }

    public static boolean isLetter(char c) {
        return isUppercase(c) || isLowercase(c);
    }

    public static boolean isVowel(char c) {
        if (c == 'A' || c == 'E' || c == 'I'
                || c == 'O' || c == 'U' ||
                c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u') ;
        return true;
    }

    public static boolean isConsonant(char c) {
        return isLetter(c) && !isVowel(c);
    }

    public static void isVowel() {
    }
}