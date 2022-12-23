import java.util.regex.*;

public class Main2 {
    public static void main(String[] args) {
        printResults("The user with the nickname Jason757677 this month left 3 times more comments than the user with the nickname Bruce181dile181920 4 months ago");
        printResults("The player Gena483 played this game for 2 month");
        printResults("His name is Jeffrey567");
        printResults("");
    }

    public static int CountNum(String str){
        if (str.length() == 0) {
            throw new IllegalArgumentException("Type some values into String");
        }
        int count = 0;
        Matcher matcher = Pattern.compile("^[0-9]+\\s|\\s[0-9]\\s|\\s[0-9]{1,}$").matcher(str);
        while (matcher.find()) {
            count += 1;
        }
        return count;
    }
    static void printResults(String str) {
        try {
            System.out.println("result: " + CountNum(str));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
