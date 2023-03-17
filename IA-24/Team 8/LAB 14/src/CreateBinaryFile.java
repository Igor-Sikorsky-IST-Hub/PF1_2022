import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateBinaryFile {
    public static void main(String[] args) {
        String filename = "binaryFile.bin";
        int fileSize = 100; // Розмір файлу у байтах

        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(filename))) {
            byte[] data = new byte[fileSize];
            outputStream.write(data); // записуємо масив байтів у файл
        } catch (IOException e) {
            System.out.println("Помилка при створенні файлу: " + e.getMessage());
        }
    }
}