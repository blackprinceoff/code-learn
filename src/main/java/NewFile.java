import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class NewFile {
    public static void main(String[] args) {
        var x = 10;
        System.out.println(x);
        try {
            File file = new File("text.txt");
            if (file.createNewFile()){
                System.out.println("File created");
            } else {
                System.out.println("File not created");
            }
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        //File write
        try {
            FileWriter writer = new FileWriter("text.txt");
            writer.write("Hello ");
            writer.write("Myroslav");
            writer.close();
            System.out.println("Writed to file");
        } catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }

        //File read
        try {
            Scanner reader = new Scanner(new File("text.txt"));
            while (reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }

        //File info
        File file = new File("text.txt");
        if (file.exists()) {
            System.out.println("Name: " + file.getName());
            System.out.println("Path: " + file.getPath());
            System.out.println("CanWrite: " + file.canWrite());
            System.out.println("CanRead: " + file.canRead());
            System.out.println("Size in bytes: " + file.length());
        } else {
            System.out.println("file not exist");
        }

        //Delete File
        if (file.delete()){
            System.out.println("Deleted " + file.getName());
        } else {
            System.out.println("smth wrong");
        }

    }
}
