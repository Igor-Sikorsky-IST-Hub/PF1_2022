public class Test_sort {
    public static void main(String[] args) {
        Sort firstMachine = new Sort();

        firstMachine.setTypeOfSorting(new Selection_sort());
        firstMachine.setArray(new long[]{642795, 458702, 564709, 475802, 542987, 514532, 785489});
        firstMachine.executeSorting();

        firstMachine.setTypeOfSorting(new Insertion_sort());
        firstMachine.setArray(new long[]{642795, 458702, 564709, 475802, 542987, 514532, 785489});
        firstMachine.executeSorting();

        firstMachine.setTypeOfSorting(new Bubble_sort());
        firstMachine.setArray(new long[]{642795, 458702, 564709, 475802, 542987, 514532, 785489});
        firstMachine.executeSorting();
    }
}