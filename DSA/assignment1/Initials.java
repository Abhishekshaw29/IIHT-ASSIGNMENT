package assignment1;

import java.util.Scanner;

public class Initials {

    public static String init(String name) {
        String temp="";
        for (int i = 0; i < name.length(); i++) {
                if(name.charAt(i) >= 'A'  && name.charAt(i) <= 'Z'){
                    temp += name.charAt(i); 
                }
        }
        
    return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String getInit = init(name);
        System.out.println(getInit);
        
    }
}
