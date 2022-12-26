public class Task7 {
    public static void main(String[] args) {
        printResults(
                "The user with the nickname koala757677 this month left" +
                        " 3 times more comments than the user with the nickname" +
                        " croco181dile181920 4 months ago");
        printResults("One 1Two th1ree1 56 four 7");
        printResults("One 1Two th1ree1 56 four 7.");
        printResults("");
    }

    // 1. Ловимо сполучення типу: " koala75 ", " 1koala75 ", " koala75 56 ", " "
    // 2. Помилкою вважаємо порушення умов задачі: Об’єкт String представляє собою
    // речення, що містить слова (складаються з літер a-z, A-Z), цілі числа
    // (складаються з цифр 0-9), та комбінації літер та цифр
    public static int countWords(String s) {
        if (s == "") {
            throw new IllegalArgumentException("param s is empty");
        } else if (s.matches("(.*)[^a-z|A-Z|0-9|\s](.*)")) {
            throw new IllegalArgumentException("param s contains incorrect symbol(s)");
        }
        String regExp = "\s*(\s*\\w*\\d+\\w*)+\s*\\d*\s*|\s";
        // for (String x : s.split(regExp)) {
        // System.out.println(x);
        // }
        return s.split(regExp).length;
    }

    static void printResults(String s) {
        System.out.println("s: " + s);
        try {
            System.out.println("result: " + countWords(s));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
