import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExample {

    public static void main(String[] args) {
        String inputFile = "input.txt";     // Specify input file path
        String outputFile = "output.txt";   // Specify output file path

        try (FileInputStream fis = new FileInputStream(inputFile);  // Initialize FileInputStream
             FileOutputStream fos = new FileOutputStream(outputFile)) { // Initialize FileOutputStream

            int byteData;
            // Read each byte from inputFile and write it to outputFile
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData); // Write byte to output file
            }
            System.out.println("File has been successfully copied to outputFile.txt");
        } catch (IOException e) {
            System.out.println("An error occurred during file reading/writing.");
            e.printStackTrace();
        }
    }
}

