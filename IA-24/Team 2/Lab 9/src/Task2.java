public class Task2 {
    public static void main(String[] args) {
        printResults(6437);
        printResults(-3764);
        printResults(17);
        printResults(Integer.MAX_VALUE);
        printResults(Integer.MIN_VALUE);
        printResults(56);
    }

    private static double printResults(int i) {
        try {
            System.out.println(intToBinaryString(i));
        } catch (NumberFormatException e) {
            System.out.println("Задано невірне число");
        }
        return 0;
    }

    static String intToBinaryString(int i) {
        String binaryNumber = "";
        if ( i<0 | i==Integer.MAX_VALUE | i==Integer.MIN_VALUE) {
            throw new NumberFormatException();
        }
        while (i > 0) {
            binaryNumber = (( i % 2) == 0 ? "0" : "1") + binaryNumber;
            i = i/ 2;
        }
        return binaryNumber;


    }

}



