import java.util.regex.*;
public class Task7 {
    public static void main(String[] args) {
        printResults("The user with the nickname koala757677 this month left 3 times more comments than the user with the nickname croco181dile181920 4 months ago");
        printResults("There are 40 people in our group, but i am 36th on the list");
        printResults("");
        printResults("Soon the New Year");
    }

    public static int intToHexString(String i) {
        if (i.isEmpty()) {
            throw new IllegalArgumentException("Немає єлементів");
        } else {
            int count = 0;
            Pattern pattern = Pattern.compile("[a-zA-Z]+\\s|[a-zA-Z]$");
            Matcher matcher = pattern.matcher(i);
            while (matcher.find())
                count++;
            return count;
        }
    }

    static void printResults (String i){
        System.out.print("Текст: " + i + "\n" + " кількість слів: ");
        try {
            System.out.println(intToHexString(i));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
