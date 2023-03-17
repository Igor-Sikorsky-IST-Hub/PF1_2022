import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ShortestString {
    public static void main(String[] args) {
        catchMist();

    }
    static void catchMist(){
        try {
            String filename = "task2lab3.txt";
            System.out.println(lastShortestString(filename));
        } catch (IOException e) {
            System.out.println("Ooops, IO exception!");
        }
    }
    static String lastShortestString(String filename) throws IOException {
        String result="";
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            result = reader.readLine();
            while ((line = reader.readLine()) != null) {
                if (line==null || line.isEmpty()){
                    continue;
                }
                else if(line.length()<=result.length()){
                    result=line;
                }
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found: " + filename);
        }
        return result;
    }
}