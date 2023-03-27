import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        String source = "PF1_2022\\IA-24\\Team 3\\LAB 10\\src\\source.txt";
        String destination = "PF1_2022\\IA-24\\Team 3\\LAB 10\\src\\destination.txt";
        String filename = "PF1_2022\\IA-24\\Team 3\\LAB 10\\src\\src\\filename.txt";
        copyNoEmptyStrings(source, destination);
        System.out.println(longestZeroSequenceLength(filename));
    }


    public static long longestZeroSequenceLength(String filename) throws IOException {
        FileInputStream input = new FileInputStream(filename);
        long longestSequenceLength = 0;
        long currentSequenceLength = 0;
        int nextByte;

        while ((nextByte = input.read()) != -1) {
            if (nextByte == 48) {
                currentSequenceLength++;
                if (currentSequenceLength > longestSequenceLength) {
                    longestSequenceLength = currentSequenceLength;
                }
            } else {
                currentSequenceLength = 0;
            }
        }

        input.close();
        return longestSequenceLength;


    }
    public static void copyNoEmptyStrings(String source, String destination) throws IOException {
        try (FileReader fr = new FileReader(source);
             BufferedReader br = new BufferedReader(fr)) {
            String data;
            String temp = "";
            while (((data = br.readLine())) != null) {
                if (!data.equals("")) {
                    temp = temp.concat(data + "\n");
                }
            }
            FileWriter writer = new FileWriter(destination);
            writer.write(temp);
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, no such file");
        }
    }
}