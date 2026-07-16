package Projects.CourseRegistrationSystem2;

public class Registration {
    private Student student;
    private Course course;

    public Registration(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public void displayreg() {
        System.out.println("Student: " + student.getStudentid() + " - " + student.getStudentname());
        System.out.println("Course: " + course.getCourseId() + " - " + course.getCourseName());
        System.out.println("Credits: " + course.getCredits());
        System.out.println("Faculty: " + course.getFaculty());
    }

    @Override
    public String toString() {
        return "Registration{" +
                "student=" + student +
                ", course=" + course +
                '}';
    }
}
