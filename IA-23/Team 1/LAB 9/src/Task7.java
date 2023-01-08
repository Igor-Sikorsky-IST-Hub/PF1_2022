public class Task7 {
    public static void main(String[] args) {

        printResults("I Love111 you");
        printResults("I love u1111 dfdfdf 2 fdfddf1111");
        printResults("");

    }

    public static String task(String sentence) {
        String[] words = sentence.split(" ");
        int count = words.length;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (Character.isDigit(word.charAt(i))) {
                    count -= 1;
                    break;

                }
            }

        }

        if (sentence.isEmpty()) {
            throw new IllegalArgumentException("No words.");
        }
        return String.valueOf(count);
    }

    static void printResults(String sentence) {
        System.out.print("The sentence has ");
        try {
            System.out.println(task(sentence) + " words.");
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}