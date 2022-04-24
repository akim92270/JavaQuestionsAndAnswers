package collectionFramework;

import java.util.Collections;
import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        /*
        String - String
        key - value
        Ukraine -> Kiev
        Spain -> Madrid
        Portugal -> Lisbon
        Italy -> Rome
        US -> Washington DC
        Canada -> Ottawa
         */
        HashMap<String,String> capitals = new HashMap<>();
        capitals.put("Ukraine", "Kiev");
        capitals.put("Spain", "Madrid");
        capitals.put("Portugal", "Lisbon");
        capitals.put("Italy", "Rome");
        capitals.put("US", "Washington DC");
        capitals.put("Canada", "Ottawa");

        //Printing a HashMap
        System.out.println(capitals);
    }
}
