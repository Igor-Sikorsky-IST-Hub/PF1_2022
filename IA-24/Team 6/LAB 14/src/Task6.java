package lab14;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task6 {
    public static void main(String[] args){
    	try {
            String filename="testTask6.txt";
            System.out.println("Кількість латинських літер у текстовому файлі: " + numberOfLatinCharacters(filename));
        } catch (IOException  e) {
            System.out.println("EXCEPTION! File not found.");
        }
    }
    static long numberOfLatinCharacters(String filename) throws IOException {
    	long res = 0;
    	BufferedReader reader = null;
        try {
        	reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if ((c >= 'A' && c <= 'Z')	 || (c >= 'a' && c <= 'z')) {
                    	res++;
                    }
                }
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        return res;
    }
}