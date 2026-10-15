import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class TextEditor {
    public static void main(String[] args) {

        String fileName = "notes.txt";
        String content = "Welcome to Java Text Editor!\n"
                       + "FileWriter writes text to a file.\n"
                       + "FileReader reads text from a file.";

        // Write content to the file
        try (FileWriter writer = new FileWriter(fileName)) {

            writer.write(content);
            System.out.println("Content written successfully.");

        } catch (IOException e) {
            System.out.println("Error writing file: "
                               + e.getMessage());
        }

        // Read content from the file
        try (FileReader reader = new FileReader(fileName)) {

            System.out.println("\nFile Content:");

            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: "
                               + e.getMessage());
        }
    }
}
