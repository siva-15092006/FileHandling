import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

/**
 * Demonstrates basic file operations in Java:
 * 1. Writing text to a file.
 * 2. Reading text from a file.
 */
public class FileoperationDemo {
    public static void main(String[] args) {
        String filename = "example.txt";
        String content = "Hello, this is a demonstration of file operations in Java.\n";

        // Writing to a file
        try (FileReader reader = new FileReader(filename)) {
            int ch;
            System.out.println("Contents of the file:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
            writer.write("it is scripted by siva\n");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Reading from a file
        try (FileReader reader = new FileReader(filename)) {
            int ch;
            System.out.println("Contents of the file:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}