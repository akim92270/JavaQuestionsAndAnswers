package loops;

public class UnderstandingLoops {
    public static void main(String[] args) {

        /*
        Write a Java program to print “Hello” 5 times
        Print it 20 times
        Add World later
         */

        /*
        SYNTAX:
        for(start; termination; update){
            //Block of code to execute
            }
         */
        for(int count = 1; count <= 5; count ++){
            System.out.println("Hello");
        }

        System.out.println("End of the program");
    }
}
