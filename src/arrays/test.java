package arrays;

import java.util.*;

public class test {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        int small2 = Integer.MAX_VALUE;

        int[] numbers = {1, 23, 43, 24, 3, 235, 132, 32};
        for (int number : numbers) {
            if (number < small) {
                small2 = small;
                small = number;
            } else if (number < small2 && number != small) small2 = number;
        }
        for (int number : numbers) {
            if (number > max) {
                max2 = max;
                max = number;
            } else if (number > max2 && number != max) max2 = number;
        }
        System.out.println(small2);
        System.out.println(max2);
        System.out.println(small);
        System.out.println(max);
    }
}
