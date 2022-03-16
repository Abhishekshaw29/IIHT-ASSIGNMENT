package assignment5.studenthighestmarks;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> records = new ArrayList<Student>();
        Student ob = new Student(001,"Abhi","EE",100.0);
        Student ob1 = new Student(002,"Rohan","EE",50.0);
        Student ob2 = new Student(003,"Priya","EE",60.0);
        Student ob3 = new Student(004,"Panda","EE",10.0);
        records.add(ob);
        records.add(ob1);
        records.add(ob2);
        records.add(ob3);
        Student topper = highestMarks(records);
        System.out.println(topper.toString());

    }
    public static Student highestMarks(List<Student> records){
        Student temp = new Student(0,"null","null",0.0);
        for (Student student : records) {
            if((student.getScore()) >= (temp.getScore())){
                temp = student;
            }
        }
        return temp;

    }
}
