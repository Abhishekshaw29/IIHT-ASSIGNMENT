package assignment4;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Customer Details");
		
		Long id = sc.nextLong();
		sc.nextLine();
		String name = sc.nextLine();
		char gender = sc.nextLine().charAt(0);
		String email = sc.nextLine();
		String contactNumber = sc.nextLine();
		
		Customer c = new Customer(id,name,gender,email,contactNumber);
		
		System.out.println(c.toString());
	}

}
