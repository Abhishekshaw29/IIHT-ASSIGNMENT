package assignment5.studenthighestmarks;

public class Student {
    private Integer Id;
    private String StudentName;
    private String Branch;
    private Double Score;
    public Student(Integer id, String studentName, String branch, Double score) {
        Id = id;
        StudentName = studentName;
        Branch = branch;
        Score = score;
    }
    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        Id = id;
    }
    public String getStudentName() {
        return StudentName;
    }
    @Override
    public String toString() {
        return "Student [Branch=" + Branch + ", Id=" + Id + ", Score=" + Score + ", StudentName=" + StudentName + "]";
    }
    public void setStudentName(String studentName) {
        StudentName = studentName;
    }
    public String getBranch() {
        return Branch;
    }
    public void setBranch(String branch) {
        Branch = branch;
    }
    public Double getScore() {
        return Score;
    }
    public void setScore(Double score) {
        Score = score;
    }

      
}