package assignment3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		Customer[] cusArr = new Customer[n];
		
		for(int i=0; i<n; i++) {
			cusArr[i] = new Customer();
			cusArr[i].setName(sc.nextLine());
			cusArr[i].setMobile(sc.nextLine());
			cusArr[i].setFeedbackRating(sc.nextDouble());
			sc.nextLine();
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(cusArr[i].getName()+" : "+cusArr[i].getFeedbackRating()+" out of 5");
		}
	}

}
