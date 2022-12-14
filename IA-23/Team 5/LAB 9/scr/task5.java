public class task5 {
    public static void main(String[] args){
        printResult("01111");
        printResult("10111");
        printResult("01111111");
        printResult("");
        printResult("example");
    }

    public static int binaryStringToInt(String numbersText){
        return Integer.parseInt(numbersText, 2);
    }
    public static void printResult(String text){
        try {
            System.out.println(binaryStringToInt(text));
        } catch (NumberFormatException e) {
            System.out.println("Expection!!! where numbers? ");
        }
    }
}

