package homeworks;

import sun.java2d.pipe.SpanShapeRenderer;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeworkR4 {
    //Task-1
    public static String noSpace1(String str) {
        String s = "";
        Pattern pattern = Pattern.compile("[^0-9A-Za-z$&+,:;=?@#|'<>.\\-^*~()%!]");

        for (char e : str.toCharArray()) {
            Matcher matcher = pattern.matcher(String.valueOf(e));
            if (matcher.matches()) s += e;
        }
        return s;
    }
    //Task-1
    public static String noSpace2(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(!Character.isWhitespace(str.charAt(i))) result += str.charAt(i);
        }
        return result;
    }

    //Task-2
    public static String replaceFirstLast(String str) {
        if(str.trim().length() < 2) return "";
        return str.charAt(str.length()-1) + str.substring(1, str.length()-1) + str.charAt(0);
    }

    //Task-3
    public static boolean hasVowel(String str) {
        boolean vowel = false;
        Pattern pattern = Pattern.compile("[aeiouAEIOU]");

        for (char e : str.toCharArray()) {
            Matcher matcher = pattern.matcher(String.valueOf(e));
            if (matcher.matches()) vowel = true;
        }
        return vowel;
    }

    //Task-4
    public static void checkAge(int birthYear){
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        int age = Integer.parseInt(dateFormat.format(currentDate))-birthYear;
        if(age > 100 || age < 0) System.out.println("AGE IS NOT VALID");
        else if(age <= 16) System.out.println("AGE IS NOT ALLOWED");
        else System.out.println("AGE IS ALLOWED");
    }


    //Task-5
    public static int averageOfEdges(int a, int b, int c) {
        return (Math.max(Math.max(a, b), c) + Math.min(Math.min(a, b), c)) / 2;
    }

    //Task-6
    public static String[] noA(String[] arr){
        String[] newArray = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].startsWith("a") || arr[i].startsWith("A")) newArray[i] = "###";
            else newArray[i] = arr[i];
        }
        return newArray;
    }

    //Task7
    public static int[] no3or5A(int[] a){
        int[] replace = new int[a.length];
        for (int i = 0; i < a.length; i++)
            if(a[i] % 15 == 0) replace[i] = 101;
            else if(a[i] % 5 == 0) replace[i] = 99;
            else if(a[i] % 3 == 0) replace[i] = 100;
            else replace[i] = a[i];
            return replace;
    }

    //Task 8
    public static int countPrimes(int[] a) {
        int count = 0;
        for (int e : a) {
            boolean isPrime = true;
            if (e < 2) continue;
            for (int i = 0; i < e; i++) {
                if (e % i == 0) {
                    isPrime = false;
                    break;
                }
                if (isPrime) count++;
            }
            return count;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(replaceFirstLast("Tech Global"));
        int[] s1 = {7, 4, 11, 23, 17};
        int[] s2 = {3, 4, 5, 6};
        int[] s3 = {10, 11, 12, 13, 14, 15};

        System.out.println(Arrays.toString(no3or5A(s1)));
        System.out.println(Arrays.toString(no3or5A(s2)));
        System.out.println(Arrays.toString(no3or5A(s3)));

    }
}