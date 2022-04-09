package methods;

import utilities.MathHelper;

import static utilities.RandomNumberGenerator.getRandomNumber;

public class FindIfNumberIsEvenOrOdd {
    public static void main(String[] args) {
        /*
        Generate a random number between 17 and 33 both included.
        First, print the random number generated with a message
        "The number generated is = "
        Print "The number generated is EVEN" if the number is even.
        Print "The number generated is ODD" if the number is odd.
         */
        int r1 = getRandomNumber(17,33);
        System.out.println(" The number generated is = " + getRandomNumber(17,33));

        if(MathHelper.isEven(r1)){
            System.out.println("The number generated is EVEN");
        }else
            System.out.println("The number generated is ODD");
        }
}
