package assignment5.employeemanagement;

public class Main {
    public static void main(String[] args) {
        Employee ob = new Employee(1, "empName", "empDesig", "empDept");
        Employee ob1 = new Employee();
        ob1.setEmpid(2);
        ob1.setEmpName("Rohan");
        ob1.setEmpDesig("Emp");
        ob1.setEmpDept("EE");
        System.out.println(ob1.getEmpDept());

        
        
    }
    
}
