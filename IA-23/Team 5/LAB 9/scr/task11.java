import java.util.regex.Pattern;

public class task11 {
    public static void main(String[] args){
        printResult("fOr Exampl3 wE USE this Method");
        printResult("W54e ALSO CAN US35645 THIS EX548MPLE F0541R THIS M3597THOD");
        printResult("and457 also57412 a11 l0wer case letters");
        printResult("575217325341132354261371923712");
        printResult("8745484621349 543906734");
        printResult("");

    }
    public static String upperToLower(String text){
        boolean verify = text.matches("[0-9]+[\\. ]?[0-9]*");
        if (verify | text.isEmpty()) {
            throw new IllegalArgumentException("This text consist only numbers or Empty");
        } else {
            return text.toLowerCase();
        }

    }

    public static void printResult(String text){
        try {
            System.out.println(upperToLower(text));
        } catch (IllegalArgumentException e) {
            System.out.println("Expection!!! " + e.getMessage());
        }
    }
}
