package homeworks;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework14 {
    public static void main(String[] args) {
        System.out.println("\n----------Task-1------------\n");

        int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};
        int[] numbers1 = {-8, 56, 7, 8, 65};
        int[] numbers2 = {3, 4, 3, 3, 5, 5, 6, 6, 7};


        boolean isDuplicates = false;

        Arrays.sort(numbers2);

        //System.out.println(Arrays.toString(numbers2));

        for (int i = 0; i < numbers2.length; i++) {
            for (int j = i + 1; j < numbers2.length; j++) {
                if (numbers2[i] == numbers2[j]) {
                    System.out.println(numbers2[i]);
                    isDuplicates = true;
                    break;
                }
            }
            if (isDuplicates) break;
        }
        if (!isDuplicates) System.out.println("There is no duplicates");


        System.out.println("\n----------Task-2------------\n");

        String[] words = {"Z", "abc", "z", "123", "#"};
        String[] words1 = {"xyz", "java", "abc"};
        String[] words2 = {"a", "b", "B", "XYZ", "123"};


        //System.out.println(Arrays.toString(words2));

        boolean tF = false;
        for (int i = 0; i < words2.length; i++) {
            for (int j = i + 1; j < words2.length; j++) {
                if (words2[i].equalsIgnoreCase(words2[j])) {
                    System.out.println(words2[i]);
                    tF = true;
                    break;
                }
            }
            if (tF) break;
        }
        if (!tF) System.out.println("There is no duplicates");


        System.out.println("\n----------Task-3------------\n");

        int[] num1 = {0, -4, -7, 0, 5, 10, 45, -7, 0};

        //System.out.println(Arrays.toString(num1));

        boolean tF1 = false;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < num1.length; i++) {
            for (int j = i + 1; j < num1.length; j++) {
                if (num1[i] == num1[j]) {
                    if (arr.contains(num1[i])) {
                        break;
                    } else {
                        arr.add(num1[i]);
                        tF1 = true;
                    }
                }
            }
        }
        if (tF1 == true) {
            System.out.println(arr.get(0) + " ");
            System.out.println(arr.get(1) + " ");
        } else {
            System.out.println("There is no duplicates");
        }

        System.out.println("\n----------Task-4------------\n");

        String[] words3 = {"A", "foo", "12", "Foo", "bar", "a", "a", "java"};
        boolean tF3 = false;
        ArrayList<String> arr1 = new ArrayList<>();

        for (int i = 0; i < words3.length; i++) {
            for (int j = i + 1; j < words3.length; j++) {
                if (words3[i] == words3[j]) {
                    if (arr1.contains(words3[i])) {
                        break;
                    } else {
                        arr1.add(words3[i]);
                        tF3 = true;
                    }
                }
            }
        }
        if (tF3 == true) {
            System.out.println(arr1 + "");
        } else {
            System.out.println("There is no duplicates");
        }

        System.out.println("\n----------Task-5------------\n");

        String[] words4 = {"abc", "foo", "bar"};

        List<String> word4R = Arrays.asList(words4);
        Collections.reverse(word4R);
        System.out.println(word4R);

        System.out.println("\n----------Task-6------------\n");

        String str = "Java is fun";
        String reverseS = "";
        for (int i = 0; i < str.length(); i++) {
            String reverseStr = "";
            for (int j = str.length()-1; j >= 0; j--) {
                reverseStr += str.charAt(i);
            }
            reverseS += reverseStr + " ";

        }
        System.out.println(reverseS);
    }
}
