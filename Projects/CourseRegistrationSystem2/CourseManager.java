package Projects.CourseRegistrationSystem2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CourseManager {
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    private List<Registration> registrations = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

public void registration() {
    System.out.println("enter your student id");
    String studentID = sc.nextLine();
    System.out.println("enter your course id");
    String courseID = sc.nextLine();

    Student foundStudent = null;
    Course foundCourse = null;

    for (Student s : students) {
        if (s.getStudentid().equals(studentID)) {
            foundStudent = s;
            break;
        }
    }

    for (Course c : courses) {
        if (c.getCourseId().equals(courseID)) {
            foundCourse = c;
            break;
        }
    }

    if (foundStudent == null || foundCourse == null) {
        System.out.println("Registration can't be done");
        return;
    }

    Registration newReg = new Registration(foundStudent, foundCourse);
    registrations.add(newReg);
    System.out.println("Registration successful!");
    newReg.displayreg();
}

    public void searchcourse(String courseID) {
        for (Course s : courses) {
            if (s.getCourseId().equals(courseID)) {
                System.out.println("course Found");
                System.out.println(s);
                return;
            }
        }
        System.out.println("Course Not Found");
    }

    public void search(String studentId) {
        for (Student s : students) {
            if (s.getStudentid().equals(studentId)) {
                System.out.println("Student Found");
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student Not Found");
    }

    public boolean addStudent(Student newStudent) {
        for (Student s : students) {
            if (s.getStudentid().equals(newStudent.getStudentid())) {
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

    public void display_students() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void display_courses() {
        for (Course c : courses) {
            System.out.println(c);
        }
    }

    public void deletestudent(String studentid) {
        for (Student s : students) {
            if (s.getStudentid().equals(studentid)) {
                students.remove(s);
                System.out.println("Student removed");
                return;
            }
        }
        System.out.println("Student not found");
    }

    public void deleteCourse(String courseid) {
        for (Course c : courses) {
            if (c.getCourseId().equals(courseid)) {
                courses.remove(c);
                System.out.println("Course removed");
                return;
            }
        }
        System.out.println("Course not found");
    }
}
