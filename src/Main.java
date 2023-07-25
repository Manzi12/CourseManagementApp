import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CourseManager cm = new CourseManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the course management app");

        while (true){
            System.out.println("1. Add a Course");
            System.out.println("2. Display all Courses");
            System.out.println("3. Exit");
            System.out.println("Enter your choice, 1/2/3");
            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice){
                case 1:
                    System.out.println("Enter the course name");
                    String courseName = scanner.nextLine();
                    System.out.println("Enter your Instuctor's name");
                    String instructor = scanner.nextLine();
                    System.out.println("Please enter your credits");
                    int credit = scanner.nextInt();

                    Course course = new Course(courseName,instructor,credit);
                    cm.addCourse(course);
                    System.out.println("Course added successfully");
                    break;

                case 2:
                    cm.displayCourses();
                    break;

                case 3:
                    System.out.println("Exiting the app.. Goodbye");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. please try again ");
            }
        }
    }



}