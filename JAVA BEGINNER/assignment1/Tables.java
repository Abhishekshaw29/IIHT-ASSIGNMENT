// Write a program that accepts an integer as input and prints the table of that integer up to 12.
// For example, is the user enters 7, the output should be:
// 7 x 1 = 7
// 7 x 2 = 14
// .....
// 7 x 12 = 84
package assignment1;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.println(number +" x "+ i +" = "+ number*i);
        }
    }
    
}
