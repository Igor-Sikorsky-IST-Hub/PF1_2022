public class num2 {
    public static void main(String[] args) {
        printResult(51966);
        printResult(40356);
    }

    static String intToHexString(int i) {
        int b;
        StringBuilder changeAbleString = new StringBuilder("");
        while (i != 0) {
            for (int k = 0; true; k++) {
                if (i < Math.pow(16, k)) {
                    b = (int) Math.floor(i / Math.pow(16, k - 1));
                    if (b > 0 && b < 10) {
                        changeAbleString = changeAbleString.append(b);
                    }
                    if (b == 11) {
                        changeAbleString = changeAbleString.append("B");
                    }
                    if (b == 10) {
                        changeAbleString = changeAbleString.append("A");
                    }
                    if (b == 12) {
                        changeAbleString = changeAbleString.append("C");
                    }
                    if (b == 13) {
                        changeAbleString = changeAbleString.append("D");
                    }
                    if (b == 14) {
                        changeAbleString = changeAbleString.append("E");
                    }
                    if (b == 15) {
                        changeAbleString = changeAbleString.append("F");
                    }
                    i = (int) (i % Math.pow(16, k - 1));
                    break;
                }
            }
        }
        String a;
        a = changeAbleString.toString();
        return a;
    }

    static void printResult(int i){
        System.out.println(i);
        System.out.println(intToHexString(i));
        System.out.println();
    }
}
