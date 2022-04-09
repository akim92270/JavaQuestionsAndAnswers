package projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project07 {

    /*
    System.out.println("Task-1");
     */
    public static void findGreatestAndSmallestWithSort(int[] num) {
        Arrays.sort(num);

        System.out.println("Smallest = " + num[0]);
        System.out.println("Greatest = " + num[num.length - 1]);
    }

    /*
    System.out.println("Task-2");
    */
    public static void findGreatestAndSmallest(int[] num) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) max = num[i];
            if (num[i] < max) min = num[i];
        }
        System.out.println("Smallest = " + min);
        System.out.println("Greatest = " + max);
    }

    /*
    System.out.println("Task-3");
     */
    public static void findSecondGreatestAndSmallestWithSort(int[] num) {
        //[10, 5, 6, 7, 8, 5, 15, 15]
        Arrays.sort(num);

        //[5, 5, 6, 7, 8, 10, 15, 15]
        // max = nums[nums.length - 1]
        // min = nums[0]

        for (int i = 0; i < num.length; i++) {
            if (num[i] != num[0]) {
                System.out.println(num[i]);
                break;
            }
        }

        for (int i = num.length - 1; i >= 0; i--) {
            if (num[i] != num[num.length - 1]) {
                System.out.println(num[i]);
                break;
            }
        }
    }
     /*
    TASK-4 - findSecondGreatestAndSmallest() method
        Write a method that takes an int array that has at least one element. Find
        the second greatest and second smallest elements from the array and print
        them. DO NOT sort the array and complete task without sorting.
        Test data:
        [10, 5, 6, 7, 8, 5, 15, 15]
        Expected output:
        Second Smallest = 6
        Second Greatest = 10
     */

        public static void findSecondGreatestAndSmallest(int[] nums){
            int max = 0;
            int min = 0;
            int secondMax = 0;
            int secondMin = 0;
            //
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) max = nums[i];
                if (nums[i] < min) min = nums[i];
            }
            //
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] != max && nums[i] > secondMax) secondMax = nums[i];
                if (nums[i] != min && nums[i] < secondMin) secondMin = nums[i];
            }
            System.out.println("Second Smallest = " + secondMin);
            System.out.println("Second Greatest = " + secondMax);

        }

    public static void findDuplicatedElementsInAnArray(String[] str) {

        String duplicates = "";
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i] == str[j]) {
                    if (!duplicates.contains(str[i]))
                        duplicates += str[i] + "\n";
                }
            }
        }
        System.out.println(duplicates.trim()); //trim what was told by Burak guided us.
    }

    public static void findMostRepeatedElementInAnArray(String[] str) {
/*
        // Burak and Momad solved this problem. I did not solve this.
        String store = "";
        String flag = "";
        for (int i = 1; i < str.length; i++) {
            //if(str[i] == str[i-1])
            for (int j = i + 1; j < str.length; j++) {
                if (str[i] == str[j]) {
                    store += str[i] + " ";
                }
            }
        }
        String[] arr2 = store.split(" ");
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i].equals(arr2[j])) {
                    if (store.contains(arr2[i])) {
                        flag = arr2[i];
                    }
                }
            }
        }
        System.out.println(flag);

 */
    }

    /*
    TASK-6 findMostRepeatedElementInAnArray() method
    Write a method that takes a String array. Find the most repeated element
    and print it.

    Test data:
    ["pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"]

    Expected output:
    pen
     */

        public static void findMostRepeatedElementInAnArray1(String[] arr){
            String mostCountedWord = "";
            int mostCountedTimes = 0;

            ArrayList<String> countedElements = new ArrayList<>();

            for (int i = 0; i <= arr.length-1; i++) {
                String word = arr[i];
                int countOfWord = 0;

                if(!countedElements.contains(word)){
                    for (String w : arr) {
                        if(word.equals(w)) countOfWord++;
                    }

                    if(countOfWord > mostCountedTimes){
                        mostCountedWord = word;
                        mostCountedTimes = countOfWord;
                    }
                    countedElements.add(word);
                }
            }

            System.out.println(mostCountedWord + " counted " + mostCountedTimes + " times in this array");
        }






/*
        public static void main(String[] args) {
            String[] words = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
            String[] words2 = {"a", "a", "b", "c"}; // a counted 2 times in this array
            String[] words3 = {"abc", "ABC", "ab", "ab", "abc", "ab"}; // ab counted 3 times in this array


            findMostRepeatedElementInAnArray(words);
            findMostRepeatedElementInAnArray(words2);
            findMostRepeatedElementInAnArray(words3);
            findMostRepeatedElementInAnArray(new String[]{"x", "y", "z", "y"});



        }
    }

    public static void main(String[] args) {
        int[] ints = {10, 5, 6, 7, 8, 5, 15, 15};
        //findDuplicatedElementsInAnArray(str);

        findSecondGreatestAndSmallest(ints);

 */

}