package assignment5.employeemanagement;

public class Employee {
    int empid;
    String empName;
    String empDesig;
    String empDept;
    public Employee(int empid, String empName, String empDesig, String empDept) {
        this.empid = empid;
        this.empName = empName;
        this.empDesig = empDesig;
        this.empDept = empDept;
    }
    public int getEmpid() {
        return empid;
    }
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        if(empName.equals(null)){
            System.out.println("Error in Name");
        }
        this.empName = empName;
    }
    public String getEmpDesig() {
        return empDesig;
    }
    public void setEmpDesig(String empDesig) {
        if(empDesig.equals("developer") || empDesig.equals("tester") || empDesig.equals("Lead") ||  empDesig.equals("Manager")){
            this.empDesig = empDesig;
        }
        else{
            System.out.println("Invalid Desgination");
        }
   
    }
    public String getEmpDept() {
        return empDept;
    }
    public void setEmpDept(String empDept) {
        if(empDept.equals("TTH") || empDept.equals("RCM") || empDept.equals("DevOps") ||  empDept.equals("Digital")){
            this.empDept = empDept;
        }
        else{
            System.out.println("Invalid department");
        }

        
    }
    public Employee() {
    }

    

    
}
