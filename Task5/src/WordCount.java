import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) {
        String filePath = "C:\\JAVA_12980\\EDUBRIDGE.txt"; 

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int lines = 0, words = 0, chars = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                lines++;
                words += line.split("\\s+").length;
                chars += line.length();
            }

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + chars);

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}