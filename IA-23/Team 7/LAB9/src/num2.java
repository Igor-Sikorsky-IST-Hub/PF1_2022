public class num2 {
    public static void main(String[] args) {
        printResult(51966);
        printResult(40356);
    }

    public static String intToHexString(int i) {
        int b;
        String newNumber = "";
        while (i != 0) {
            for (int k = 0; true; k++) {
                if (i < Math.pow(16, k)) {
                    b = (int) Math.floor(i / Math.pow(16, k - 1));
                    if (b > 0 && b < 10) {
                        newNumber += Integer.toString(b);
                    }
                    if (b == 11) {
                        newNumber += "B";
                    }
                    if (b == 10) {
                        newNumber += "A";
                    }
                    if (b == 12) {
                        newNumber += "C";
                    }
                    if (b == 13) {
                        newNumber += "D";
                    }
                    if (b == 14) {
                        newNumber += "E";
                    }
                    if (b == 15) {
                        newNumber += "F";
                    }
                    i = (int) (i % Math.pow(16, k - 1));
                    break;
                }
            }
        }
        return newNumber;
    }

    public static void printResult(int i){
        System.out.println(i);
        System.out.println(intToHexString(i));
        System.out.println();
    }
}
