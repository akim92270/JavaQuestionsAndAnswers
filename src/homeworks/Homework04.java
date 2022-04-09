package homeworks;
import java.util.Scanner;
public class Homework04 {
    public static void main(String[] args) {
        /*Psudeo Code
        1. Import Scanner.
        2. Create a Scanner that will take the users input.
        3. Write the Questions that we are trying to ask.
        4. Declare an objectName and assign it with the users input.
        5. Write a formula for the average of the user input.
        6. Print out the value.
         */

        System.out.println("\nTask-1");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two values. Starting with your first number");
        int input1 = scan.nextInt();
        System.out.println("Enter your second number");
        int input2 = scan.nextInt();
        int avg = (input1 + input2) / 2;
        System.out.println("The average of the given 2 numbers is: " + avg);

        System.out.println("\nTask-2");
        System.out.println("Enter two values. Starting with your first number");
        int product = scan.nextInt();
        System.out.println("Enter your second number");
        int product1 = scan.nextInt();
        int mult = (product * product1);
        System.out.println("The product of the given 2 numbers is: " + mult);

        System.out.println("\nTask-3");
        System.out.println("Enter three values. Starting with your first number");
        int num = scan.nextInt();
        System.out.println("Enter your second number");
        int num1 = scan.nextInt();
        System.out.println("Enter your third number");
        int num2 = scan.nextInt();
        int square = num*num;
        int square2 = num1*num1;
        int square3 = num2*num2;
        System.out.println("The " + num + " multiplied with " + num + " is = " + square);
        System.out.println("The " + num1 + " multiplied with " + num1 + " is = " + square2);
        System.out.println("The " + num2 + " multiplied with " + num2 + " is = " + square3);


        System.out.println("\nTask-4");
        System.out.println("Enter two values. Starting with your first number");
        int nu = scan.nextInt();
        System.out.println("Enter your second number");
        int nu1 = scan.nextInt();
        int finalValue = (nu % num1);
        System.out.println("The remainder of " + nu + " % " + nu1 + " = " + finalValue);


        System.out.println("\nTask-5");
        System.out.println("Enter five values. Starting with your first number");
        int nu2 = scan.nextInt();
        System.out.println("Enter your second number");
        int num3 = scan.nextInt();
        System.out.println("Enter your third number");
        int num4 = scan.nextInt();
        System.out.println("Enter your four number");
        int num5 = scan.nextInt();
        System.out.println("Enter your fifth number");
        int num6 = scan.nextInt();
        int avg1 = (nu2 + num3 + num4 + num5 + num6) / 5;
        System.out.println("The average of the given 5 numbers is: " + avg1);


        System.out.println("Enter a number that will print up its multiplication table up to 10");
        int num_1 = scan.nextInt();

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;
        int g = 7;
        int h = 8;
        int i = 9;
        int j = 10;

        int output = num_1 * a;
        int output1 = num_1 * b;
        int output2 = num_1 * c;
        int output3 = num_1 * d;
        int output4 = num_1 * e;
        int output5 = num_1 * f;
        int output6 = num_1 * g;
        int output7 = num_1 * h;
        int output8 = num_1 * i;
        int output9 = num_1 * j;

        System.out.println(num + " * " + a + " = " + output);
        System.out.println(num + " * " + b + " = " + output1);
        System.out.println(num + " * " + c + " = " + output2);
        System.out.println(num + " * " + d + " = " + output3);
        System.out.println(num + " * " + e + " = " + output4);
        System.out.println(num + " * " + f + " = " + output5);
        System.out.println(num + " * " + g + " = " + output6);
        System.out.println(num + " * " + h + " = " + output7);
        System.out.println(num + " * " + i + " = " + output8);
        System.out.println(num + " * " + j + " = " + output9);

        System.out.println("We will try to find out the perimeter and area. Please enter a number.");
        int num_ = scan.nextInt();
        int per = num * num_;
        int sq = 4 * num_;
        System.out.println("Perimeter of the square = " + sq);
        System.out.println("Area of the square = " + per);

    }
}
