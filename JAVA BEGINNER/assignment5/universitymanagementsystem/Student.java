package assignment5.universitymanagementsystem;

public class Student {
  private int studentId;
  private String studentName;
  private float marks;
  private boolean secondChance;

  public Student(int studentId, String studentName, boolean secondChance) {
    this.studentId = studentId;
    this.studentName = studentName;
    this.secondChance = secondChance;
  }

  public boolean isSecondChance() {
    return secondChance;
  }

  public void setSecondChance(boolean secondChance) {
    this.secondChance = secondChance;
  }

  public int getStudentId() {
    return studentId;
  }

  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public float getMarks() {
    return marks;
  }

  public void setMarks(float marks) {
    this.marks = marks;
  }

  public void identifyMarks(float mark) {
    marks = mark;
    setMarks(mark);

  }

  public void identifyMarks(float mark1, float mark2) {

    float mark = Math.max(mark1, mark2);
    setMarks(mark);
  }

}
