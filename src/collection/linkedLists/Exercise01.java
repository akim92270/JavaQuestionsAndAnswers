package collection.linkedLists;

import java.util.*;

public class Exercise01 {
    public static void main(String[] args) {
        /*
        Create a list to store below data

        Berlin
        Chicago
        Dallas
        Miami
        Brugge
        Kiev

        Print the list
        Then, remove Miami and Dallas
        Print the list again

        RESULT:
        [Berlin, Chicago, Dallas, Miami, Brugge, Kiev]
        [Berlin, Chicago, Dallas, Kiev]
         */

        String[] cities1 = {"Berlin", "Chicago", "Dallas", "Miami", "Brugge", "Kiev"};
        List<String> cities = new LinkedList<>(new ArrayList<>(Arrays.asList(cities1)));

        System.out.println(cities);

        /*cities.remove("Miami");
        cities.remove("Brugge");

        System.out.println(cities);


         */

        Iterator<String> iterator = cities.iterator();

        while(iterator.hasNext()){
            String element = iterator.next();
            if(element.equals("Miami") || element.equals("Brugge")){
                iterator.remove();
            }
        }
        System.out.println(cities);
    }
}
