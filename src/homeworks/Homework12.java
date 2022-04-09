package homeworks;

import primitives.Char;
import utilities.CharacterHelper;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {

        System.out.println("\n-------Task-1---------\n");

        int[] ints = new int[10];
        ints[0] = 89;
        ints[2] = 23;
        ints[4] = 12;
        ints[6] = 15;
        ints[7] = 34;
        ints[9] = 7;

        System.out.println(ints[3]);
        System.out.println(ints[0]);
        System.out.println(ints[9]);
        System.out.println(Arrays.toString(ints));

        System.out.println("\n-------Task-2---------\n");

        String[] strings = new String[5];
        strings[1] = "abc";
        strings[4] = "xyz";

        System.out.println(strings[3]);
        System.out.println(strings[0]);
        System.out.println(strings[4]);
        System.out.println(Arrays.toString(strings));


        System.out.println("\n-------Task-3---------\n");

        int[] ints1 = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(ints1));
        Arrays.sort(ints1);
        System.out.println(Arrays.toString(ints1));

        System.out.println("\n-------Task-4---------\n");

        String[] strings1 = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(strings1));
        Arrays.sort(strings1);
        System.out.println(Arrays.toString(strings1));


        System.out.println("\n-------Task-5---------\n");
        String[] cartoons = {"Scooby Doo", "Snoopy Blue", "Pluto", "Dino", "Sparky"};

        System.out.println(Arrays.toString(cartoons));
        System.out.println(Arrays.binarySearch(cartoons, "Pluto") >= 0);

        System.out.println("\n-------Task-6---------\n");

        String[] cartoons1 = {"Garfield", "Tom", "Sylvester", "Azrael", "Felix"};
        Arrays.sort(cartoons1);
        System.out.println(Arrays.toString(cartoons1));
        System.out.println(Arrays.binarySearch(cartoons1, "Garfield") >= 0 && Arrays.binarySearch(cartoons1, "Felix") >= 0);


        System.out.println("\n-------Task-7---------\n");
        double[] doubles = {10.5, 20.75, 70.0, 80.0, 15.75};
        System.out.println(Arrays.toString(doubles));
        System.out.println(doubles[0]);
        System.out.println(doubles[1]);
        System.out.println(doubles[2]);
        System.out.println(doubles[3]);
        System.out.println(doubles[4]);

        System.out.println("\n-------Task-8---------\n");
        char[] chars = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
        System.out.println(Arrays.toString(chars));

        int letters = 0, lowercase = 0, upperCase = 0, digits = 0, specialCharacters = 0;
        for (char aChar : chars) {
            if (Character.isLetter(aChar)) {
                letters++;
                if (Character.isUpperCase(aChar)) {
                    upperCase++;
                } else {
                    lowercase++;
                }
            } else {
                if (Character.isDigit(aChar)) {
                    digits++;
                } else
                    specialCharacters++;
            }
        }
        System.out.println("Letters = " + letters);
        System.out.println("Uppercase = " + upperCase);
        System.out.println("Lowercase = " + lowercase);
        System.out.println("Digits = " + digits);
        System.out.println("Special characters = " + specialCharacters);

        System.out.println("\n-------Task-9---need to fix this part------\n");

        String[] store = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        System.out.println(Arrays.toString(store));

        int uppercase1 = 0, lowercase1 = 0, bP = 0, bookPen = 0;
        for (String stores: store){

            if (CharacterHelper.isUppercase(stores.charAt(0))) uppercase1++;  // Character.isUpperCase() you can use this too
            else if (Character.isLowerCase(stores.charAt(0)))lowercase1++;

            if (stores.toLowerCase().charAt(0) == 'b' || stores.toLowerCase().startsWith("p")) bP++;
            if (stores.toLowerCase().contains("book") || stores.toLowerCase().contains("pen")) bookPen++;
        }
        System.out.println("Elements starts with uppercase = " + uppercase1 +
                "\nElements starts with lowercase = " + lowercase1 +
                "\nElements starting with B or P = " + bP +
                "\nElements having ”book” or “pen”= " +bookPen);

        System.out.println("\n-------Task-10---------\n");

        int[] num = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        System.out.println(Arrays.toString(num));

        int num1 = 0, num2 = 0, num3 = 0;
        for (int i : num) {
            if (i > 10) num1++;
            else if (i < 10) num2++;
            else num3++;
        }
        System.out.println("Elements that are more than 10 = " + num1);
        System.out.println("Elements that are less than 10 = " + num2);
        System.out.println("Elements that are 10 = " + num3);

        System.out.println("\n-------Task-11---------\n");

        int[] first = {5, 8, 13, 1, 2};
        int[] second = {9, 3, 67, 1, 0};


        System.out.println("1st array is = " + Arrays.toString(first));
        System.out.println("2nd array is = " + Arrays.toString(second));

        int[] third = new int[5];

        for (int i = 0; i < third.length; i++) {
            third[i] = Math.max(first[i], second[i]);
        }
        System.out.println("3rd array is = " + Arrays.toString(third));



        for (int i = 1; i < 7; i++)
        {
            for (int y = 1; y <= 5; y++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");
        for (int i = 0; i < 5; i++)
        {
            for (int j = 3; j >= 1; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}