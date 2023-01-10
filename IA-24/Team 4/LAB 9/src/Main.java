import java.lang.String;

public class Main {
    public static void main(String[] args) {
        System.out.println("__________Task1__________");
        Task1("CAFE");
        Task1("-FF");
        Task1("AAA");
        Task1("SDFa");

        System.out.println("__________Task2__________");
        Task2("The user with the nickname koala757677 this month wrote 3 times more" +
                " comments than the user with the nickname croco181dile920 4 months ago");
        Task2("123 qwerty qwerty654321");
    }

    public static void Task1(String s){
        try {
            System.out.println(hexStringToInt(s));
        }
        catch (IllegalArgumentException | NullPointerException e){
            System.out.println("Exception! " + e.getMessage());
        }
    }

    public static void Task2(String s){
        try {
            System.out.println(wordToUpperCase(s));
        }
        catch (IllegalArgumentException | NullPointerException e){
            System.out.println("Exception! " + e.getMessage());
        }
    }

    public static int hexStringToInt (String s) {
        return Integer.parseInt(s, 16);
    }

    public static StringBuilder wordToUpperCase(String s){
        StringBuilder stringResult = new StringBuilder();
        String[] words = s.split(" ");
        for (String word : words) {
            if (!isNumberInString(word)){
                stringResult.append(word.toUpperCase());
                stringResult.append(" ");
            }
            else {
                stringResult.append(word);
                stringResult.append(" ");
            }
        }
        return stringResult;
    }

    public static boolean isNumberInString(String word){
        boolean hasDigits = false;
        for(int i = 0; i < word.length() && !hasDigits; i++) {
            if(Character.isDigit(word.charAt(i))) {
                hasDigits = true;
            }
        }
        return hasDigits;
    }
}