package lab14;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task7 {
    public static void main(String[] args){
    	try {
            String filename="testTask7.txt";
            System.out.println("Сума за модулем 2 (XOR) усіх байтів: " + checkSum(filename));
        } catch (IOException  e) {
            System.out.println("EXCEPTION! File not found.");
        } catch (IllegalArgumentException  e) {
            System.out.println(e.getMessage());  
        }
    }
    static byte checkSum(String filename) throws IOException {
    	byte res = 0;
    	BufferedReader reader = null;
        try {
        	reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    int c = Character.digit(line.charAt(i), 2); 
                    if (c!=0 && c!=1) {
                		throw new IllegalArgumentException("Файл не підходить під роботу програми");
                	}
                    res ^= c;
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