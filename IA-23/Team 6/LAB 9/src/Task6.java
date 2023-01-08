import java.util.regex.Pattern;
public class Task6 {
    public static void main(String[] args) {
        printResults("777");
        printResults("077");
        printResults("010");
        printResults("078");
        printResults("88");
        printResults("");
    }

    // перевірку на символи 01234567 виконуємо регулярним виразом
    public static int octStringToInt(String s) {
        if (s == "") {
            throw new IllegalArgumentException("param s is empty");
        } else if (s.matches("(.*)[^0-7](.*)")) {
            throw new IllegalArgumentException("param s contains incorrect symbol(s)");
        }
        double mult = Math.pow(8, s.length());
        double res = 0;
        for (char a : s.toCharArray()) {
            mult /= 8;
            res += charToOct(a) * mult;
        }
        return (int) res;
    }

    static int charToOct(char ch) {
        switch (ch) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            default:
                return 7;
        }
    }

    static void printResults(String s) {
        System.out.print("s: " + s + " result: ");
        try {
            System.out.println(octStringToInt(s));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
