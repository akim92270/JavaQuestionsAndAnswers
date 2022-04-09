package arrays;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        int[] numbers = new int[7];
        numbers[0] = 8;
        numbers[1] = 4;
        numbers[2] = 15;
        numbers[3] = 34;
        numbers[4] = 1;
        numbers[5] = 2;
        numbers[6] = 83;

        int sum = 0;
        for (int i = 0; i < 5; i++){
            sum += numbers[i];

        }System.out.println(sum);




    }
}
