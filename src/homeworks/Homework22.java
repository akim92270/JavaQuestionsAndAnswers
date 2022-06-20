package homeworks;

import java.lang.reflect.Array;
import java.util.*;

public class Homework22 {
    //Task-1
    public static int[] fibonacciSeries1(int n) {
        // 0 1 1 2 3 5
        int n0 = 0, n1 = 1, n2 = 0;
        int[] newArr = new int[n];
        for (int i = 1; i < newArr.length; i++) {
            newArr[i] += n1;
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;

        }
        return newArr;
    }

    //Task-2
    public static int fibonacciSeries2(int n) {
        // 0 1 1 2 3 5
        int n0 = 0, n1 = 1, n2;
        int[] newArr = new int[n];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] += n0;
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
        }
        return newArr[newArr.length - 1];
    }


    /*//Task-3 don't know
    public static int[] findUniques(int[] n1, int[] n2) {
        HashSet<Integer> unique = new HashSet<>();
        ArrayList<Integer> newUnique = new ArrayList<>();
        for (int element : n1) {
            for (int element2 : n2) {
                if (element == element2) newUnique.add(element);
            }

        }
    }
     */

    //Task-4
    public static boolean isPowerOf3(int n) {
        if(n < 1) return false;
        while(n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }


    //TASK 5
    public static int firstDuplicate(int[] array) {
        if (array.length <= 1) return -1;
        else {
            ArrayList<Integer> list = new ArrayList<>();
            for (int num : array) list.add(num);
            ArrayList<Integer> newListWithDuplicate = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i) == list.get(j)) newListWithDuplicate.add(list.get(i));
                }
                Collections.sort(newListWithDuplicate);
            }
            return newListWithDuplicate.get(newListWithDuplicate.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("--------Task-1----------");
        System.out.println(Arrays.toString(fibonacciSeries1(3)));
        System.out.println((Arrays.toString(fibonacciSeries1(5))));
        System.out.println((Arrays.toString(fibonacciSeries1(7))));
        System.out.println("--------Task-2----------");
        System.out.println(fibonacciSeries2(2));
        System.out.println(fibonacciSeries2(4));
        System.out.println(fibonacciSeries2(8));
        System.out.println("--------Task-3----------");
        /*System.out.println(findUniques(new int[]{1}));
        System.out.println(findUniques(new int[]{2}));
        System.out.println(findUniques(new int[]{2}));
        System.out.println(findUniques(new int[]{2}));*/
        System.out.println("--------Task-4----------");
        System.out.println(isPowerOf3(1));
        System.out.println(isPowerOf3(2));
        System.out.println(isPowerOf3(3));
        System.out.println(isPowerOf3(81));
        System.out.println("--------Task-5----------");
        System.out.println(firstDuplicate(new int[]{}));
        System.out.println(firstDuplicate(new int[]{1}));
        System.out.println(firstDuplicate(new int[]{1, 2, 2, 3}));
        System.out.println(firstDuplicate(new int[]{1, 2, 3, 3, 4, 1}));
    }
}
