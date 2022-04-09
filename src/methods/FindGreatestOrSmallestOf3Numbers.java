package methods;

import utilities.Calculator;
import utilities.MathHelper;
import utilities.RandomNumberGenerator;

public class FindGreatestOrSmallestOf3Numbers {
    public static void main(String[] args) {
        System.out.println(Math.max(5,Math.max(1,7)));

        //Math.max(5,1,5); // compiler error

        int max = MathHelper.maxOfThree(5,1,10);

        System.out.println("Max of three numbers = " + max);

        MathHelper.maxOfThree(1.1,1.2,1.3); //1.3

        byte b1 = (byte)(Math.random () * 10);
        byte b2 = (byte)(Math.random () * 10);
        byte b3 = (byte)(Math.random () * 10);

        System.out.println("Random 1 = " + b1);
        System.out.println("Random 2 = " + b2);
        System.out.println("Random 3 = " + b3);
        System.out.println(MathHelper.minOfThree(b1,b2,b3));


        int ab = 100, cd = 300;
        int hello = Math.abs(ab-cd);
        System.out.println(hello);

        Calculator.absoluteOf2(100,300);
        System.out.println(Calculator.absoluteOf2(100,300));

        int formula = Math.max(100,300) - Math.min(300,100);
        System.out.println(formula);

    }
}
