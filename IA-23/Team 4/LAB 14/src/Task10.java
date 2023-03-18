import java.io.*;
import java.nio.file.*;

public class Task10 {
    public static void main(String[] args){
        try {
            split("...\\LAB 14\\src\\filesTask10\\inputTask10.txt",
                    "...\\LAB 14\\src\\filesTask10\\outputTask10", 25);
        } catch (IOException e) {
            System.out.println("Exception! " + e.getMessage());
        }

    }
    public static void split(String source, String destinationPrefix, long maxSize) throws IOException {
        Path sourcePath = Paths.get(source);
        byte[] buffer = new byte[(int) maxSize];
        int partNumber = 0;
        try (InputStream in = Files.newInputStream(sourcePath)) {
            int bytesRead;
            while ((bytesRead = in.read(buffer)) > 0) {
                String destinationFileName = String.format("%s.%03d", destinationPrefix, partNumber++);
                Path destinationPath = Paths.get(destinationFileName);
                try (OutputStream out = Files.newOutputStream(destinationPath)) {
                    out.write(buffer, 0, bytesRead);
                }
            }
        }
    }
}
