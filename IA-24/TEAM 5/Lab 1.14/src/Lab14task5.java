import java.io.*;
import java.util.*;

public class Lab14task5 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String inputFileName = "D:/мое/progr_repo/PF1_2022/IA-24/Team 5/Lab 1.14/src/file.txt"  ; //default value for debugging
        if (args.length == 1){
            inputFileName = args[0];
        }
        else
        {
            System.out.println("please use as: java Lab14task5.java fimeName");
        }
        
        System.out.println("Обробляємо файл: " + inputFileName);
        try {
            System.out.println("В цьому файлі знайдено " + numberOfWords(inputFileName) + " слів.");    
        } catch (IOException e) {
            System.out.println("Unexpected error: " + e);
        }
    }

    public static long numberOfWords(String filename) throws IOException {
        if (filename == null){
            throw new NullPointerException("filename can not be null!");
        }
        if (filename.isEmpty()){
            throw new IllegalArgumentException ("filename can not be empty!");
        }
        int counterWords = 0;
        try (FileReader fr = new FileReader(filename); BufferedReader reader = new BufferedReader(fr)) {
            while(reader.ready()) {
                String line = reader.readLine().trim();
                if(!line.isEmpty()){ // need for correct processing empty lines in file
                    counterWords += line.split("\\s+").length;
                }
            }
        }
        return counterWords;
    }
 
}