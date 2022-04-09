package arrays;

import java.util.Arrays;

public class _08_Practice_Count_Words {
    public static void main(String[] args) {

        /*
        Task-1
        Assume you are given a String as below
        Please find how many words you have in the given String

        String s1 = "Today is Tuesday"

        Result:
        3
         */
        String s1 = "Today is Tuesday";

        int hasWords = 1;
        for (int i = 0; i < s1.length(); i++) {
            if(Character.isWhitespace(s1.charAt(i))) hasWords++;

        }
        System.out.println(hasWords);


        String[] words = s1.split(" ");
        System.out.println(words.length);

        /*
        TASK-2
        Assume you are given a String as below
        Please find how many words you have in the given String starts with A or a

        String s2 = "Some countries I visited were Argentina, Belgium and Malta";

        RESULT:
        2
         */

        String s2 = "Some countries I visited were Argentina, Belgium and Malta";
        String[] countries = s2.split(" "); //[Some, countries, I, visited, were, Argentina,, Belgium, and, Malta]

        int countA = 0;
        for(String country: countries){
            if(country.toLowerCase().startsWith("a")) countA++;
        }
        System.out.println(countA);

        System.out.println(Arrays.toString(countries));

        int count = 0;
        for (int i = 0; i < countries.length; i++) {
            if(countries[i].startsWith("a") || countries[i].startsWith("A")) count++;
        }
        System.out.println(count);



    }
}
