package collectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
    /*The only difference between HashSet vs LinkedHashSet
    LinkedHashSet keeps the insertion order.
     */
    public static void main(String[] args) {
        LinkedHashSet<String> words = new LinkedHashSet<>();
        words.add("Foo");
        words.add("Bar");
        words.add("foo");
        words.add("BAR");
        words.add(null);
        words.add(null);
        words.add("John");
        words.add("John");

        System.out.println(words);
    }
}
