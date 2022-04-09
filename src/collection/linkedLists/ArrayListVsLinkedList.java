package collection.linkedLists;

import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {

        LinkedList<Double> numbers = new LinkedList<>();
        numbers.add(10.5);
        numbers.add(12.5);
        numbers.add(13.3);
        numbers.add(17.7);

        System.out.println(numbers); // [10.5, 12.5, 13.3, 17.7]

        System.out.println("\n-------Looping LinkedList--------\n");
        for(Double num: numbers){
            System.out.println(num);
        }

        System.out.println("\n-------Looping fori loop--------\n");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("\n-------Some methods of LinkedList--------\n");
        System.out.println(numbers.get(0)); //10.5
        System.out.println(numbers.getFirst()); //10.5
        System.out.println(numbers.getLast()); //17.7

        System.out.println("\n-------Some additional methods of LinkedList--------\n");
        System.out.println(numbers.peek()); //getFirst() 10.5
        System.out.println(numbers.peekFirst()); //10.5
        System.out.println(numbers.peekLast()); //17.5

        System.out.println(numbers);// [10.5, 12.5, 13.3, 17.7]


        System.out.println("\n-----------------------------------\n");

        System.out.println(numbers.poll()); //retrieves the first element and removes it
        System.out.println(numbers); //[12.5, 13.3, 17.7]

        System.out.println(numbers.pollFirst()); //retrieves the first element and removes it
        System.out.println(numbers); //[13.3, 17.7]

        System.out.println(numbers.pollLast()); //retrieves the last element and removes it
        System.out.println(numbers); //[13.3]

        System.out.println("\n-----------------------------------\n"); //[13.3]

        numbers.push(5.7); //adds the object to the head(0 index);
        numbers.push(8.9); //adds the object to the head(0 index);
        System.out.println(numbers.pop());; //removes the object from the head (from the zeroth index)
        System.out.println(numbers); //[5.7, 13.3]


    }
}
