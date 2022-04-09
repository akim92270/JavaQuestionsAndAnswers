package homeworks;

import java.util.Scanner;

        public class Homework07 {
            public static void main(String[] args) {

                System.out.println("Task-1");

                Scanner scan = new Scanner(System.in);

                int num1 = (int) (Math.random() * 11), num2 = (int) (Math.random() * 11), num3 = (int)
                        (Math.random() * 11), num4 = (int) (Math.random() * 11);

                System.out.println("Number 1 = " + num1 + "\nNumber 2 = " + num2 + "\nNumber 3 = " + num3 + "\nNumber 4 = " + num4 +
                        "\nAbsolute difference of " + num1 + " with 5 is = " + Math.abs(num1-5) +
                        "\nAbsolute difference of " + num2 + " with 5 is = " + Math.abs(num2-5) +
                        "\nAbsolute difference of " + num3 + " with 5 is = " + Math.abs(num3-5) +
                        "\nAbsolute difference of " + num4 + " with 5 is = " + Math.abs(num4-5) +
                        "\nGreatest number is = " + Math.max(Math.max(Math.max(num1,num2),num3), num4) +
                        "\nSmallest number is = " + Math.min(Math.min(Math.min(num1,num2),num3), num4));

                System.out.println("\nTask-2");


                int numb1 = (int)(Math.random() * 101) - 50, numb2 = (int)(Math.random() * 101) - 50,
                        numb3 = (int)(Math.random() * 101) - 50, numb4 = (int)(Math.random() * 101) - 50,
                        numb5 = (int)(Math.random() * 101) - 50, numb6 = (int)(Math.random() * 101) - 50,
                        numb7 = (int)(Math.random() * 101) - 50, numb8 = (int)(Math.random() * 101) - 50;

                System.out.println("Number 1 = " + numb1 + "\nNumber 2 = " + numb2 + "\nNumber 3 = " + numb3 + "\nNumber 4 = " + numb4 +
                        "\nNumber 5 = " + numb5 + "\nNumber 6 = " + numb6 + "\nNumber 7 = " + numb7 + "\nNumber 8 = " + numb8);

                int greatest = Math.max(Math.max(Math.max
                        (Math.max(Math.max(Math.max(Math.max(numb1 ,numb2), numb3), numb4), numb5), numb6), numb7), numb8);
                int smallest = Math.min(Math.min(Math.min
                        (Math.min(Math.min(Math.min(Math.min(numb1 ,numb2), numb3), numb4), numb5), numb6), numb7), numb8);
                System.out.println("Greatest number is = " + greatest);
                System.out.println("Smallest number is = " + smallest);
                System.out.println("Average of 8 numbers is = " + (numb1 + numb2 + numb3 + numb4 + numb5 + numb6 + numb7 + numb8) / 8);
                System.out.println("Absolute difference between smallest and greatest is = " + Math.abs(greatest - smallest));

                if (numb3 > 0) System.out.println("3rd number is positive = " + true);
                else System.out.println("3rd number is positive = " + false);

                if (numb5 < 0) System.out.println("5th number is negative = " + true);
                else System.out.println("5th number is negative = " + false);

                if(numb1 == 0 || numb2 == 0 || numb3 == 0 || numb4 == 0 || numb5 == 0 || numb6 == 0 || numb7 == 0 || numb8 == 0)
                    System.out.println("There is at least one zero among those numbers is = " + true);
                else System.out.println("There is at least one zero among those numbers is = " + false);


                System.out.println("\nTask-3");

                int nu1 = (int)(Math.random() * 51), nu2 = (int)(Math.random() * 51),
                        nu3 = (int)(Math.random() * 51), nu4 = (int)(Math.random() * 51),
                        nu5 = (int)(Math.random() * 51), nu6 = (int)(Math.random() * 51),
                        nu7 = (int)(Math.random() * 51);

                System.out.println("Number 1 = " + nu1 + "\nNumber 2 = " + nu2 + "\nNumber 3 = " + nu3 + "\nNumber 4 = " + nu4 +
                        "\nNumber 5 = " + nu5 + "\nNumber 6 = " + nu6 + "\nNumber 7 = " + nu7);
                System.out.println("Greatest number is = " + Math.max(Math.max(Math.max
                        (Math.max(Math.max(Math.max(nu1 ,nu2), nu3), nu4), nu5), nu6), nu7));
                System.out.println("Smallest number is = " + Math.min(Math.min(Math.min
                        (Math.min(Math.min(Math.min(nu1 ,nu2), nu3), nu4), nu5), nu6), nu7));
                System.out.println("Average of 7 numbers is = " + (nu1 + nu2 + nu3 + nu4 + nu5 + nu6 + nu7) / 7);

                if(nu1 >= 10){
                    System.out.print("First number is greater than or equal to 10 = " + true);
                }else
                    System.out.println("First number is greater than or equal to 10 = " + false);

                if(nu7 <= 40){
                    System.out.println("Last number is less than or equal to 40 = " + true);
                }else
                    System.out.println("Last number is less than or equal to 40 = " + false);

                if(nu1 >= 25 && nu7 >= 25){
                    System.out.println("Both first and last numbers are greater than 25 = " + true);
                }else
                    System.out.println("Both first and last numbers are greater than 25 = " + false);

                if(nu1 == 0 || nu1 == 50 || nu2 == 0 || nu2 == 50 || nu3 == 0 || nu3 == 50 ||
                        nu4 == 0 || nu4 == 50 || nu5 == 0 || nu5 == 50 || nu6 == 0 ||
                        nu6 == 50 || nu7 == 0 || nu7 == 50){
                    System.out.println("At least one of those numbers is 0 or 50 = " + true);
                }else
                    System.out.println("At least one of those numbers is 0 or 50 = " + false);

                if((nu1 >= 40 && nu1 <= 50) || (nu2 >= 40 && nu2 <= 50) || (nu3 >= 40 && nu3 <= 50) ||
                        (nu4 >= 40 && nu4 <= 50) || (nu5 >= 40 && nu5 <= 50) || (nu6 >= 40 && nu6 <= 50)
                        || (nu7 >= 40 && nu7 <= 50))
                {
                    System.out.println("There is no number between 40 and 50 = " + false);
                }else
                    System.out.println("There is no number between 40 and 50 = " + true);

                System.out.println("\nTask-4");
                int storenum = (int)(Math.random() * 101), storenum2 = (int)(Math.random() * 101), storenum3 = (int)(Math.random() * 101);

                if(storenum > 25 && storenum2 > 25 &&  storenum3 > 25){
                    System.out.println(true);
                }else{
                    System.out.println(false);
                }

                System.out.println("\nTask-5");
                int day = scan.nextInt();
                System.out.println(day);
                if (day == 1)
                    System.out.println("MONDAY");
                else if (day == 2)
                    System.out.println("TUESDAY");
                else if (day == 3)
                    System.out.println("WEDNESDAY");
                else if (day == 4)
                    System.out.println("THURSDAY");
                else if (day == 5)
                    System.out.println("FRIDAY");
                else if (day == 6)
                    System.out.println("SATURDAY");
                else if (day == 7)
                    System.out.println("SUNDAY");
                else {
                    System.out.println("RE-ENTER 1-7");
                }

                System.out.println("\nTask-6");
                int negative10to10 = scan.nextInt();
                System.out.println(negative10to10);
                if (negative10to10 > 0)
                    System.out.println("Number entered is POSITIVE");
                else if (negative10to10 < 0)
                    System.out.println("Number entered is NEGATIVE");
                else
                    System.out.println("Number entered is ZERO");

                if (negative10to10 % 2 == 0)
                    System.out.println("Number entered is EVEN");
                else
                    System.out.println("Number entered is ODD");

                System.out.println("\nTask-7");

                System.out.println("Tell me your exam results?");
                int grade = scan.nextInt(), grade2 = scan.nextInt(), grade3 = scan.nextInt();
                int averageOf3 = (grade + grade2 + grade3) / 3;

                if (averageOf3 >= 70) System.out.println("YOU PASSED!");
                else System.out.println("YOU FAILED!");

                System.out.println("\nTask-8");
                System.out.println("Enter 3 numbers");
                int n1 = scan.nextInt(), n2 = scan.nextInt(), n3 = scan.nextInt();
                if(n1 == n2 && n1 == n3 && n2 == n3) System.out.println("TRIPLE MATCH");
                else if (n1 == n2 || n2 == n3 || n1 == n3)
                    System.out.println("DOUBLE MATCH");
                else System.out.println("NO MATCH");


    }
}
