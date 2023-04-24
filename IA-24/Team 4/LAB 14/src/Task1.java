import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        //Test with legal arguments
        System.out.print("Test 1: ");
        printResult("IO/task1/input.txt", "IO/task1/output.txt");

        //Test with null as argument
        System.out.print("Test 2: ");
        printResult(null, null);

        //Test with wrong path
        System.out.print("Test 3: ");
        printResult("smth.txt", "somewhere.txt");
    }

    private static void copyToUpperCase(String source, String destination) throws IOException {
        if (source != null && destination != null) {
            try (FileReader fileReader = new FileReader(source);
                 BufferedReader bufferedFileReader = new BufferedReader(fileReader);
                 FileWriter fileWriter = new FileWriter(destination);
                 BufferedWriter bufferedFileWriter = new BufferedWriter(fileWriter)) {

                String line;
                while ((line = bufferedFileReader.readLine()) != null) {
                    bufferedFileWriter.write(line.toUpperCase());
                    bufferedFileWriter.newLine();
                }
            }
        } else {
            throw new IllegalArgumentException("Empty argument!");
        }
    }

    private static void printResult(String source, String destination) {
        try {
            copyToUpperCase(source, destination);
            System.out.println("Done successfully!");
        } catch (FileNotFoundException f404Ex) {
            System.out.println("Wrong path or such files doesn't exist!");
        } catch (IOException ioEx) {
            System.out.println("Something happened while working with file!");
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}
