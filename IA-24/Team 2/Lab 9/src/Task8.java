public class Task8 {
    public static void main(String[] args) {
        printResults("I have 22 bananas , 121 pencils, and 32 apples");
        printResults("The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago");
        printResults("Hello Biden. It`s Zelenskiy. We need 5 000 000 000 rockets to bomb Donetsk children. Slava Ukraini!!!");
        printResults("");


    }
    public static int countingNumerals(String sentence) {
        String[] sarr;
        int count;
        if (sentence.isEmpty()) {
            throw new IllegalArgumentException("Речення не введено");
        } else {
            sarr = sentence.split(" ");
            count = 0;
            for (String str : sarr) {
                try {
                    Integer.parseInt(str);
                } catch (NumberFormatException e) {
                    count++;
                }
            }
        }
        return sarr.length - count;
    }
    static void printResults (String i){
        System.out.print("Речення: " + i + "\n" + "Кількість чисел: ");
        try {
            System.out.println(countingNumerals(i));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }

}
