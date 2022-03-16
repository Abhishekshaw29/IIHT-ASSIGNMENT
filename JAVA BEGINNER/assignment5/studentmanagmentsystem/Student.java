package assignment5.studentmanagmentsystem;

public class Student {
        private String  studentName;
        private Integer  studentId;
        private String  Department;
        public static int count=0;

        public Student(String studentName, Integer studentId, String department) {
            this.studentName = studentName;
            this.studentId = studentId;
            Department = department;
        }

        public String getStudentName() {
            return studentName;
        }

        @Override
        public String toString() {
            count++;
            return "Student"+count+"[Department=" + Department + ", studentId=" + studentId + ", studentName=" + studentName
                    + "]";
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public Integer getStudentId() {
            return studentId;
        }

        public void setStudentId(Integer studentId) {
            this.studentId = studentId;
        }

        public String getDepartment() {
            return Department;
        }

        public void setDepartment(String department) {
            Department = department;
        }
      
}