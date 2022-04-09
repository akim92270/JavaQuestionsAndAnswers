package exercises;
import java.util.Scanner;
public class IfElseSwitchPractice {
    public static void main(String[] args) {

        /*
        write a code takes a user age and
        if the user is 16 or older print out "You can drive"
        if the user is 18 or older print out "You can work"
        if the user is 21 or older print out "You can drink"
        if the user us 25 or older print out "You can rent a car"
         */
        System.out.println("Please enter your age");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (age >= 16) {
            System.out.println("You can drive");
            if (age >= 18) {
                System.out.println("You can work");
                if (age >= 21) {
                    System.out.println("You can drink");
                    if (age >= 25) {
                        System.out.println("You can rent a car");
                    }
                }
            }
        }
    }
}
