package assignment1;
import java.util.EnumSet;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TestUSN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Uno = sc.nextLine();
        boolean res = validateUno(Uno);
        if(res){
            System.out.println("Success");
        }
        else
        System.out.println("Failure");
    }

    public static boolean validateUno(String uno) {
        return Pattern.matches("[1-2]{1}[A-Z]{2}[0-9]{2}[CS|EC|IS|ME]{2}[0-9]{3}", uno);
    }
}
