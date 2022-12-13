public class MainProgramm {
	public static void main(String[] args) {
		ByteArray firstBuble = new ByteArray(new byte[]{22, 1, 6, -3, 87, -77, 0, 0, -22, 1});
		firstBuble.selectSorting(new SortBuble());
		firstBuble.printResults(firstBuble.arr);
		ByteArray secBuble = new ByteArray(new byte[]{5, 4, 3, 0, -2, 7});
		secBuble.selectSorting(new SortBuble());
		secBuble.printResults(secBuble.arr);
     
		ByteArray firstSelection = new ByteArray(new byte[]{22, 1, 6, -3, 87, -77, 0, 0, -22, 1});
		firstSelection.selectSorting(new SortSelection());
		firstSelection.printResults(firstSelection.arr);
		ByteArray secSelection = new ByteArray(new byte[]{5, 4, 3, 0, -2, 7});
		secSelection.selectSorting(new SortSelection());
		secSelection.printResults(secSelection.arr);

		ByteArray firstInsertion = new ByteArray(new byte[]{22, 1, 6, -3, 87, -77, 0, 0, -22, 1});
		firstInsertion.selectSorting(new SortInsertion());
		firstInsertion.printResults(firstInsertion.arr);
		ByteArray secInsertion = new ByteArray(new byte[]{5, 4, 3, 0, -2, 7});
		secInsertion.selectSorting(new SortInsertion());
		secInsertion.printResults(secInsertion.arr);
    }
}
