package loops.doWhileLoop;

import java.util.Random;

public class UnderstandingDoWhileLoop {
    public static void main(String[] args) {

        Random random = new Random();
        boolean b = random.nextBoolean();

        while(b){
            System.out.println("It is true");
        }
    }
}
