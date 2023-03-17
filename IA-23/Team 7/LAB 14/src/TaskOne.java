import java.io.*;
public class TaskOne{
    public static void main(String[] args) throws IOException {
        printResult("C:\\Users\\Asus\\Desktop\\PF1_2022\\IA-23\\Team 7\\LAB 14\\src\\task1.txt");
    }
    static String firstLongestString(String fileName) throws IOException{
        String longestString = "";
        String presentString;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName), 512);) {
            while ((presentString = bufferedReader.readLine()) != null) {
                if(longestString.length()<presentString.length()){
                    longestString = presentString;
                }
            }
        }catch (FileNotFoundException ex){
            longestString = "File Not Found";
        }finally{
            return longestString;
        }
    }

    public static void printResult(String filename) throws IOException {
        System.out.println("Найдовший рядок файлу: " + firstLongestString(filename));
    }
}
