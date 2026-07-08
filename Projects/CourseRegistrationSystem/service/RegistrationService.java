package Projects.CourseRegistrationSystem.service;

import Projects.CourseRegistrationSystem.model.Course;
import Projects.CourseRegistrationSystem.model.Student;

public class RegistrationService {
    public void register(Student student, Course course) {
        System.out.println("Student Details");
        student.displayStudent();

        System.out.println("Course Details");
        course.displayCourse();

        System.out.println("Registration Successful");
        System.out.println("Student : " + student.getName());
        System.out.println("Course : " + course.getCourseName());
        System.out.println("-------------------------");
    }
}
