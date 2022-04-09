package collection.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class _02_Practice_Remove_Duplicates {
    public static void main(String[] args) {

        List<String> objects = new ArrayList<>();
        objects.add("Cup");
        objects.add("Book");
        objects.add("Pen");
        objects.add("Cup");
        objects.add("Book");
        objects.add("Book");
        objects.add("Pencil");

        System.out.println(objects); //[Cup, Book, Pen, Cup, Book, Book, Pencil]
        /*
        Find unique elements in this and print them
        Results:
        [Cup, Book, Pen, Pencil]
         */

        List<String> uniques = new ArrayList<>();

        for (String object : objects) {
            if(!uniques.contains(object)) uniques.add(object);
        }
        System.out.println(uniques);


    }
}
