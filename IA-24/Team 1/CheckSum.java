import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class CheckSum {
    public static void main(String[] args) throws IOException {
        System.out.println(checkSum("C:\\Users\\kille\\IdeaProjects\\lab_14\\src\\second.bin"));
    }

    public static byte checkSum(String fileName) throws IOException {
        byte[] buffer = new byte[1024];
        int bytesRead;
        int checksum = 0;

        try (FileInputStream fis = new FileInputStream(fileName)) {
            while ((bytesRead = fis.read(buffer)) != -1) {
                for (int i = 0; i < bytesRead; i++) {
                    checksum ^= buffer[i];
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return (byte)checksum;
    }
}


