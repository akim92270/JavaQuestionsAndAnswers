package homeworks;
import java.util.Scanner;
public class Homework06 {
    public static void main(String[] args) {
        System.out.println("Task-1");
        String s1 = "5", s2 = "10";
        int num1 = Integer.parseInt(s1), num2 = Integer.parseInt(s2);

        System.out.println("Sum of " + s1 + " and " + s2 + " is = " + (num1 + num2) +
                "\nProduct of " + s1 + " and " + s2 + " is = " + (num1 * num2) +
                "\nDivision of " + s1 + " and " + s2 + " is = " + (num1 / num2) +
                "\nSubtraction " + s1 + " and " + s2 + " is = " + (num1 - num2) +
                "\nRemainder of " + s1 + " and " + s2 + " is = " + (num1 % num2) + "\n");

        System.out.println("Task-2");

        int c = Integer.parseInt("200"), c1 = Integer.parseInt("-50");
        System.out.println("The greatest value is = " + Math.max(c, c1) +
                "\nThe smallest value is = " + Math.min(c, c1) +
                "\nThe average value is = " + (c + c1) / 2 +
                "\nThe absolute difference is = " + Math.abs(c - c1) + "\n");

        System.out.println("Task-3");
        double total = .96;
        double days1 = 168 / total;
        double save = 150 * total;

        System.out.println((int)24 / total + " days");
        System.out.println((int)days1 + " days");
        System.out.println("$" + save + "\n");

        System.out.println("Task-4");
        double save1 = 62.5;
        double days3 = 1250;
        double day = days3 / save1;
        System.out.println((int)day + "\n");

        System.out.println("Task-5");
        double saveCar = 14265;
        double option1 = saveCar / 475.50;
        double option2 = saveCar / 951;
        System.out.println("Option 1 will take " + (int)option1 + " months" +
                "\nOption 2 will take " + (int)option2 + " months \n");

        System.out.println("Task-6");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter in your first number");
        int number1 = scan.nextInt();
        System.out.println("Enter in your second number");
        int number2 = scan.nextInt();
        double a = ((double)number1 / (double)number2);
        System.out.println(a);



    }
}

