package arrays;

import java.util.Arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {

        //One student's information
        String name;

        name = "John";

        int age = 45;

        System.out.println("Name is = " + name);
        System.out.println("Age is = " + age);

        /*
        The new trend is to have multiple students information
         */

        String studentsName = "Alex, Abe, Yakeen";

        String[] names = {"Alex", "Abe", "Yakeen"};
        int[] ages = {20, 21, 22}; //Doesn't need quotation but String names double quotation.
        char[] favCharacters = {'A', '$', 'G'};
        double[] balances = {5.6, 15, 23.6};
        boolean[] doTheyLikeJava = {false, true, true};

        //HOW TO PRINT ARRAY
        System.out.println(names); // [Ljava.lang.String;@154

        Arrays.toString(names);
        System.out.println(Arrays.toString(names));

        //HOW TO GET A SINGLE ELEMENT FROM ARRAY
        System.out.println(names[1]); // Abe
        System.out.println(names[0]); // Alex
        //System.out.println(names[5]); // ArrayIndexOutOfBoundsExceptions

        // HOW TO UPDATE AN ELEMENT -> Abe -> Abraham
        names[1] = "Abraham"; // reassigning by calling by the index name.
        System.out.println(Arrays.toString(names)); //[Alex, Abraham, Yakeen]

        //Alex's age is 20 and his fav char A.
        System.out.println(names[0] + " 's age is " + ages[0] +  "and his fav char is " + favCharacters[0] + ".");
        System.out.println(names[1] + " 's age is " + ages[1] +  "and his fav char is " + favCharacters[1] + ".");
        System.out.println(names[2] + " 's age is " + ages[2] +  "and his fav char is " + favCharacters[1] + ".");

        for (int i = 0; i <= 2; i++) {
            System.out.println(names[i] + " 's age is " + ages[i] +  "and his fav char is " + favCharacters[i] + ".");

        }
    }
}
