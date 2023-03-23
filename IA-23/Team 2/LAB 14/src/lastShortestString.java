import java.io.*;

public class lastShortestString{
    public static void main(String[] args)
            throws IOException {
        String shortestString = null;

        try(FileReader fr = new FileReader("input/input.txt");
            BufferedReader br = new BufferedReader(fr)) {

            String str;
            while((str = br.readLine()) != null) {
                if(shortestString == null || str.length() <= shortestString.length()) {
                    shortestString = str;
                }
            }
        }
        System.out.println("The shortest string is: " + shortestString);
    }
}
