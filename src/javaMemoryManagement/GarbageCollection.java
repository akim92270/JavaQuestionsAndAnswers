package javaMemoryManagement;

public class GarbageCollection {
    public static void main(String[] args){

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        System.out.println("\n---------object references before losing reference----------\n");

        System.out.println(dog1); //javaMemoryManagement.Dog@1b6d3586
        System.out.println(dog2); //javaMemoryManagement.Dog@4554617c
        System.out.println(dog1.equals(dog2)); //false

        System.out.println("\n---------object references after losing reference----------\n");

        dog1 = dog2; // dog is losing reference here and garbage collected

        //Explicitly doing Garbage Collection
        System.gc();
        Runtime.getRuntime().gc();

        System.out.println(dog1); //javaMemoryManagement.Dog@4554617c
        System.out.println(dog2); //javaMemoryManagement.Dog@4554617c
        System.out.println(dog1.equals(dog2)); //true

    }
}
