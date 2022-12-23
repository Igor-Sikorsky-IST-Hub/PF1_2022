public class SortInsertion implements SortType{
	@Override
    public byte[] sort(byte[] arr){
    	for (int i = 1; i<arr.length; i++) {
    		byte main = arr[i];
    		int index = i-1;	
    		while((index>=0) && (main>arr[index])) {
    			arr[index+1] = arr[index];
    			index=index-1;
    		}
    		arr[index+1]=main;
    	}
        return arr;
    }
}
