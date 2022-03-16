package assignment3;

import java.util.Scanner;

public class generatepassword {
    public static String generatepassword(String name,int age,int id){
        String one = Integer.toString(id);
        String three = Integer.toString(age);
        String password  = one + name.length() + three + name.hashCode();
        return password;
    }
    public static void main(String[] args) {
        String name = "Kritka";
        int age = 22;
        int id = 48;
        System.out.println(generatepassword(name,age,id));

        

    }
}
