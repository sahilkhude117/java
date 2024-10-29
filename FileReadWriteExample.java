import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteExample {

    public static void main(String[] args) {
        // File paths for input and output
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Initialize FileReader and FileWriter in try-with-resources to ensure closure
        try (FileReader reader = new FileReader(inputFile);
             FileWriter writer = new FileWriter(outputFile)) {
            int character;
            // Read each character from input file and write it to output file
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("File has been successfully copied to output.txt");
        } catch (IOException e) {
            System.out.println("An error occurred during file reading/writing.");
            e.printStackTrace();
        }
    }
}
