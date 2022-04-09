package homeworks;

import java.util.ArrayList;

public class something {
    public static void main(String[] args) {
        System.out.println("\n----------Task-5------------\n");

        String[] words4 = {"abc", "foo", "bar"};

        ArrayList<String> reverse = new ArrayList<>();
        String reverse1 = "";
        for (int i = words4.length-1; i >= 0; i--) {
            reverse1 += words4[i];
        }
        System.out.println(reverse1);
    }
}
