package loops.forLoop;

public class FindSumOfNumbers {
    public static void main(String[] args) {

        //1. Create a result container eventually will have your answer
        int sum = 0;

        //2. Start filling your result
        for(int i = 10; i <= 15; i++) {
            sum += i;
        }
        //3. Print out your result
            System.out.println(sum);


    }
}
