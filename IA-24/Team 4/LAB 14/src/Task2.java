import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        //Test with legal arguments
        System.out.print("Test 1: ");
        printResult("IO/task2/input.txt", "IO/task2/parts", 512);

        //Test with null as argument
        System.out.print("Test 2: ");
        printResult(null, null, 0);

        //Test with wrong path
        System.out.print("Test 3: ");
        printResult("smth.txt", "somewhere.txt", 200);
    }

    private static void split(String source, String destinationPrefix, long maxSize) throws IOException {

        if (source == null || destinationPrefix == null || maxSize <= 0) {
            throw new IllegalArgumentException("IllegalArgument!");
        }

        final int DEFAULT_SIZE = 4194304;
        byte[] bytes = new byte[maxSize < DEFAULT_SIZE ? (int) maxSize : DEFAULT_SIZE];
        int i = 0;

        try (FileInputStream fileInputStream = new FileInputStream(source);
             BufferedInputStream bufferedFileInputStream = new BufferedInputStream(fileInputStream)) {

            flag:
            while (true) {
                int written = 0;
                String destination = destinationPrefix + String.format(".%03d", i);

                try (FileOutputStream fileOutputStream = new FileOutputStream(destination);
                     BufferedOutputStream bufferedFileOutputStream = new BufferedOutputStream(fileOutputStream)) {

                    while (written < maxSize) {
                        int read;
                        if ((read = bufferedFileInputStream.read(bytes)) == -1) {
                            break flag;
                        }
                        bufferedFileOutputStream.write(bytes, 0, read);
                        written += read;
                    }
                }
                i++;
            }
        }
    }

    private static void printResult(String source, String destinationPrefix, long maxSize) {
        try {
            split(source, destinationPrefix, maxSize);
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


