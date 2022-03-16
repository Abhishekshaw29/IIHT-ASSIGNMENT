
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		List <CarModel> cObj = new ArrayList<CarModel>();
		for(int i=0; i<n; i++) {
			System.out.println("Enter details car number "+ (i+1));
            sc.nextLine();
			String ln = sc.nextLine();
			String md = sc.nextLine();
			double cm = sc.nextDouble();
			int es = sc.nextInt();
			sc.nextLine();
			CarModel e = new CarModel(ln, md, cm, es);
			cObj.add(e);
		}
		
		CarModel carObject = new CarModel();
        System.out.println("Enter model");
		String model = sc.nextLine();
		carObject.findCarList(model, cObj);
		List<CarModel> sList =  carObject.sortCarList(cObj);
		for (CarModel carModel : sList) {
			System.out.println(carModel);
		}
		carObject.findCarList(12.0, 12, cObj);
	}
}