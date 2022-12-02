public class task11 {
    public static void main(String[] args){
        printResult("fOr Exampl3 wE USE this Method");
        printResult("W54e ALSO CAN US35645 THIS EX548MPLE F0541R THIS M3597THOD");
        printResult("and457 also57412 a11 l0wer case letters");
        printResult("575217325341132354261371923712");
        printResult("8745484621349543906734");
    }
    public static String upperToLower(String text){

        boolean isOnlyDigits = true;
        for(int i = 0; i < text.length() && isOnlyDigits; i++) {
            if(!Character.isDigit(text.charAt(i))) {
                isOnlyDigits = false;
            }
        }
        if (isOnlyDigits){
            throw new IllegalArgumentException("text its only numbers :(");
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
