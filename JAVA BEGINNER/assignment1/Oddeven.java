package assignment1;

/*
Write a program that reads in a number from the user and then displays the Hailstone sequence for that number.
The problem can be expressed as follows:

• Pick some positive integer and call it n.

• If n is even, divide it by two.

• If n is odd, multiply it by three and add one
*/

import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Please Enter a postive number");
        }
        else{
            int count = 0;
            while (number !=1){
                if(number % 2 == 0){
                    System.out.println(number + " is even so i take half: "+ number/2);
                    number /=2;

                }
                else{
                    System.out.println(number +" is odd so i make 3n+1: "+ ((3*number) + 1));
                    number = (3*number) + 1;
                }
                count++; 
            }

            System.out.println("There are total "+ count +" steps to reach 1");

        }
    }
}
