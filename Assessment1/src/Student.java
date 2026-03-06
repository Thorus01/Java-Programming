/**
 * Class representing a student
 * Version: 1
 */
public class Student
{
    // code your task 2a here
    private String studentName;
    private int studentId;
    private double studentWam;

    public Student()
    {
        studentName = "";
        studentId = 0;
        studentWam = 0;
    }

    public Student(String studentName, int studentId, double studentWam)
    {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentWam = studentWam;
    }

    public int getStudentId()
    {
        return studentId;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public double getStudentWam()
    {
        return studentWam;
    }

    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public void setStudentWam(double studentWam)
    {
        this.studentWam = studentWam;
    }
}
