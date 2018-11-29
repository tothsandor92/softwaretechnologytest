import java.util.ArrayList;
import java.util.Collection;

public class Teacher extends UniversityPerson implements CanViewCourse, CanSendMessage {


    String department;
    private Collection<Course> courses= new ArrayList<>();

    @Override
    public void sendMessage(String msg, UniversityPerson universityPerson) {
        for (Course course: courses
        ) {
            if (course.getStudentCollection().contains(universityPerson)){
                //TODO send message
                System.out.println("Message sent!");
                return;
            }
            System.out.println("You can only send messages to your students!");


        }
    }

    @Override
    public void viewCourses() {
        for (Course course: courses
        ) {
            System.out.println(course);
        }
    }
}
