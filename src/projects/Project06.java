package projects;

import java.util.Scanner;

public class Project06 {
    public static void main(String[] args) {

        System.out.println("\nTask-1\n");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = scan.nextLine().trim();


        int count = 1;
        if (!sentence.contains(" ")) {
            System.out.println("This sentence does not have multiple words");
        } else
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ')
                    count++;
                System.out.println("This sentence has " + count + " words.");
            }


        System.out.println("\nTask-2\n");

        System.out.println("Please enter a word");
        String sentence2 = scan.nextLine();

        String reverse = "";
        if (!sentence2.isEmpty()) {
            for (int i = sentence2.length() - 1; i >= 0; i--) reverse += sentence2.charAt(i);
            System.out.println("This word is " + ((sentence2.equals(reverse)) ? "" : "not ") + "palindrome");
        } else System.out.println("This word does not have 1 or more characters");


        System.out.println("\nTask-3\n");

        System.out.println("Enter a sentence");
        String s = scan.nextLine().toLowerCase();

        int countA = 0;
        if (s.length() > 0) {
            for (int i = 0; i < s.length(); i++) if (s.charAt(i) == 'a') countA++;
            System.out.println("This sentence has " + countA + " a or A letters");
        } else System.out.println("This sentence does not have any characters");

        System.out.println("\nTask-4\n");
        System.out.println("Please enter a positive number");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 6 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 3 == 0) System.out.println("Bar");
            else System.out.println(i);
        }
    }
}