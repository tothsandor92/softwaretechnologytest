import java.util.ArrayList;
import java.util.Collection;

public class Student extends UniversityPerson implements CanViewCourse, CanSendMessage {

    String studyProgram;
    private Collection<Course> courses= new ArrayList<>();


    @Override
    public void sendMessage(String msg, UniversityPerson universityPerson) {
        for (Course course: courses
             ) {
            if (universityPerson.equals(course.getTeacher())){
                //TODO send message
                System.out.println("Message sent!");
                return;
            }
           System.out.println("You can only send messages to your teachers!");


        }
    }

    @Override
    public void viewCourses() {
        for (Course course: courses
             ) {
            System.out.println(course);
        }
    }

    public void enrolOnCourse(Course course){
        courses.add(course);
    }




}
