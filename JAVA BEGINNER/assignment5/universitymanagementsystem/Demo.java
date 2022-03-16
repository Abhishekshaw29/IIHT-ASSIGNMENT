package assignment5.universitymanagementsystem;

public class Demo {
    public static void main(String[] args) {
        Student ob = new Student(100,"Abhishek shaw",true);
        if (ob.isSecondChance()){
            ob.identifyMarks(80, 50);
        }
        else{
            ob.identifyMarks(100);
        }
        System.out.println("ID ="+ ob.getStudentId());
        System.out.println("Name ="+ ob.getStudentName());
        System.out.println("Marks ="+ ob.getMarks());


    }

}
