import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        try {
            copyToUpperCase("...\\LAB 14\\src\\filesTask4\\inputTask4.txt",
                            "...\\LAB 14\\src\\filesTask4\\outputTask4.txt");
        } catch (IOException e) {
            System.out.println("Exception! " + e.getMessage());
        }
    }


    public static void copyToUpperCase(String source, String destination) throws IOException {
        try (BufferedReader inputReader = new BufferedReader(new FileReader(source));
             BufferedWriter outputWriter = new BufferedWriter(new FileWriter(destination))) {
            String line;
            while ((line = inputReader.readLine()) != null) {
                outputWriter.write(line.toUpperCase() + "\n");
            }
        }
    }
}
