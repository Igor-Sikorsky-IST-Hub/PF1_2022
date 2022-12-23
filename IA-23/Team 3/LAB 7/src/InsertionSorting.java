public class InsertionSorting implements SortingType{
    @Override
    public void sort(long[] inArray) {
        for (int i = 1; i < inArray.length; i++) {
            int j = i;
            while ((j > 0) && (inArray[j - 1] > inArray[j])) {
                long buffer = inArray[j];
                inArray[j] = inArray[j - 1];
                inArray[j - 1] = buffer;
                j--;
            }
        }
    }
}
