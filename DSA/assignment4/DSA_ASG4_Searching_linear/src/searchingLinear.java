
public class searchingLinear {
	public static boolean search(int key, int[] arr) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key)
				count++;
		}
		
		if(count>=0)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {45,48,105,75,96};
		System.out.println(search(45, arr));
	}
}
