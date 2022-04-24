package collectionFramework;

import java.util.ArrayList;
import java.util.TreeSet;

public class Exercise02_find_second_greatest {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(5);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(3);

        //Second greatest = 5
        //Second smallest = 5

        TreeSet<Integer> uniques = new TreeSet<>(numbers);
        System.out.println(uniques); // [3, 5, 7]

        ArrayList<Integer> uniquesL = new ArrayList<>(uniques);
        System.out.println(uniquesL.get(uniquesL.size()-2)); // 5
        System.out.println(uniquesL.get(1)); // 5


    }
}
