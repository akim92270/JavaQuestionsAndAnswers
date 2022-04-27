package file_handling;

import java.io.File;
import java.io.IOException;

/*
FileType One of the project I was working on were FileExtension. I created
a javascript and automated certain files to accept and reject ones we didn't need
 */

public class CreateFile {
    public static void main(String[] args) {
        //To create a file we use some classes

        File myFile = new File("myFirstFile.xls");

        try {
            System.out.println("Checking existence before creating file = " + myFile.exists()); //false
            System.out.println(myFile.createNewFile()); //true
            System.out.println("Checking existence before creating file = " + myFile.exists()); //true
            System.out.println("File name is = " + myFile.getName());
            System.out.println("Absolute path of the file = " + myFile.getAbsolutePath());

            Thread.sleep(5000);
            myFile.delete();

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("End of the program!");
    }
}

