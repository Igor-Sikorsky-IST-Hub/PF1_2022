public class SortBuble implements SortType{
	@Override
    public byte[] sort(byte[] arr){
    	for (int i = arr.length; i>0; i--) {
    		for (int j = 0; j<i-1; j++) {
    			if (arr[j]<arr[j+1]) {
    				byte k = arr[j];
    				arr[j]=arr[j+1];
    				arr[j+1]= k;
    			}	
    		}
    	}
        return arr;
    }
}    
