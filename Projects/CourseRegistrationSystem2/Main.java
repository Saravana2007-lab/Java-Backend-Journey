package Projects.CourseRegistrationSystem2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CourseManager cm = new CourseManager();
        Student s1 = new Student("S101", "Saravana", 10, "it");
        cm.addStudent(s1);

        do {
            System.out.println("-------Menu--------");
            System.out.println("1.New Student");
            System.out.println("2.New Course");
            System.out.println("3.Display all Students");
            System.out.println("4.Display all Courses");
            System.out.println("5.Registration of student");
            System.out.println("6.Delete Course");
            System.out.println("7.Delete Student");
            System.out.println("8.Search Student");
            System.out.println("9.Search Course");
            System.out.println("10.Exit");
            int a = sc.nextInt();
            sc.nextLine();
            switch (a) {
                case 1:
                    System.out.println("Enter Student ID:");
                    String id = sc.next();
                    System.out.println("Enter Student Name:");
                    String name = sc.next();
                    System.out.println("Enter Age:");
                    int age = sc.nextInt();
                    System.out.println("Enter Department:");
                    String dept = sc.next();
                    Student newStudent = new Student(id, name, age, dept);
                    cm.addStudent(newStudent);
                    break;
                case 2:
                    System.out.println("Enter Course ID:");
                    String cid = sc.next();
                    System.out.println("Enter Course Name:");
                    String cname = sc.next();
                    System.out.println("Enter Credits:");
                    int credits = sc.nextInt();
                    System.out.println("Enter Faculty:");
                    String faculty = sc.next();
                    Course newCourse = new Course(cid, cname, credits, faculty);
                    cm.addCourse(newCourse);
                    break;
                case 3:
                    cm.display_students();
                    break;
                case 4:
                    cm.display_courses();
                    break;
                case 5:
                    cm.registration();
                    break;
                case 6:
                    System.out.println("Enter Course ID:");
                    String courseid = sc.next();
                    cm.deleteCourse(courseid);
                    break;
                case 7:
                    System.out.println("Enter Student ID:");
                    String studentid = sc.next();
                    cm.deletestudent(studentid);
                    break;
                case 8:
                    System.out.println("Enter Student ID:");
                    String studentId = sc.next();
                    cm.search(studentId);
                    break;
                case 9:
                    System.out.println("Enter Course ID:");
                    String courseId = sc.next();
                    cm.searchcourse(courseId);
                    break;
                case 10:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        } while (true);
    }
}
