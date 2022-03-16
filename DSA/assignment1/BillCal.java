package assignment1;
import java.util.Scanner;

public class BillCal {

       static int [] ids = new int[1];
       static int [] price = new int[1];
      static  int [] qty = new int[1];
        public static int searchItemById(int id){
                int i =0;
                for (i = 0; i < ids.length; i++) {
                        if(ids[i] == id){
                                return i;
                        }
                }
                return qty.length+1;
        }
        public static int computeBill(int price, int qty) {
                return price*qty;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < qty.length; i++) {
                    ids[i] = sc.nextInt();
                    price[i] = sc.nextInt();
                    qty[i] = sc.nextInt();
            }
            int id = sc.nextInt();
            int found = searchItemById(id);
            if(found<ids.length){
                int Total = computeBill(price[found],qty[found]);
                System.out.println(Total + " is the amount for customer id: "+ids[found]);
            }
            else{
                    System.out.println("Item Not found");
            }


        }
     
}
