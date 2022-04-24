package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {

        System.out.println(Pattern.matches("[a-z]+","hello))")); //true --> contains 1 or more letters
        System.out.println(Pattern.matches("[a-zA-Z]+","hello))")); //true --> contains 1 or more letters
        Pattern pattern = Pattern.compile("[a-zA-z0-9_-]{8,15}");
        Pattern.matches("[a-z] + ", "hello");

        System.out.println(Pattern.matches("\\([1-9]{3}\\)-[0-9]{3}-[0-9]{4}", "(123)-343-3240"));





    }
}
