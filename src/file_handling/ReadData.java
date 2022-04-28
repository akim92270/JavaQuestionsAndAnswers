package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) {
        /*
        1. Create a new txt file called shoppingList
        2. Write all items below
        Ice-cream
        Fruits
        Pen
        Paper
        Milk
         */

        File file = new File("shoppingList.txt");
        try{
            FileWriter fileWriter = new FileWriter("shoppingList.txt");
            fileWriter.write("Ice-cream");
            fileWriter.write("Fruits");
            fileWriter.write("Pen");
            fileWriter.write("Paper");
            fileWriter.write("Milk");
            fileWriter.close();

            //How to read information from a file
            Scanner scan = new Scanner(file);

            /*
            for (int i = 0; scan.hasNextLine(); i++){
                Thread.sleep(1000);
                System.out.println("Item " + i + scan.nextLine());
            }
             */
            int index = 1;
            while(scan.hasNextLine()) {
                System.out.println("Item " + index++ + scan.hasNextLine());
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            file.delete();
        }
        System.out.println("End of Program!");
    }
}
