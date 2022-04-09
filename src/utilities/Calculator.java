package utilities;

public class Calculator {

        /*
        What do we need to create a method
        1. A proper name
        2. Decide its accessibility level (public)
        3. Decide its accessibility way (You want to call it with class name or with object name)
            static -> You want to call it with class name
            non-static -> You want to call it with object name
        4. Decide if it returns something or not
            if it returns-> then decide what it returns
            if it does not return -> then put void
        5.  Does it take any argument
            if it takes, then decide what arguments it takes and how many arguments it takes
        6.


            NOTE: If your method is not void meaning it is returning something you MUST
            use return keyword in the body of the method.
            NOTE: If your method returns an int then the variable used next to return keyword
            in the body MUST be an INT.
            NOTE: Every method must have a body that runs a task
            NOTE: We can have multiple methods sharing the same name in the same class only if they
            have different arguments.
            Different arguments could be either the number of arguments are different or the types
            of arguments are different
         */

    /*
        //n1-n2
        if (n1>n2){
            return n1-n2;
        }else if (n2 > n1){
            // n2-n1}
            return n2-n1;
        }
        // n1 == n2 --> 0
        return 0;

        ternary expression
        return (n1 > n2)? n1-n2:n2-n1;
         */


    //Create a method that divides two int
    public static int divide(int num1, int num2) { //15,2 ->7
        return num1 / num2;
    }

    public static double divide(double num1, double num2) { //15,2 ->7
        return num1 / num2;
    }

    //Create a method that takes 2 numbers and find the average
    public static int average(int num1, int num2) {
        return ((num1 + num2) / 2);
    }

    //Create a method that takes 3 numbers and find the average
    public static int average(int num1, int num2, int num3) {
        return ((num1 + num2 + num3) / 3);
    }

    //Create a method that takes 4 numbers and find the average
    public static int average(int num1, int num2, int num3, int num4) {
        return ((num1 + num2 + num3 + num4) / 4);
    }

    //Create a method that finds the sum of 2 int numbers and returns it
    public static int sumOf2(int num1, int num2) {
        return num1 + num2;
    }

    //Create a method that finds the sum of 2 double numbers and returns it
    public static double doubleOf2Sum(double num1, double num2) {
        return num1 + num2;
    }

    //Create a method that finds the absolute difference of 2 int numbers and returns it
    public static int absoluteOf2(int num1, int num2) {
        return Math.abs(num1 - num2);
    }

    //Create a method that finds the absolute difference of 2 double numbers and returns it
    public static double absoluteOf2Double(double num1, double num2) {
        return Math.abs(num1 - num2);
    }

    //Create a method that finds the product of 2 int numbers and returns it
    public static int productOf2(int num1, int num2) {
        return num1 * num2;
    }

    //Create a method that finds the product of 2 double numbers and returns it
    public static double productOf2Double(int num1, int num2) {
        return num1 * num2;
    }

}
