package Lab9;

public class Main {
    public static void main(String[] args) {
        printResults("");
        printResults("Користувач з ніком m6estr0 цього" +
                " місяця написав в 3 рази більше коментарів ніж" +
                " користувач з ніком Sherst 4 місяці тому");
        printResults("465ad ads94798 sad9asd7 64 asd");
    }

    private static int printResults(String sentence) {
        System.out.println("Результат:");
        try {
            System.out.println(check(sentence));
        } catch (NumberFormatException e) {
            System.out.println("Ви задали пусте речення");
        }
        return 0;
    }


    private static int check(String sentence) {
        if (sentence == "" || sentence == " ") {
            throw new NumberFormatException();
        }
        int k = 0;
        String[] splited = sentence.toLowerCase().split(" ");
        for (String i : splited) {
            if (i.matches("([a-z]+[0-9]+.*)|([0-9]+[a-z]+)")) {
                k++;
            }
        }
        return k;
    }
}
