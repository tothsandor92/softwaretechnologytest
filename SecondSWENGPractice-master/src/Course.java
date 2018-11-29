import java.util.ArrayList;
import java.util.Collection;

public class Course {

    private String courseName;
    private int courseID;
    private Teacher teacher;
    private Collection<Student> studentCollection= new ArrayList<>();

    public Course(String courseName, int courseID, Teacher teacher, Collection<Student> studentCollection) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.teacher = teacher;
        this.studentCollection = studentCollection;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseID() {
        return courseID;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Collection<Student> getStudentCollection() {
        return studentCollection;
    }




}
