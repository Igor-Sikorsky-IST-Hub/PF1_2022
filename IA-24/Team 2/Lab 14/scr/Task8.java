import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Task8 {
        public static void main(String[] args) {
            String sourceFile = "D:/lab14/task8text.txt"; // шлях до вихідного файлу
            String destFile = "D:/lab14/task8text_encrypted.txt"; // шлях до файлу, у який будуть записані зашифровані дані
            byte key = 42; // ключ шифрування

            try {
                Task8.cypher(sourceFile, destFile, key);
                System.out.println("File encrypted successfully.");
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    public static void cypher(String source, String destination, byte key) throws IOException {
        if (source == null || destination == null) {
            throw new NullPointerException("Source and destination filenames cannot be null.");
        }

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {
            int b;
            while ((b = fis.read()) != -1) {
                byte encryptedByte = (byte) (b ^ key);
                fos.write(encryptedByte);
            }
        } catch (IOException e) {
            throw new IOException("Error processing files: " + e.getMessage());
        }
    }
}
