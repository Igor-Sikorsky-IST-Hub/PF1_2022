import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FirstLongestString {
    public static void main(String[] args) throws Exception {
        System.out.println(mainMethod("C:\\Users\\kille\\IdeaProjects\\lab_14\\src\\first.txt"));
    }

    public static String mainMethod(String filename) throws Exception {

        FileReader fr = new FileReader(filename);
        Scanner scan = new Scanner(fr);

        String str = "";
        int len = 0;

        while (scan.hasNextLine()) {
            String st = scan.nextLine();
            if (st.toCharArray().length >= len) {
                len = st.toCharArray().length;
                str += st + "\n";
            }
        }
        fr.close();
        return str;
    }
}


