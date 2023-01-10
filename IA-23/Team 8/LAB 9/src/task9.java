public class task9 {
    public static void main(String[] args) {
        printResults("The user with the nickname koala757677 this month wrote 3 times more comments than " +
                "the user with the nickname croco181dile920 4 months ago");
        printResults("Привіт");
        printResults("");
        printResults("Iphone-14");
    }

    public static int GetAmountOfCombinationsLettersAndNumbers(String row) {
        int combinationsAmount = 0;
        String[] words = row.split(" ");
        for (String word:words) {
            boolean letterIsAvailable = false;
            boolean digitIsAvailable = false;
            for (char sign:word.toCharArray()) {
                if (Character.isLetter(sign)) {letterIsAvailable = true;}
                if (Character.isDigit(sign)) {digitIsAvailable = true;}
                if (letterIsAvailable & digitIsAvailable) {
                    combinationsAmount++;
                    break;
                }
            }
        }
        return combinationsAmount;
    }

    public static void printResults(String row) {
        System.out.print("Знайдено ");
        try {
            System.out.print(GetAmountOfCombinationsLettersAndNumbers(row) + " комбінацій");
            System.out.println();
        } catch (OutOfMemoryError e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
