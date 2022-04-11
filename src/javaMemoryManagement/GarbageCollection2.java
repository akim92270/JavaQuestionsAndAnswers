package javaMemoryManagement;

public class GarbageCollection2 {
    public static void main(String[] args) {

        Dog dog = new Dog();

        System.out.println(dog); // Dog@1b6d3586 reference Heap

        dog = null; //dog reference is lost
        System.gc();
    }
}
