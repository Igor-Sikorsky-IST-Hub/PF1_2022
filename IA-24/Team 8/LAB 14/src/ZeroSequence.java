import java.io.*;

public class ZeroSequence {
    public static void main(String[] args) {
        catchMist();
    }
    static void catchMist(){
        try {
            String filename = "binaryFile.bin";
            System.out.println(longestZeroSequenceLength(filename));
        } catch (IOException e) {
            System.out.println("Ooops, IO exception!");
        }
    }
    static long longestZeroSequenceLength(String filename) throws IOException {
        File file = new File(filename);

        if (!file.exists() || !file.isFile()) {
            throw new FileNotFoundException("File not found.");
        }

        long maxZeroSeqLength = 0;
        long currentZeroSeqLength = 0;

        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                for (int i = 0; i < bytesRead; i++) {
                    byte b = buffer[i];
                    if (b == 0) {
                        currentZeroSeqLength++;
                    } else {
                        if (currentZeroSeqLength > maxZeroSeqLength) {
                            maxZeroSeqLength = currentZeroSeqLength;
                        }
                        currentZeroSeqLength = 0;
                    }
                }
            }

            if (currentZeroSeqLength > maxZeroSeqLength) {
                maxZeroSeqLength = currentZeroSeqLength;
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found: " + filename);
        }

        return maxZeroSeqLength;
    }
}

