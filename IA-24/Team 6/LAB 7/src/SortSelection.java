public class SortSelection implements SortType{
	@Override
    public byte[] sort(byte[] arr){
		for (int i = 0; i<arr.length-1; i++) {
			int max = i;
    		for (int j = i+1; j<arr.length; j++) {
                if (arr[j] > arr[max]) {
                	max = j;
    			}

    		}
            byte k = arr[i];
            arr[i] = arr[max];
            arr[max] = k; 
    	}
        return arr;
    }
}