package utilities;

public class MyMethods {

    // Write a method which is going to find the max of 4 and prints out it ONLY

    public static void printMaxOf4(int num1, int num2, int num3, int num4){
        System.out.println(Math.max(Math.max(Math.max(num1, num2),num3),num4));
    }
    public static int MaxOf4(int num1, int num2, int num3, int num4){
            return (Math.max(Math.max(Math.max(num1, num2),num3),num4));
    }
}
