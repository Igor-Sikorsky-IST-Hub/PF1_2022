public class Task1 {
    public static void main(String[] args) {

        printResults(2024);
        printResults(51966);
        printResults(0);

    }
    public static String task(int value){
        String hex = Integer.toHexString(value);
        if (value <= 15) {
            throw new IllegalArgumentException("Because argument = " + value + ".");
        }

        return hex.toUpperCase();
    }

    static void printResults(int value) {
        System.out.print("Argument: " + value + " result: ");
        try {
            System.out.println(task(value) + ".");
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}