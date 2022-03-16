
public class bubbleSort {
	static void bubbleSortMethod(int[] arr) {
		int temp = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<(arr.length-1); j++) {
				if(arr[j-1]>arr[j])
				{
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 5, 78, 43, 100};
		bubbleSortMethod(arr);
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
}
