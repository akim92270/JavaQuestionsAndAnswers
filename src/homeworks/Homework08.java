package homeworks;

import utilities.RandomNumberGenerator;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {

        System.out.println("Task-1");
        int random = RandomNumberGenerator.getRandomNumber(0, 50);
        if(random >= 10 && random <= 25){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        System.out.println("\nTask-2");
        int random1 = RandomNumberGenerator.getRandomNumber(1, 100);
        if(random1 <= 50) {
            System.out.println(random1 + " is in the 1st half");
            //1st half
            if (random1 <= 25) {
                System.out.println(random1 + " is in the 1st quarter"); //1st quarter
            } else {
                System.out.println(random1 + " is in the 2nd quarter");
            }
        }else {
                System.out.println(random1 + " is in the 2nd half"); //2nd half
            if(random1 <= 75){
                System.out.println(random1 + " is in the 3rd quarter"); //3rd quarter
            }else
            {
                System.out.println(random1 + " is in the 4th quarter"); //4th quarter
            }
        }

        System.out.println("\nTask-3");
        System.out.println("Enter 5 numbers between 1 to 10");
        Scanner scan = new Scanner(System.in);
        int rand1 = scan.nextInt(), rand2 = scan.nextInt(), rand3 = scan.nextInt(), rand4 = scan.nextInt(),
                rand5 = scan.nextInt();
        int pts = 0;

        if(rand1 >= 1 && rand1 <= 10){
            pts += rand1 * 5;
        }
        if(rand2 >= 1 && rand2 <= 10){
            pts += rand2 * 4;
        }
        if(rand3 >= 1 && rand3 <= 10){
            pts += rand3 * 3;
        }
        if(rand4 >= 1 && rand4 <= 10){
            pts += rand4 * 2;
        }
        if(rand5 >= 1 && rand5 <= 10){
            pts += rand5 * 1;
        }
        System.out.println(pts);
    }
}