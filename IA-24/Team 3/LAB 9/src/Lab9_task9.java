public class Lab9_task9 {
    public static void main(String[] args) {
        printResults("");
        printResults("The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago");
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
