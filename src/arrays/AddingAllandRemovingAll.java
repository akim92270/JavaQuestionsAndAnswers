package arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AddingAllandRemovingAll {
    public static void main(String[] args) {

        /*
        Task-1
        Create an ArrayList of germanCars and add below items
        BMW
        Mercedes
        Volkswagen

        Then print the list.

        RESULT:
        [German cars = BMW, Mercedes, Volkswagen]
         */

        ArrayList<String> germanCars = new ArrayList<>();
        germanCars.add("BMW");
        germanCars.add("Mercedes");
        germanCars.add("Volkswagen");

        System.out.println("German cars = " + germanCars);

        /*
        Task-2
        Create an ArrayList of japaneseCars and add below items
        Honda
        Toyota
        Lexus

        Then print the list.

        RESULT:
        Japanese cars = [BMW, Mercedes, Volkswagen]
         */

        ArrayList<String> japaneseCars = new ArrayList<>();

        japaneseCars.add("Honda");
        japaneseCars.add("Toyota");
        japaneseCars.add("Lexus");

        System.out.println("Japanese cars = " + japaneseCars);


        /*
        Task-4
        Create an ArrayList of japaneseCars and add below items
        Maserati
        Telsa
        Range Rover
        Jaguar

        Then print the list.

        RESULT:
        Luxury cars =
         */

        ArrayList<String> luxuryCars = new ArrayList<>();

        luxuryCars.add("Maserati");
        luxuryCars.add("Telsa");
        luxuryCars.add("Range Rover");
        luxuryCars.add("Jaguar");

        System.out.println("Luxury cars = " + luxuryCars);


        /*
        Adding all german cars to the inventory collection
         */

        ArrayList<String> inventory = new ArrayList<>();
        System.out.println("Inventory at the beginning = " + inventory);

        //adding all german cars to the inventory collection
        inventory.addAll(germanCars);
        System.out.println("Inventory after adding german cars = " + inventory);

        //adding all luxury cars to the inventory collection
        inventory.addAll(luxuryCars);
        System.out.println("Inventory after adding luxury cars = " + inventory);

        //adding all japanese cars to the inventory collection
        inventory.addAll(1, japaneseCars);
        System.out.println("Inventory after adding japanese = " + inventory);

        //re
    }
}
