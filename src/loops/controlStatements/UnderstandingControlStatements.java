package loops.controlStatements;

public class UnderstandingControlStatements {
    public static void main(String[] args) {
        /* Write a program that prints all the number between 1 - 25.
        But skip the numbers that can be divided by 10.
        Now do not print any numbers that are more than 15.
        */

        for (int i = 1; i <= 25; i++){
            if (i % 10 == 0) continue; // continue; control statement is used here to
                // skip any iteration where numbers % 10 and goes to next iteration (next number)
            else System.out.println(i); // skipped iteration 10 and iteration 20
            if (i >= 15) break; // break; control statement here will stop the loop
            // when the number is >= 15 (doesn't run until previous termination point -- i <= 25)
        }
    }
}
