package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework15 {
    public static void main(String[] args) {

        System.out.println("\n-------------Task-1------------------\n");
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(23);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);

        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);

        System.out.println("\n-------------Task-2------------------\n");

        List<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);

        System.out.println("\n-------------Task-3------------------\n");

        List<Integer> num = new ArrayList<>();

        num.add(23);
        num.add(-34);
        num.add(-56);
        num.add(0);
        num.add(89);
        num.add(100);

        System.out.println(num);
        Collections.sort(num);
        System.out.println(num);

        System.out.println("\n-------------Task-4------------------\n");

        List<String> cities = new ArrayList<>();

        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");

        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("\n-------------Task-5------------------\n");

        List<String> marvelCharacters = new ArrayList<>();

        marvelCharacters.add("Spider Man");
        marvelCharacters.add("Iron Man");
        marvelCharacters.add("Black Panter");
        marvelCharacters.add("Deadpool");
        marvelCharacters.add("Captain America");

        System.out.println(marvelCharacters);

        boolean isWolwerine = false;
        for (String marvelCharacter : marvelCharacters) {
            if (marvelCharacter.equals("Wolwerine")) {
                isWolwerine = true;
                break;
            }
        }
        System.out.println(isWolwerine);

        System.out.println("\n-------------Task-6------------------\n");

        List<String> avengersCharacters = new ArrayList<>();

        avengersCharacters.add("Hulk");
        avengersCharacters.add("Black Widow");
        avengersCharacters.add("Captain America");
        avengersCharacters.add("Iron Man");

        Object[] avengerCharacters1 = avengersCharacters.toArray();

        Arrays.sort(avengerCharacters1);
        System.out.println(Arrays.toString(avengerCharacters1));

        System.out.println(Arrays.binarySearch(avengerCharacters1,"Hulk") >= 0 &&
                Arrays.binarySearch(avengerCharacters1,"Iron Man") >= 0);

        /* Collections.sort(avengersCharacters);
        System.out.println(avengersCharacters);

        String hulkAndIronMan = "";
        for (String avenger : avengersCharacters) {
            if (avenger.equals("Hulk") || avenger.equals("Iron Man") ) {
                hulkAndIronMan += avenger;
            }
        }
        System.out.println(hulkAndIronMan.contains("Hulk") && hulkAndIronMan.contains("Iron Man"));
        }

         */

        System.out.println("\n-------------Task-7------------------\n");

        List<Character> c = new ArrayList<>();
        c.add('A');
        c.add('x');
        c.add('$');
        c.add('%');
        c.add('9');
        c.add('*');
        c.add('+');
        c.add('F');
        c.add('G');

        for (Character character : c) {
            System.out.println(character);
        }

        System.out.println("\n-------------Task-8------------------\n");

        List<String> object = new ArrayList<>();

        object.add("Desk");
        object.add("Laptop");
        object.add("Mouse");
        object.add("Monitor");
        object.add("Mouse-Pad");
        object.add("Adapter");

        System.out.println(object);

        Collections.sort(object);

        System.out.println(object);

        int countM = 0;
        int countAOrE = 0;
        for (String s : object) {
            if(s.toLowerCase().startsWith("m")) countM++;
            if(!s.toLowerCase().contains("a") && !s.toLowerCase().contains("e")) countAOrE++;
        }
        System.out.println(countM);
        System.out.println(countAOrE);


        System.out.println("\n-------------Task-9------------------\n");

        ArrayList<String> objectKitchen = new ArrayList<>();

        objectKitchen.add("Plate");
        objectKitchen.add("spoon");
        objectKitchen.add("fork");
        objectKitchen.add("Knife");
        objectKitchen.add("cup");
        objectKitchen.add("Mixer");

        System.out.println(objectKitchen);

        int upperCase = 0;
        int lowerCase = 0;
        int p = 0;
        int pp = 0;

        for (String s : objectKitchen) {
            if(Character.isUpperCase(s.charAt(0))) upperCase++;
            else if(Character.isLowerCase(s.charAt(0))) lowerCase++;

            if(s.toLowerCase().contains("p")) p++;
            if(s.toLowerCase().startsWith("p") || s.toLowerCase().endsWith("p")) pp++;
        }
        System.out.println("Elements starts with uppercase = " + upperCase);
        System.out.println("Elements starts with lowercase = " + lowerCase);
        System.out.println("Elements having P or p = " + p);
        System.out.println("Elements starting or ending with P or p = " + pp);

        System.out.println("\n-------------Task-10-----------------\n");

        ArrayList<Integer> num1 = new ArrayList<>();

        num1.add(3);
        num1.add(5);
        num1.add(7);
        num1.add(10);
        num1.add(0);
        num1.add(20);
        num1.add(17);
        num1.add(10);
        num1.add(23);
        num1.add(56);
        num1.add(78);

        System.out.println(num1);

        int divided10 = 0;
        int greaterThan15 = 0;
        int oddLess20 = 0;
        int greater50OrLessThan15 = 0;

        for (Integer nums : num1) {
            if(nums % 10 == 0) divided10++;
            if(nums % 2 == 0 && nums >= 15) greaterThan15++;
            if(nums % 2 == 1 && nums <= 20) oddLess20++;
            if(nums < 15 || nums >= 50) greater50OrLessThan15++;
        }
        System.out.println("Elements that can be divided by 10 = " + divided10);
        System.out.println("Elements that are even and greater than 15 = " + greaterThan15);
        System.out.println("Elements that are odd and less than 20 = " + oddLess20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + greater50OrLessThan15);
    }
}