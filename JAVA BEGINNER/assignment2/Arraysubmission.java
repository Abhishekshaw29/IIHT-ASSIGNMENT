/*
Write a program which performs addition of 
elements which are stored in two arrays of type double.
Arrays lengths may be variable in size.
The resultant values must be stored in an integer array.
Display the resultant integer array in a formatted way.
*/
package assignment2;

public class Arraysubmission {
    public static void main(String[] args) {
        double  [] arr1 = {10.0,20.0,30.0};
        double  [] arr2 = {10.0,20.0,30.0,40.0,50.0};
        int m = arr1.length;
        int n = arr2.length;
        int x = Math.max(m,n);
        int y = Math.min(m, n);
        int result[] = new int[x];
        for (int i = 0; i < y ; i++){
            result[i] = (int)(arr1[i] + arr2[i]);
        }
        if(m>n){
            for (int i = y; i < x ; i++){
                result[i] = (int)(arr1[i]);
            }
        }
        else{
            for (int i = y; i < x ; i++){
                result[i] = (int)(arr2[i]);
            }
        }
        for(int i = 0; i < x; i++) {
            System.out.println(result[i]);
        }    
        
    }
}