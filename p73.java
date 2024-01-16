import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class p73 {
    public static void main(String[] args) {
        // Reading from a file
        String sourceFilePath = "C:\\Users\\BAPS\\Desktop\\c programs\\p73.txt";
        readFromFile(sourceFilePath);

        // Writing to a file
        String destinationFilePath = "C:\\Users\\BAPS\\Desktop\\c programs\\p73.txt";
        writeToFile(destinationFilePath, "Hello, this is a line written to the file with java.");

        // Copying a file
        String copiedFilePath = "C:\\Users\\BAPS\\Desktop\\c programs\\p73.txt";
        copyFile(sourceFilePath, copiedFilePath);
    }

    private static void readFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            System.out.println("Reading from file:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("Writing to file: " + content);
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copyFile(String sourceFilePath, String destinationFilePath) {
        Path sourcePath = Paths.get(sourceFilePath);
        Path destinationPath = Paths.get(destinationFilePath);

        try {
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully to: " + destinationFilePath);
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
