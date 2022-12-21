public class task4 {
    public static void main(String[] args) {
        printResult("634F");
        printResult("");
        printResult("CAFE");
        printResult("BC614E");
        printResult("47377F");
    }


    static int hexStringToInt(String s) {
        if (s.isEmpty()) {
            throw new IllegalArgumentException("Enter a value");
        }
        return Integer.parseInt(s, 16);
    }

    public static void printResult(String number) {
        try {
            System.out.println(hexStringToInt(number));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
