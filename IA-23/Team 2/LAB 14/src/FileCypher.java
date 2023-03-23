import java.io.*;

public class FileCypher {
    public static void main(String[] args) {
        byte[] key = {0x12, 0x34, 0x56};

        try (FileInputStream inputStream = new FileInputStream("input/input.txt");
             FileOutputStream outputStream = new FileOutputStream("output/output.txt")) {
            byte[] bt = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(bt)) != -1) {
                for (int i = 0; i < bytesRead; i++) {
                    bt[i] = (byte) (bt[i] ^ key[i % key.length]);
                }
                outputStream.write(bt, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


