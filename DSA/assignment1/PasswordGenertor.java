package assignment1;
import java.util.Scanner;

public class PasswordGenertor {
    public static String passwordGenertor(String fname,String mname, String lname , String age ){
        String temp = "";
        char s = age.charAt(0);
        char e = age.charAt(age.length()-1);
        for (int i = 0; i < fname.length(); i++) {
                if (i%2==0)
                temp+=fname.charAt(i);
        }
        temp+=e/2;

        for (int i = 0; i < mname.length(); i++) {
            if (i%3==0)
            temp+=fname.charAt(i);
        }
        temp+=s*2;
        for (int i = 0; i < lname.length(); i++) {
            if (i%2!=0)
            temp+=fname.charAt(i);
            
        }

        return temp;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fname = sc.next();
        String mname = sc.next();
        String lname = sc.next();
        String age = sc.next();
        String genereatedPassword = passwordGenertor(fname, mname, lname, age);
        System.out.println("Your Password is :" +  genereatedPassword);


        
    }
}
