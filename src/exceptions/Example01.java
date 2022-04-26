package exceptions;

public class Example01 {
    public static void main(String[] args) {

        String[] names = {"Alex", "John", "Max"};

        //How to handle the exception
        try {
            System.out.println(names[-5]); //ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            e.printStackTrace(); //handle a throw exception
        }
        System.out.println("End of the program!");
    }
}
