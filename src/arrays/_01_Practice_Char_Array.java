package arrays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import utilities.CharacterHelper;

import java.util.Arrays;

public class _01_Practice_Char_Array {
    public static void main(String[] args) {


        System.out.println("\n----------------------------Task-1-------------------\n");
        char[] chars = {'#', '$', '5', 'A', 'b', 'H'};
        System.out.println(Arrays.toString(chars));

        System.out.println("\n----------------------------Task-2-------------------\n");
        System.out.println("The size of the array is = " + chars.length);

        System.out.println("\n----------------------------Task-3-------------------\n");
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        System.out.println("\n----------------------------Task-4-------------------\n");
        for (char i : chars) {
            System.out.println(i);
        }

        System.out.println("\n----------------------------Task-5-------------------\n");
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) System.out.println(i);

        }
        System.out.println("\n----------------------------Task-6-------------------\n");
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) count++;
        }

        System.out.println(count);


        /*
        EXTRA PRACTICES
        Count lowercase letters
        Count digits
        Count spaces
        Count specials
         */

    }
}
