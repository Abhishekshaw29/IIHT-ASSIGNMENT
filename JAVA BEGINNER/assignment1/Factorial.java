package assignment1;
import java.util.Scanner;

/**
 * Write a program to calculate factorial of a number.
 * Example: 5! = 5*4*3*2*1.

    Input:

    Initialize/receive an integer value Output:

    Factorial of a given number is 120.
 */
import java.util.*;
public class Factorial {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int number = sc.nextInt();
        int fact  = 1;
        for (int i = 1; i <= number; i++) {
                fact = fact *i;
        }
        System.out.println("Factorial of a given number is " + fact);

    }
}