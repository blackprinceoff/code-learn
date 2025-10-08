package IOStream;

import java.io.*;

public class BufferReaderWriter {
    public static void main(String[] args) {
        /*
        BufferedReader дозволяє читати текст рядок за рядком за допомогою readLine().
        BufferedWriter дозволяє ефективно писати текст і додавати нові рядки за допомогою newLine().
        */
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("filename.txt"))){
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("error reading file");
        }

        try (BufferedWriter writer = new BufferedWriter((new FileWriter("filename.txt")))){
            writer.write("Hello");
            writer.newLine();
            writer.write("hello");
            System.out.println("Successfully wrote to file");
        } catch (IOException e){
            System.out.println("Error writing");
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("filename.txt", true))){
            bw.newLine();
            bw.write("Append line");
            System.out.println("Success");
        } catch (IOException e){
            System.out.println("hi");
        }
    }
}
