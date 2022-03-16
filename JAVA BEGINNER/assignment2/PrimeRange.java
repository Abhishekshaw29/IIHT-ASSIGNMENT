package assignment2;

import java.util.*;
public class PrimeRange {
    
    public static boolean isPrime(int number) {
        if (number == 1 || number == 0)
        return false;
        else{
            for (int i = 2; i <=Math.sqrt(number); i++) {
                if(number%i == 0)
                    return false;
            }
            return true;
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
