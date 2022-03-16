public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer((long) 123,"Rohan",'M',"abc@abc.in","12345");
		Customer c2 = new Customer((long) 124,"Virat",'M',"abc@abc.in","12345");
		
		if(c1.equals(c2))
			System.out.println("Customer 1 & Customer 2 is same");
		else
			System.out.println("Customer 1 & Customer 2 is Different");
	}

}
