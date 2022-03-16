package assignment5.studentmanagmentsystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> records = new ArrayList<Student>();
        Student ob = new Student("Abhishek shaw",001,"ASE");
        Student ob1 = new Student("Rohan nath",000,"SE");
        Student ob2 = new Student("Priya nath",002,"EE");
        records.add(ob2);
        records.add(ob);
        records.add(ob1);
        // sortbyid(records);
        sortbydept(records);

    }

    public static List<Student> sortbyid(List<Student> records){
        Collections.sort(records, new Comparator<Student>(){
            public int compare(Student e1, Student e2){
                return e1.getStudentId().compareTo(e2.getStudentId());
            }
        });
        for(Student student : records) {
            System.out.println(student);
            System.out.println("___________");
        }
        return records;

    }
    public static List<Student> sortbydept(List<Student> records){
        Collections.sort(records, new Comparator<Student>(){
            public int compare(Student e1, Student e2){
                return e1.getDepartment().compareTo(e2.getDepartment());
            }
        });
        for(Student student : records) {
            System.out.println(student);
            System.out.println("___________");
        }
        return records;

    }
}
