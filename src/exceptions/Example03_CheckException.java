package exceptions;

public class Example03_CheckException {

    public static void main(String[] args) throws InterruptedException {

        /*
        Checked exceptions are immediately required handling mechanism even before you run the code
        They are also known as compiler time exceptions

        The first way to handle checked exception is using try-catch block

        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(2000); // 2 secs
                System.out.println(i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("End of the program!");
         */


        //SECOND WAY IS ADDING EXCEPTION TO THE METHOD SIGNATURE USING throws keyword
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000); // 1 seconds
            System.out.println(i);
        }

        Thread.sleep(3000);
        System.out.println("End of the program!");
    }
}