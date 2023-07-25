public class Course {
    private String courseName;
    private String instructor;
    private int credits;

    public Course(String courseName, String instructor, int credits){
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public void setInstructor(String instructor){
        this.instructor = instructor;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getCourseName(){
        return courseName;
    }

    public String getInstructor(){
        return instructor;
    }

    public int getCredits(){
        return credits;
    }

    public String toString(){
        return "Course: " + getCourseName() + ", Instructor: " + getInstructor() + ", Credits: " + getCredits();
    }
}
