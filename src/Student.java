import java.util.HashMap;
import java.util.Map;

public class Student {
    private String studentName;
    private int studentId;
    private Map<String, Integer> courseMarks;


    public Student(String studentName, int studentId){
        this.studentName = studentName;
        this.studentId = studentId;
        this.courseMarks = new HashMap<>();
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public String getStudentName(){
        return studentName;
    }

    public Map<String, Integer> getCourseMarks(){
        return courseMarks;
    }

    public int getStudentId(){
        return studentId;
    }

    public void addCourseMark(String courseName, int mark){
        courseMarks.put(courseName,mark);
    }

    @Override
    public String toString() {
        return "Student{" +
                "student Name='" + studentName + '\'' +
                ", Student Id=" + studentId +
                ", Course Marks=" + courseMarks +
                '}';
    }
}
