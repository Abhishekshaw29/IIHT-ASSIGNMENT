package assignment1;

public class InsertionSort {

    public static void insertionSort(int arr[]) {

        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        
        


        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        
        int ar[] = {16,12,434,43,0,3422,-4,100};
        insertionSort(ar);
     
    }
}
