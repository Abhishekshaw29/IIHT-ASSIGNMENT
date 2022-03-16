package assignment1;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTriplet {

    public static void pairedElements(int ar[], int sum)
    {
        int low = 0;
        int high = ar.length - 1;
 
        while (low < high) {
            if (ar[low] + ar[high] == sum) {
                System.out.println("The triplet is : "
                                   + ar[low] + " , " + ar[high] + " , "+sum);
            }
            if (ar[low] + ar[high] > sum) {
                high--;
            }
            else {
                low++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] =sc.nextInt();
        }
        Arrays.sort(ar);
        for(int i=0;i<n;i++){
            pairedElements(ar,ar[i]);
        }
        

    }
}
