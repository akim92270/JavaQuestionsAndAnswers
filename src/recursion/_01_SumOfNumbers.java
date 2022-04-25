package recursion;

public class _01_SumOfNumbers {
    /*
    Write a method that finds the sum of numbers from 1-n
    Both 1 and n are included
    Method must be return type and static

    n = 5
    1+2+3+4+5 = 15

    n = 7
    1+2+3+4+5+6+7 = 28
     */



    public static int sumOfNumbers(int n){
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += i;
        }
        return count;
    }

    /*
    Write a recursive method that finds the sum of numbers from 1-n
    Both 1 and n are included
    Method must be return type and static

    n = 5
    1+2+3+4+5 = 15

    n = 7
    1+2+3+4+5+6+7 = 28
     */

    public static int recursive(int n){
        if(n > 0) return n + recursive(n-1);
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(sumOfNumbers(7));
        System.out.println(recursive(5));
    }
}
