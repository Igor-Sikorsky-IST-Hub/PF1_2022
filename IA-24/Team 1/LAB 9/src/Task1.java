public class Task1 {
    public static void main(String[] args) {
        printResults(51966);
        printResults(1027309);
        printResults(2);
        printResults(64206);
    }

    public static String intToHexString(int i) {
        if (i <= 15) {
            throw new IllegalArgumentException("аргумент = " + i);
        } else {
            StringBuilder result = new StringBuilder();
            int ost;
            while (i > 0) {
                ost = i % 16;
                i=i/16;
                if (ost == 10) {
                    result.insert(0, "A");
                } else if (ost == 11) {
                    result.insert(0, "B");
                } else if (ost == 12) {
                    result.insert(0, "C");
                } else if (ost == 13) {
                    result.insert(0, "D");
                } else if (ost == 14) {
                    result.insert(0, "E");
                } else if (ost == 15) {
                    result.insert(0, "F");
                }
            }
            return result.toString();
        }
    }

    static void printResults (int i){
        System.out.print("Аргумент: " + i + " результат: ");
        try {
            System.out.println(intToHexString(i));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}