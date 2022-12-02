public class task5 {
    public static void main(String[] args){
        printResult("01111");
        printResult("10111");
        printResult("01111111");
        printResult("example");
        printResult("another example");
    }

    public static int binaryStringToInt(String numbersText){
        boolean isOnlyDigits = true;
        for(int i = 0; i < numbersText.length() && isOnlyDigits; i++) {
            if(!Character.isDigit(numbersText.charAt(i))) {
                isOnlyDigits = false;
            }
        }
        if (!isOnlyDigits){
            throw new IllegalArgumentException("text of numbers not consist numbers :(");
        } else {
            return Integer.parseInt(numbersText,2);
        }
    }
    public static void printResult(String text){
        try {
            System.out.println(binaryStringToInt(text));
        } catch (IllegalArgumentException e) {
            System.out.println("Expection!!! " + e.getMessage());
        }
    }
}

