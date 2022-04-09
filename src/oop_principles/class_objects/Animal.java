package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Animal {
    //default constructor
    public Animal() {

    }

    //Custom constructor that takes 6 arguments - name, color, age, isHerbivore, isCarnivore, isOmnivore

    public Animal(String name, String color, int age, boolean isCarnivore, boolean isHerbivore, boolean isOmnivore) {
        //I should assign these local variables into instance variables
        this.color = color;
        this.age = age;
        this.isHerbivore = isHerbivore;
        this.isCarnivore = isCarnivore;
        this.isOmnivore = isOmnivore;
        this.name = name;
    }

    //Creating another 2 - args custom constructor
    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    //Fields of an Animal instance
    public static int noOfAnimals = 0;
    public static final boolean hasEyes = true;
    public String name;
    public String color;
    public int age;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;


    @Override
    public String toString() {
        String s = "Animal{";
        if (this.name != null) s += "name='" + this.name + '\'';
        if (this.color != null) s += ", color='" + this.color + '\'';
        if (this.age != 0) s += ", age=" + this.age;
        if (this.isCarnivore) s += ", isCarnivore=" + this.isCarnivore;
        if (this.isHerbivore) s += ", isHerbivore=" + this.isHerbivore;
        if (this.isOmnivore) s += ", isOmnivore=" + this.isOmnivore;
        s += '}';
        return s;
    }


    //Testing Animal
    public static void main(String[] args) {

        /*
        Create an animal object called a1 and define its information as below
        Cow
        3
        Black
        Herbivore
         */

        Animal a1 = new Animal("Cow", "Black", 3, false, true, false);

        System.out.println(a1);

        /*
        Create a2 object with below info
        Cat
        1
        Gray
        Omnivore

        Print it as well
         */

        Animal a2 = new Animal("Cat", "Gray", 1, false, false, true);
        System.out.println(a2);


        /*
        Create a3 object with below info
        Parrot
        2
        White
        isHerbivore
         */

        Animal a3 = new Animal("Parrot", "White", 2, false, true, false);
        System.out.println(a3);

        /*
        Create a4 object with below info
        Lion
        4
        Beige
         */

        Animal a4 = new Animal("Lion","Beige", 4, true, false, false);
        System.out.println(a4);

        /*
        Task-1
        Store your animal objects in a collection
         */

        List<Animal> animals = new ArrayList<>(Arrays.asList(a1,a2,a3,a4)); //--> this is creating an Array for
        // each object and converting it into ArrayList
        int countHerb = 0;
        int countCarni = 0;
        int countOmni = 0;
        for (Animal animal : animals) {
            if(animal.isOmnivore) countOmni++;
            else if(animal.isHerbivore) countHerb++;
            else countCarni++;
        }
        System.out.print("Herbivore = " + countHerb + " Carnivore = " + countCarni + " Omnivore = " + countOmni);
    }
}