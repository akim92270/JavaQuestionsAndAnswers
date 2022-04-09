package loops.forLoop;

public class PrintNubersAscending {
    public static void main(String[] args) {
        /*
        Write a Java program to print numbers from 1 to 10 (1 and 10 are included)
        Expected output:
         */

        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum += i;
        }
            System.out.println(sum);

    }
}
