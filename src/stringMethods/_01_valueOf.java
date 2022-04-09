package stringMethods;

public class _01_valueOf {
    public static void main(String[] args) {
     /*
        Method Task: Convert given variable to a String
        Static - you can call it with class name
        Return - returns a string
        It takes arguments as it is overloaded and converts given args to a String
      */
        int i = 5;

        String num = String.valueOf(i); //num = 5

        System.out.println(i + i); //10
        System.out.println(num + num); //55
    }
}
