package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args) {
        /*
        Create a file called as studentList.txt
        After creating, put a wait for 5 seconds, and delete it
         */

        File file = new File("studentList.txt");

        try {
            file.createNewFile();
            Thread.sleep(5000);

            //Write some info to file
            FileWriter filerWriter = new FileWriter("studentList.txt");
            filerWriter.write("Abe\n");
            filerWriter.write("Vita\n");
            filerWriter.write("Torrie\n");
            filerWriter.write("Taylor\n");
            filerWriter.close(); //save

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            file.delete();
        }

        System.out.println("End of the program!");
    }
}