package arrays;

public class _07_Practice_Find_The_Longest_String {
    public static void main(String[] args) {

        String[] colors = {"red", "blue", "yellow", "white"};

        /*
        Find the string that has the most characters and print
         */

        String longestWord = "";
        for (String color : colors) {
            if(color.length() > longestWord.length()) longestWord = color;
        }
        System.out.println(longestWord);
    }
}
