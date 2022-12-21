import java.util.concurrent.ThreadLocalRandom;

public class Task63 {
    public static void main(String[] args) {
        printModifiedArray(makeArray(8, -8, 8 ));
        printModifiedArray(makeArray(8, Integer.MIN_VALUE, Integer.MAX_VALUE));
        printModifiedArray(makeArray(0, 0, 0 ));
        printModifiedArray(makeArray(-1, -8, 8 ));
        printModifiedArray(null);
        printModifiedArray(makeArray(Integer.MAX_VALUE, -5, 8));
    }

    public static int[] makeArray(int length, int minValue, int maxValue) {
        try {
            int[] numArray = new int[length];
            for (int i = 0; i < length; i++) {
                int randomInt = ThreadLocalRandom.current().nextInt(minValue, maxValue);
                numArray[i] = randomInt;
            }
            return numArray;
        } catch (NegativeArraySizeException | OutOfMemoryError e) {
            return null;
        }
    }

    public static int arrayMaxValue(int[] array) {
        int maxValue = 0;
        for (int element : array) {
            if (element > maxValue) {
                maxValue = element;
            }
        }
        return maxValue;
    }

    public static int[] modifyNumArray(int[] inArray) {
        // check if inArray exists
        if (inArray == null) {
            throw new NullPointerException("inArray doesn't exist");
        }

        int[] outArray = new int[inArray.length];
        int maxValue = arrayMaxValue(inArray);
        for (int i = 0; i < inArray.length; i++) {
            if (inArray[i] < 0) {outArray[i] = inArray[i] + maxValue;}
            else if (inArray[i] == 0) {outArray[i] = 1;}
            else if (inArray[i] > 0) {outArray[i] = inArray[i] * 2;}
        }
        return outArray;
    }

    public static void printModifiedArray(int[] inArray) {
        try {
            int[] outArray = modifyNumArray(inArray);

            // print array in appropriate way
            System.out.print("Modified array: [");
            for (int i = 0; i < outArray.length; i++) {
                System.out.print(outArray[i]);
                if (i != outArray.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        } catch (NullPointerException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }

}
