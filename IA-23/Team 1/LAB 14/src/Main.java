import java.io.*;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");

            if (!file.exists()) file.createNewFile();

            PrintWriter pw = new PrintWriter(file);
            pw.println("OKOKOKOKOK");
            pw.println("ASSIOT");
            pw.println("ASSIOTawdad");
            pw.println("ASSIOTw");
            pw.println("ASSIOawdawdawdawdT");
            pw.println("ASSIOTqwdwfqwfwfwqfqw");
            pw.close();

            System.out.println(firstLongestString(file));
            System.out.println(checkSum(file));

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public static String firstLongestString(File fileName) throws FileNotFoundException {
        String theLargestString = "";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.length() > theLargestString.length())
                    theLargestString = line;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return theLargestString;
    }

    public static byte checkSum(File fileName) throws FileNotFoundException {
        int checkSum = 0;

        try (FileInputStream input = new FileInputStream(fileName)) {
            int byteValue;
            while ((byteValue = input.read()) != -1) {
                checkSum ^= byteValue;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return (byte)checkSum;
    }
}