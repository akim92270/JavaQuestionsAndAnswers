package homeworks;

import java.util.Arrays;

public class Homework22 {
    //Task-1
    public static int[] fibonacciSeries1(int n) {
        // 0 1 1 2 3 5
        int n0 = 0, n1 = 1, n2 = 0;
        int[] newArr = new int[n];
        for (int i = 1; i < n; i++) {
            newArr[0] = 0;
            newArr[1]= 1;
            newArr[i] = n2;
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;

        }
        return newArr;
    }

   //Task-2
   public static int fibonacciSeries2(int a){
       {
           if (a == 1 || a == 2) return 1;

           return fibonacciSeries2(a - 1) + fibonacciSeries2(a - 2);
       }
   }

   /* //Task-3
    public static int[] findUniques(int[] n1, int[] n2) {

    }



    //Task-4
    public static boolean isPowerOf3(int n) {

    }


    //Task-5
    public static int firstDuplicate(int[] arr) {

    }



*/
    public static void main(String[] args) {
        System.out.println("--------Task-1----------");
        System.out.println(Arrays.toString(fibonacciSeries1(3)));
        System.out.println((Arrays.toString(fibonacciSeries1(5))));
        System.out.println((Arrays.toString(fibonacciSeries1(7))));
        System.out.println("--------Task-2----------");
        System.out.println(fibonacciSeries2(2));
        System.out.println(fibonacciSeries2(4));
        System.out.println(fibonacciSeries2(8));
        /*System.out.println("--------Task-3----------");
        System.out.println(findUniques([],[]));
        System.out.println(findUniques([],[1,2,3,2]));
        System.out.println(findUniques([1,2,3,4],[3,4,5,5]));
        System.out.println(findUniques([8,9],[9,8,9]));
        System.out.println("--------Task-4----------");
        System.out.println(isPowerOf3(1));
        System.out.println(isPowerOf3(2));
        System.out.println(isPowerOf3(3));
        System.out.println(isPowerOf3(81));
        System.out.println("--------Task-5----------");
        System.out.println(firstDuplicate([]);
        System.out.println(firstDuplicate([1]);
        System.out.println(firstDuplicate([1,2,2,3]);
        System.out.println(firstDuplicate([1,  2, 3, 3, 4, 1]);*/
        }
}
