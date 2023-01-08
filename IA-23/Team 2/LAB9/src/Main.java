public class Main {
    public static void main(String[] args) {
        printResults(0);
        printResults(17);
        printResults(50);
        printResults(48);
        printResults(47);
        printResults(49);
        printResults(15);
    }

    public static int toBinaryString(int j) {
        if (j == 0) {
            throw new IllegalArgumentException("Type some values into matrix");
        }
        String binary = Integer.toString(j, 2);
        System.out.println(binary);
        return j;
    }
    static void printResults(int k) {
        try {
            System.out.println("result: ");
            toBinaryString(k);
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}