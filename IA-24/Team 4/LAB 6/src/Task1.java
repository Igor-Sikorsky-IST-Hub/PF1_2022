public class Task1 {
    public static void main(String[] args) {
        printResults(null);
        printResults(new float[0]);
        printResults(new float[] {1.0f, 4.23f, 5.54f, 5.55f, 5.53f});
        printResults(new float[] {645.345f, 23.6f, 34.68f, 342.5f, 7.453f, 71.627f, 83.254f, 95.1f});
    }
    
    public static float[] descendBubble(float[] arr) {
        if (arr == null) {
            throw new NullPointerException("Array shouldn't be null!");
        }
        if (arr.length == 0) {
            throw new IndexOutOfBoundsException("Array shouldn't be empty!");
        }

        boolean isSorted = false;
        while (isSorted == false) {
            isSorted = true;
            for (int i = 0; i + 1 < arr.length; i++) {
                if (arr[i] < arr[i + 1]) {
                    isSorted = false;
                    float temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

    private static void printResults(float[] arr) {
        if (arr == null){
            System.out.print("array: " + arr + " result: ");
        } else {
            System.out.print("array: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }            
            System.out.print("\nresult: ");
        }
        try {
            for (float element : descendBubble(arr)) {
                System.out.print(element + " ");
            } 
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            System.out.print("Error! " + e.getMessage());
        }
        System.out.println("\n===============================================");
    }
}