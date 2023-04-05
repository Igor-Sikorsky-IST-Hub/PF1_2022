import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Task2 {
    public static void main(String[] args) {
        String filename = "D:/lab14/task2text.txt"; // шлях до тестового файлу

        try {
            String result = Task2.lastShortestString(filename);
            System.out.println("Result: " + result);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    public static String lastShortestString(String filename) throws IOException {
        if (filename == null) {
            throw new NullPointerException("Filename cannot be null.");
        }

        String result = null;
        int minLength = Integer.MAX_VALUE;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                int length = line.length();
                if (length < minLength) {
                    result = line;
                    minLength = length;
                } else if (length == minLength) {
                    result = line;
                }
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found: " + filename);
        } catch (IOException e) {
            throw new IOException("Error reading file: " + filename);
        }

        if (result == null) {
            throw new IOException("File is empty: " + filename);
        }

        return result;
    }
}
