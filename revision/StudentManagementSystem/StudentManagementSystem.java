package revision.StudentManagementSystem;

import java.util.Scanner;

public class StudentManagementSystem {
    static class Student {
        String name;
        int age;
        int[] marks = new int[3];
        double average;
        String result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();

            System.out.println("\nStudent " + (i + 1));
            System.out.print("Name: ");
            students[i].name = sc.nextLine();

            System.out.print("Age: ");
            students[i].age = sc.nextInt();

            System.out.println("Enter 3 subject marks:");
            for (int j = 0; j < 3; j++) {
                int mark;
                do {
                    mark = sc.nextInt();
                    if (mark < 0 || mark > 100) {
                        System.out.print("Invalid mark. Enter a mark from 0 to 100: ");
                    }
                } while (mark < 0 || mark > 100);

                students[i].marks[j] = mark;
            }

            students[i].average = calculateAverage(students[i].marks);
            students[i].result = determineResult(students[i].average, students[i].marks);
        }

        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            System.out.println(s.name + " | Age: " + s.age + " | Avg: " + s.average + " | " + s.result);
        }

        if (getStudentCount(students) > 0) {
            Student topper = findTopper(students);
            System.out.println("\nTopper: " + topper.name + " with Avg " + topper.average);
        } else {
            System.out.println("\nNo students available.");
        }

        sc.nextLine();
        System.out.print("Enter student name to search: ");
        String searchName = sc.nextLine();
        Student foundStudent = searchStudent(students, searchName);
        if (foundStudent != null) {
            System.out.println("Student found");
            System.out.println("Name: " + foundStudent.name);
            System.out.println("Age: " + foundStudent.age);
            System.out.printf("Average: %.2f%n", foundStudent.average);
            System.out.println("Result: " + foundStudent.result);
        } else {
            System.out.println("Student not found");
        }

        sc.close();
    }

    static double calculateAverage(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return (double) total / marks.length;
    }

    static String determineResult(double average, int[] marks) {
        return average >= 40 && allPassed(marks) ? "Pass" : "Fail";
    }

    static Student findTopper(Student[] students) {
        Student topper = students[0];
        for (Student student : students) {
            if (student.average > topper.average) {
                topper = student;
            }
        }
        return topper;
    }

    static Student searchStudent(Student[] students, String searchName) {
        for (Student student : students) {
            if (student.name.toLowerCase().contains(searchName.toLowerCase())) {
                return student;
            }
        }
        return null;
    }

    static int getStudentCount(Student[] students) {
        return students.length;
    }

    static boolean allPassed(int[] marks) {
        for (int m : marks) {
            if (m < 35) return false;
        }
        return true;
    }
}
