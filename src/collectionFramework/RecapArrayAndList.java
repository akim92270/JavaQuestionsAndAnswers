package collectionFramework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class RecapArrayAndList {
    public static void main(String[] args) {
        /*
        Create an int array to store 1,5,7,9,10
        Then print out Array
         */

        System.out.println("\n------int array-----\n");
        int[] array = {1,5,7,9,10};
        System.out.println(Arrays.toString(array));
        System.out.println(array[2]);

        System.out.println("\n------String array-----\n");
        String[] cities = {"Tokyo", "Berlin", "Oslo", "Denver", null, null};
        System.out.println(Arrays.toString(cities));

        System.out.println("\n------ array-----\n");

        ArrayList<String> names1 = new ArrayList<>();
        List<String> names2 = new ArrayList<>();

    }
}
