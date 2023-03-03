import java.io.*;

public class Task1 {
    static void copyNoEmptyStrings(String source, String destination) {
        try (BufferedReader in = new BufferedReader(new FileReader(source))) {
            try (FileWriter writer = new FileWriter(destination)) {
                String line;
                while((line = in.readLine()) != null) {
                    if (!line.isEmpty()) {
                        writer.write(line + "\n");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
