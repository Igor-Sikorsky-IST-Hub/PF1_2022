public class IntToOctString {
    public static void main(String[] args) {
        printResults(511);
        printResults(-1);
        printResults(0);
    }

    public static String intToOctString(int numberToConvert) {
        return Integer.toOctalString(numberToConvert);
    }

    public static void printResults(int intToCovert) {
        try{
            System.out.println("dec: " + intToCovert + "; oct: " + intToOctString(intToCovert));
        } catch (OutOfMemoryError e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}

