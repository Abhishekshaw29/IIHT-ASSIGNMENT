package assignment2;

import java.util.Scanner;

public class Areacalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shape = sc.nextLine();
        double area = 0;
        if (shape.equals("Rectangle")){
            int x = sc.nextInt();
            int y = sc.nextInt();
            area = x*y;
            System.out.println(area);
            
        }
        else if(shape.equals("Square")){
            int x = sc.nextInt();
            area = x*x;
            System.out.println(area);

        }
        else if(shape.equals("Triangle")){
            int x = sc.nextInt();
            int y = sc.nextInt();
            area = (x*y)/2;
            System.out.println(area);

        }
        else if(shape.equals("Circle")){
            float x = sc.nextFloat();
            area = 3.14 * x * x;
            System.out.println(area);
        }

    sc.close();
    }

}
