package arrays;

public class fibonacci {
    public static void main(String[] args) {

    //fibonacci 10 numbers from fibonacci

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        String s = "";

        for (int i = 0; i < 10; i++) { // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
            // store the sum
            s += n1 + " - ";

            // get the third
            n3 = n1 + n2;

            // change n1 and n2 for the next time
            n1 = n2;
            n2 = n3;
        }
        // 0 - 1 - 1 - 2 - 3 - 5 - 8 - 13 - 21 - 34 -
        System.out.println(s.substring(0, s.length()-3));


    //finding max and second max from an array

    int[] nums = {4, 5, 64, 345, 36, 74, 32};

    /*
    1. 2 containers for max and second
    2. find the max with loop
    3. find the second max with the loop(if it is not the max and bigger than the rest it is the second max)
     */

    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) if (max < nums[i]) max = nums[i];
        for (int i = 0; i < nums.length; i++) if (nums[i] != max && secondMax < nums[i]) secondMax = nums[i];

        System.out.println(max);
        System.out.println(secondMax);


    //palindrome

    String word = "civic";
    String rWord = "";

        for (int i = word.length()-1; i >= 0; i--) {
            rWord += word.charAt(i) + "";
        }
        System.out.println(rWord.equals(word));

    //fizzbuzz

    //foobar

    }
}
