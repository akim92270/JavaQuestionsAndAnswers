package oop_principles.class_objects;

public class AppleTest {
    public static void main(String[] args) {
        //Create 2 Apple objects

        Apple apple1 = new Apple();
        apple1.color = "Red";
        apple1.taste = "Sweet";
        apple1.price = 0.99;

        System.out.println(apple1.color); //Red
        System.out.println(apple1.taste); //Sweet
        System.out.println(apple1.price); //0.99

        Apple apple2 = new Apple();


    }
}
