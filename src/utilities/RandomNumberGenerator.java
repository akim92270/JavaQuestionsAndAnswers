package utilities;

public class RandomNumberGenerator {
    //Create a method that takes 2 numbers and return a random
    public static int getRandomNumber(int start, int end) {
        return (int) ((Math.random() * (end - start + 1)) + start);
    }
}
