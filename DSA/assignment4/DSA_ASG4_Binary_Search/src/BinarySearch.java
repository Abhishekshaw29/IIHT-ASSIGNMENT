
public class BinarySearch {
	
	public boolean findElement(int[] arr, int key) {
		int l = 0, r = arr.length-1;
		
		while(r>=l) {
			int mid = (l+r) / 2;
			
			if(key < arr[mid])
				r = mid - 1;
			else if(key == arr[mid])
				return true;
			else
				l = mid + 1;
		}
		
		return false;
	}
	
	public boolean findElement(String[] arr, String key) {
		int l = 0, r = arr.length-1;
		
		while(l <= r) {
			int mid = l+(r-1)/2;
			
			int res = key.compareTo(arr[mid]);
			if(res == 0)
				return true;
			else if(res > 0)
				l = mid+1;
			else
				r = mid-1;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
	}
}
