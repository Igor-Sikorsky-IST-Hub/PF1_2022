import java.io.*;


public class Main {
    public static void main(String[] args) {
        task5("E:\\try.txt");
        task11("E:\\sourcePrefix000.txt", "E:\\destination.txt");
        task11("E:\\sourcePrefix001.txt", "E:\\destination.txt");
        task11("E:\\sourcePrefix002.txt", "E:\\destination.txt");
    }

    static void task5(String filename) {
        try {
            System.out.println("Кількість слів у файлі: " + numberOfWords(filename));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Some problems with IO.");
        }
    }

    static void task11(String sourcePrefix, String destination) {
        try {
            unsplit(sourcePrefix, destination);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Some problems with IO.");
        }
    }

    static long numberOfWords(String filename) throws IOException {
        if (filename == null) {
            throw new NullPointerException("Назва файлу не може бути пустою.");
        }
        int counter = 0;
        int checker = -1;
        FileInputStream inputStream = new FileInputStream(filename);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        int value;
        while ((value = bufferedInputStream.read()) != -1) {
            if ((checker != ' ' && checker != '\n') && (value == ' ' || value == '\n')) {
                counter++;
            }
            checker = value;
        }
        bufferedInputStream.close();
        inputStream.close();
        return ++counter;
    }

    static void unsplit(String sourcePrefix, String destination) throws IOException {
        if (sourcePrefix == null || destination == null) {
            throw new NullPointerException("Назва файлу не може бути пустою.");
        }
        char[] buf = new char[1024];
        try (Reader readerOfSource = new FileReader(sourcePrefix);
             Writer writerInDestination = new FileWriter(destination, true)) {

            int readed1;
            while ((readed1 = readerOfSource.read(buf)) != -1) {
                writerInDestination.write(buf, 0, readed1);
            }
            writerInDestination.write("\n");
        }
    }
}
