package exceptions;

public class Example02 {
    public static void main(String[] args) {

        int number = 45;

        try {
            //System.out.println(number / 3); //15
            String s = null;
            System.out.println(s.startsWith("abc")); //NullPointerException
            System.out.println(number / 0); //ArithmeticException
            System.out.println("abc".charAt(15)); //StringIndexOutOfBoundsException
        }
        catch (Exception e) {
            e.printStackTrace(); //handle a throw exception
        }
        System.out.println("End of the program!");
    }
}
