package assignment2;

import java.util.Scanner;

public class Maxofthree {

    public static double findLargest(int a, int b, int c) {
        if(a >= b) {
           if(a >= c) return a;
           else return c;
        } else {
           if(b>=c) return b;
           else return c;
        }
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println(findLargest(num1, num2, num3));
    }
}
