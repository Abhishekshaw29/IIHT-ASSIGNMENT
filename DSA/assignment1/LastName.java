package assignment1;

import java.util.Scanner;

public class LastName {
    public static void nameChange(String fname1,String lname1,String fname2,String lname2){

        String name1 = fname1 +" "+ lname2;
        String name2 = fname2 +" "+ lname1;
        System.out.println(name1);
        System.out.println(name2);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fname1 = sc.next();
        String lname1 = sc.next();
        String fname2 = sc.next();
        String lname2 = sc.next();
        nameChange(fname1, lname1, fname2, lname2);
        
    }
}
