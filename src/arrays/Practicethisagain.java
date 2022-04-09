package arrays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class Practicethisagain {
    public static void main(String[] args) {

        /*
        TASK-1
        Create a char array and store values below
        #
        $
        5
        A
        b
        H
        Print the array
        EXPECTED:
        [#, $, 5, A, b, H]

         */

        char[] letters = {'#', '$', '5', 'A', 'b', 'H'};
        System.out.println("\n-----------Task-1-----------\n");
        System.out.println(Arrays.toString(letters));


        /*TASK-2
        Print the size of the array with a message
        EXPECTED:
        The size of the array is = 6

*/      System.out.println("\n-----------Task-2-----------\n");
        System.out.println(letters.length);

        /*
        TASK-3
        Print each element using fori loop
        EXPECTED:
        #
        $
        5
        A
        b
        H
        */
        System.out.println("\n-----------Task-3-----------\n");
        for (int i = 0; i < letters.length; i++){
            System.out.println(letters[i]);
        }
        /*
        TASK-4
        Print each element using for each loop
        EXPECTED:
        #
        $
        5
        A
        b
        H
        */

        System.out.println("\n-----------Task-4-----------\n");
        for(char chars : letters){
            System.out.println(chars);
        }
        /*
        TASK-5
        Print each element that are letters
        EXPECTED:
        A
        b
        H
        */

        System.out.println("\n-----------Task-5 foreach-----------\n");

        for(char chars : letters){
            if(Character.isLetter(chars)) System.out.println(chars);
        }

        System.out.println("\n-----------Task-5 fori-----------\n");

        for (int i = 0; i < letters.length; i++) {
            if(Character.isLetter(i)) System.out.println(letters[i]);
        }


/*
        TASK-6
        Count how many uppercase characters you have in the array
        EXPECTED:
        2
        */

        System.out.println("\n-----------Task-6 foreach-----------\n");

        int uppercase = 0;
        for(char chars : letters){
            if(Character.isUpperCase(chars)) uppercase++;
        }
        System.out.println(uppercase);

/*
         EXTRA PRACTICES
        Count lowercase letters
        Count digits
        Count spaces
        Count specials
         */
    }
}
