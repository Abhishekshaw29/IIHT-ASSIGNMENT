package assignment1;

public class BubbleSort {
    public static void main(String[] args) {
        
    int ar[] = {16,12,434,43,0,3422,-4,100};
    int n = ar.length;
    for (int i = 0; i < n; i++) {
        for (int j = i+1; j < n ; j++) {
            if(ar[i]>ar[j]){
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }

        }
    }
    for (int i : ar) {
        System.out.print(i + " ");
    }
    
}
}