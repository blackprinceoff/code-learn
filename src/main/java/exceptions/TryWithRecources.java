package exceptions;

import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithRecources {
    public static void main(String[] args) {
        // Java close resources
        try {
            FileOutputStream output = new FileOutputStream("closeresources.txt");
            output.write("Hello".getBytes());
            output.close();
            System.out.println("successfully wrote to file");
        } catch (IOException e){
            System.out.println("Error writing file");
        }

        //try with resources, write in ()
        try (FileOutputStream outputStream = new FileOutputStream("trywithres.txt")){
            outputStream.write("Hello".getBytes());
            System.out.println("Successfully wrote to file");
        } catch (IOException e){
            System.out.println("ERROR");
        }
    }
}
