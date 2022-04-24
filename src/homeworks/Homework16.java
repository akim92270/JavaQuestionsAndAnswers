package homeworks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Homework16 {
    //Task-1 (1st Solution)
    public static int countWords(String s) {
        /*int words = 1;
        String s1 = s.trim();

        if(!s1.isEmpty()){
        for (int i = 0; i < s1.length(); i++) {
            if(Character.isWhitespace(s1.charAt(i))) words++;
        }
        return words;
        }
        return 0;
         */

        //Task-1 (2nd Solution)
        String s1 = s.trim();
        if(!s1.isEmpty()){
            String[] sSplit = s1.split(" ");
            return(sSplit.length);
        }else return 0;
    }


    //Task-2 (1st Solution)
    public static int countA(String s){
        int countA = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A') countA++;
        }
        return countA;
    }

    //Task-3 (1st Solution)
    public static int countpos (ArrayList<Integer> count){
        int countPos = 0;
        for (Integer integer : count) {
            if (integer > 0) countPos++;
        }return countPos;
    }

    //Task-4
    public static ArrayList<Integer> removeDuplicateNumbers (ArrayList<Integer> arrayList) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (Integer element : arrayList) {
            if (!(nums.contains(element))) nums.add(element);
        }
        return nums;
    }

    //Task-5
    public static ArrayList<String> removeDuplicateElements (ArrayList<String> strings){
        ArrayList<String> stringArray = new ArrayList<>();
        for (String element : strings) {
            if(!(stringArray.contains(element))) stringArray.add(element);
        }
        return stringArray;
    }

    //Task-6
    public static String removeExtraSpaces(String s) {
        String[] str = s.trim().split(" ");
        String sentence = "";
        for (String s1 : str) {
            if (!s1.isEmpty()) sentence += s1 + " ";
        }
        return sentence.substring(0,sentence.length()-1);
    }

    //Task-7
    public static int[] add(int[] n1, int[] n2){
        for (int i = 0; i < Math.max(n1.length, n2.length); i++) {
            if(n1.length > n2.length) n1[i] += n2[i];
        }
        return (n1.length > n2.length) ? n1: n2;
    }

    //Task-8
    public static int findClosestTo10(int[] arr){
        int closest = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i= 1; i < arr.length; i++){
            if(arr[i] != 10 && Math.abs(10 - arr[i]) < Math.abs(1 - closest)) closest = arr[i];
        }
        return (closest);
    }
    public static void main(String[] args) {
        //Testing methods
        System.out.println("\n------------Task-1-----------\n");
        String str = "      Java is fun       ";
        String str1 = "Selenium is the most common UI automation tool.   ";

        System.out.println(countWords(str));
        System.out.println(countWords(str1));

        //Testing methods
        System.out.println("\n------------Task-2-----------\n");

        String str2 = "TechGlobal is a QA bootcamp";
        String str3 = "QA stands for Quality Assurance";

        System.out.println(countA(str2));
        System.out.println(countA(str3));

        System.out.println("\n------------Task-3-----------\n");
        ArrayList<Integer> num = new ArrayList<>();
        num.add(-45);
        num.add(0);
        num.add(0);
        num.add(34);
        num.add(5);
        num.add(67);

        System.out.println(countpos(num));

        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(-23);
        num2.add(-4);
        num2.add(2);
        num2.add(5);
        num2.add(90);
        num2.add(123);

        System.out.println(countpos(num2));

        System.out.println("\n------------Task-4-----------\n");
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(10);
        num1.add(20);
        num1.add(35);
        num1.add(20);
        num1.add(35);
        num1.add(60);
        num1.add(70);
        num1.add(60);

        System.out.println(removeDuplicateNumbers(num1));

        //[1, 2, 5, 2, 3]
        ArrayList<Integer> num3 = new ArrayList<>();
        num3.add(1);
        num3.add(2);
        num3.add(5);
        num3.add(2);
        num3.add(3);

        System.out.println(removeDuplicateNumbers(num3));


        System.out.println("\n------------Task-5-----------\n");
        ArrayList<String> aR = new ArrayList<>();
        aR.add("java");
        aR.add("C#");
        aR.add("ruby");
        aR.add("JAVA");
        aR.add("ruby");
        aR.add("C#");
        aR.add("C++");

        System.out.println(removeDuplicateElements(aR));

        ArrayList<String> aR1 = new ArrayList<>();
        aR1.add("abc");
        aR1.add("xyz");
        aR1.add("123");
        aR1.add("ab");
        aR1.add("abc");
        aR1.add("ABC");

        System.out.println(removeDuplicateElements(aR1));


        System.out.println("\n------------Task-6-----------\n");
        String str4 = "   I   am      learning     Java      ";

        removeExtraSpaces(str4);

        System.out.println("\n------------Task-7-----------\n"); //Kaly assisted
        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};

        System.out.println(Arrays.toString(add(arr1,arr2)));
        //output [9, 3, 2, 7, 5, 10]


    }
}
