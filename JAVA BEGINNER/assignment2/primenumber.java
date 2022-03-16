package assignment2;

import java.util.Scanner;
public class primenumber {
   
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
        int num = sc.nextInt();
        System.out.println(isPrime(num));

    }
}
