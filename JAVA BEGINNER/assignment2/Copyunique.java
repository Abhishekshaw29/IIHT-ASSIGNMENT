package assignment2;
import java.util.*;
public class Copyunique {

    public void uniqElements(int arr1[], int arr2[] ){
        int n = arr1.length;
        int m = arr2.length;
        int result[] = new int[m+n];
        // System.arraycopy(src, srcPos, dest, destPos, length);
        System.arraycopy(arr1,0,result,0,n);
        System.arraycopy(arr2 , 0 , result,n,m);
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();   
          for (int c : result) {
            if (hashmap.containsKey(c)) {
                hashmap.put(c, hashmap.get(c) + 1);
            }
            else {
                hashmap.put(c, 1);
            }
        }
        for (Map.Entry entry : hashmap.entrySet()) {
            if(entry.getValue().equals(1)){
                System.out.println(entry.getKey());
            }
        }  


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

       
        sc.close();
    }
}
