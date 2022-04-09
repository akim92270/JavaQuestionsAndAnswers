package stringMethods;

public class _09_trim {
    public static void main(String[] args) {
        /*
        Method task: Remove whitespaces from both ends of a String
        non-static and we called w/ object name
        return type and returns a String
        It doesn't take any arguments

        Note:TRIM() method will not remove any extra space between the words
         */

        String str = "            Hello";

        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.trim());
        System.out.println(str.trim().length());

        String str2 = "    Good          Morning    ";
        String str3 = str2.trim();

        System.out.println(str3);

    }
}
