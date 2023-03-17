import java.io.*;

public class Task8 {
    public static void main(String[] args) throws IOException {
        String inputPath = "C:\\Users\\Asus\\Desktop\\PF1_2022\\IA-23\\Team 7\\LAB 14\\src\\task1.txt";
        String outputPath = "C:\\Users\\Asus\\Desktop\\PF1_2022\\IA-23\\Team 7\\LAB 14\\src\\task2.txt";
        cypher(inputPath, outputPath, (byte) 4);
    }

    static void cypher(String source, String destination, byte key) throws IOException {
        String line = "";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(source), 512);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destination), 512)){
            while ((line = bufferedReader.readLine()) != null){
                byte[] byteText = line.getBytes("UTF-8");
                for(int i = 0; i<byteText.length; i++){
                    byteText[i] = (byte)(byteText[i]^key);
                }
                String newLine = new String(byteText, "UTF-8");
                bufferedWriter.write(newLine);
            }
        }catch (FileNotFoundException ex){
            System.out.println("File not found");
        }
    }
}

