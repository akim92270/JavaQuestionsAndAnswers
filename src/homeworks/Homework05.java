package homeworks;

import java.util.Scanner;
public class Homework05 {
    public static void main(String[] args) {

        System.out.println("Task-1");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();

        System.out.println("Max value = " + Math.max(Math.max(a,b),c));
        System.out.println("Max value = " + Math.min(Math.min(a,b),c) + "\n");

        System.out.println("Task-2");
        System.out.println("Enter 5 numbers below");
        int a1 = scan.nextInt(), b1 = scan.nextInt(), c1 = scan.nextInt(), d1 = scan.nextInt(), e1 = scan.nextInt();
        System.out.println("Max value = " + Math.max(a1, Math.max(Math.max(b1,c1), Math.max(d1,e1))) +
                "\nMin value = " + Math.min(a1, Math.min(Math.min(b1,c1), Math.min(d1,e1))) + "\n");

        System.out.println("Task-3");
        System.out.println("Enter 2 numbers");
        int store = scan.nextInt(), store1 = scan.nextInt();
        int absolute = Math.abs(store) + store1;
        System.out.println("The difference between numbers is = " + absolute + "\n");

        System.out.println("Task-4");
        int random1 = (int)(Math.random() * 51) + 50, random2 = (int)(Math.random() * 51) + 50,
                random3 = (int)(Math.random() * 51) + 50;

        System.out.println("Number 1 = " + random1 + "\nNumber 2 = " + random2 + "\nNumber 3 = " + random3
                + "\nThe sum of numbers is = " + (random1 + random2 + random3) + "\n");

        System.out.println("Task-5");
        String name = "Alex";
        String name2 = "Mike";
        double money = 125, money2 = 220;

        System.out.println(name + "'s money: $" + (money - 25.5));
        System.out.println(name2 + "'s money: " + (int)(money2 + 25.5) + "\n");

        System.out.println("Task-6");
        String name3 = "David";
        double money1 = 390;
        double save = 15.60;
        System.out.println((int)(money1 / save));
    }
}
