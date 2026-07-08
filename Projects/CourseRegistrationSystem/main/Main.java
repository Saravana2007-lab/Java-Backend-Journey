package Projects.CourseRegistrationSystem.main;

import Projects.CourseRegistrationSystem.model.Course;
import Projects.CourseRegistrationSystem.model.Student;
import Projects.CourseRegistrationSystem.service.RegistrationService;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("S101", "Saravana", "IT");
        Course course1 = new Course("C101", "Java Programming", 3);

        Student student2 = new Student("S102", "Boovan", "ECE");
        Course course2 = new Course("C102", "CAD", 2);

        Student student3 = new Student("S103", "Aaron", "AI/ML");
        Course course3 = new Course("C103", "AI", 3);

        RegistrationService registrationService = new RegistrationService();
        registrationService.register(student1, course1);
        registrationService.register(student2, course2);
        registrationService.register(student3, course3);
    }
}
