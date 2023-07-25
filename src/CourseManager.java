import java.util.ArrayList;

public class CourseManager {
    private ArrayList<Course> courses;

    public CourseManager(){
        courses = new ArrayList<>();
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public void displayCourses(){
        if(courses.isEmpty()){
            System.out.println("There are no courses found");
            return;
        }

        System.out.println("Courses below ");
        for (Course course : courses){
            System.out.println(course);
        }

    }
}
