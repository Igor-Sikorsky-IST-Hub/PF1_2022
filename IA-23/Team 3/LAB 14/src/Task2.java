import java.io.FileInputStream;
import java.io.IOException;

public class Task2 {
    static long longestZeroSequenceLength(String filename) {
        long longestZeroSequenceLength = 0;
        long currantZeroSequenceLength = 0;
        try (FileInputStream stream = new FileInputStream(filename)) {
            byte[] byteList = stream.readAllBytes();
            for (byte bt: byteList) {
                if (bt == 0) {
                    currantZeroSequenceLength++;
                } else {
                    if (longestZeroSequenceLength < currantZeroSequenceLength) {
                        longestZeroSequenceLength = currantZeroSequenceLength;
                        currantZeroSequenceLength = 0;
                    }
                }
            }
            return longestZeroSequenceLength;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }

    }
}
