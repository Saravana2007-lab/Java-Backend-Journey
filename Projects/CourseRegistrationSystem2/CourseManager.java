package Projects.CourseRegistrationSystem2;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public void search(String studentId) {
        for (Student s : students) {
            if (s.getid().equals(studentId)) {
                System.out.println("Student Found");
                s.Stringto();
                return;
            }
        }
        System.out.println("Student Not Found");
    }

    public boolean addStudent(Student newStudent) {
        for (Student s : students) {
            if (s.getid().equals(newStudent.getid())) {
                System.out.println("Student ID already exists!");
                return false;
            }
        }
        students.add(newStudent);
        System.out.println("Student added successfully");
        return true;
    }

    public boolean addCourse(Course newCourse) {
        for (Course c : courses) {
            if (c.getCourseId().equals(newCourse.getCourseId())) {
                System.out.println("Course ID already exists!");
                return false;
            }
        }
        courses.add(newCourse);
        System.out.println("Course added successfully");
        return true;
    }
    public void display_studets(){
        for(Student s: students){
            System.out.println(s);
        }
    }

    public void display_course(){
        for(Course c : courses){
            System.out.println(c);
        }
    }
}
