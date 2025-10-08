package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {
    public static void main(String[] args) {
        // читає файл
        try (FileInputStream fileInputStream = new FileInputStream("IOStream/filename.txt")){
            int i;

            while ((i = fileInputStream.read()) != -1){
                System.out.println((char) i);
            }
        } catch (IOException e){
            System.out.println("ERROR");
        }

        // записує в файл
        String text = "Hello";

        try (FileOutputStream outputStream = new FileOutputStream("IOStream/filename.txt")){
            outputStream.write(text.getBytes());
            System.out.println("Successfully wrote to file.");
        } catch (IOException e) {
            System.out.println("Error write");
            e.printStackTrace();
        }

        // копіює бінарний файл, наприклад png
        try (FileInputStream input = new FileInputStream("image.png");
        FileOutputStream output = new FileOutputStream("copy.img")){
            int i;

            while ((i = input.read()) != -1){
                output.write(i);
            }


            System.out.println("File copied");
        } catch (IOException e){
            System.out.println("Error copy");
        }

        // додає текст до файлу
        String text1 = "\nAppended text";
        try (FileOutputStream outputStream = new FileOutputStream("IOStream/filename.txt", true)){
            outputStream.write(text1.getBytes());
            System.out.println("success");
        } catch (IOException e){
            System.out.println("error write");
            e.printStackTrace();
        }

        /*
        Java пропонує кілька способів запису у файли. Ось коли вибрати кожен з них:

        FileWriter- найкраще підходить для простих текстових файлів . Простий та зручний у використанні.
        BufferedWriter- найкраще підходить для великих текстових файлів , оскільки це швидше та дозволяє легко додавати нові рядки.
        FileOutputStream- найкраще підходить для двійкових даних (зображень, PDF-файлів, аудіо) або коли вам потрібен повний контроль над необробленими байтами.*/

    }
}
